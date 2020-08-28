package com.zun.basics.springin5steps.cdi;

import com.zun.basics.springin5steps.SpringIn5StepsCdiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = SpringIn5StepsCdiApplication.class)
public class SomeCdiBusinessTest {

    @InjectMocks
    private SomeCdiBusiness someCdiBusiness;

    @Mock
    private SomeCdiDao dao;

    @Test
    public void getSomeCDIDAO() {
    }

    @Test
    public void setSomeCDIDAO() {
    }

    @Test
    public void findGreatest() {
        when(dao.getData()).thenReturn(new int[]{2,4});
        assertEquals(4, someCdiBusiness.findGreatest());
    }

    @Test
    public void findGreatestNoVals() {
        when(dao.getData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, someCdiBusiness.findGreatest());
    }

    @Test
    public void findGreatestEqual() {
        when(dao.getData()).thenReturn(new int[]{2,2});
        assertEquals(2, someCdiBusiness.findGreatest());
    }
}