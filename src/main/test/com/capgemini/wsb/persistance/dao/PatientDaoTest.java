package com.capgemini.wsb.persistance.dao;

import com.capgemini.wsb.persistence.dao.interfaces.IPatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest {
    @Autowired
    private IPatientDao patientDao;

    @Transactional
    @Test
    public void shouldReturnListOfPatientsWithDefinedLastname()
    {
        //given
        final String specifiedLastName = "Johnson";
        final int numberOfPatientWithJohnsonLastname = 2;
        //when
        List<PatientEntity> patientsWithJohnsonLastname = patientDao.getAllPatientsWithSpecifiedLastname(specifiedLastName);
        //then
        Assert.assertEquals(numberOfPatientWithJohnsonLastname,patientsWithJohnsonLastname.size());
    }
}
