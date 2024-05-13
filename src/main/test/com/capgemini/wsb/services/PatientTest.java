package com.capgemini.wsb.services;

import com.capgemini.wsb.dto.DoctorDto;
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

}
