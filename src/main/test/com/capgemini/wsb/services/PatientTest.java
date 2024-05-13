package com.capgemini.wsb.services;

import com.capgemini.wsb.dto.AddressDto;
import com.capgemini.wsb.dto.DoctorDto;
import com.capgemini.wsb.dto.PatientDto;
import com.capgemini.wsb.dto.VisitDto;
import com.capgemini.wsb.service.impl.DoctorService;
import com.capgemini.wsb.service.impl.PatientService;
import com.capgemini.wsb.service.impl.VisitService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientTest {
    @Autowired
    private PatientService patientService;
    @Autowired
    private VisitService visitService;
    @Autowired
    private DoctorService doctorService;
    @Transactional
    @Test
    public void shouldRemovePatientAndHisVisitsButDoesntRemoveDoctors() {
        //given
        final Long patientId = 1L;
        List<VisitDto> patientsVisits = visitService.getListForPatient(patientId);
        //when
        patientService.delete(patientId);
        //then
        for(VisitDto v : patientsVisits)
        {
            Assert.assertThrows(NullPointerException.class,() ->visitService.get(v.getId())); //Check visit not exists
            Assert.assertNotNull(doctorService.get(v.getDoctor().getId())); //Check doctor still exists
        }
    }
    @Transactional
    @Test
    public void shouldReturnAllDtoStructureWhenPatientGet()
    {
        //given
        final Long patientId = 4L;
        final Long expectedPesel = 95112524680L;
        final String expectedSex = "MALE";
        final String expectedAddress = "{id: 14, ad1: 567 Pine Rd, ad2: Unit B, postalCode: 50-004}";
        final int expectedNumberOfVisits = 2;
        final String expectedDoctorNameInFirstVisit = "Emily Brown";
        //when
        PatientDto patientDto = patientService.get(patientId);
        //then
        Assert.assertEquals(expectedAddress,patientDto.getAddressDto().toString());
        Assert.assertEquals(expectedSex,patientDto.getSex().toString());
        Assert.assertEquals(expectedPesel,patientDto.getPeselNumber());
        Assert.assertEquals(expectedNumberOfVisits,patientDto.getVisits().size());
        Assert.assertEquals(expectedDoctorNameInFirstVisit,patientDto.getVisits().get(0).getDoctor().getName());
    }
    @Transactional
    @Test
    public void shouldReturnAllVisitAssignedToPatientWhenHisIdWasPassed()
    {
        //given
        final Long patientId = 1L;
        final int expectedNumberOfVisits = 4;
        //when
        List<VisitDto> patientVisits = patientService.getListOfPatientsVisits(patientId);
        //then
        Assert.assertEquals(expectedNumberOfVisits, patientVisits.size());
    }

}
