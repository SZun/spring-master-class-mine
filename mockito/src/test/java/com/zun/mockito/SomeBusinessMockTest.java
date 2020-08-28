package com.zun.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockTest {

    @Mock
    private DataService dataService;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void findGreatest() {
        when(dataService.retrieveAllData()).thenReturn(new int[]{24, 6, 15});
        assertEquals(24, businessImpl.findGreatest());
    }

    @Test
    void findGreatestOneVal() {
        when(dataService.retrieveAllData()).thenReturn(new int[]{1});
        assertEquals(1, businessImpl.findGreatest());
    }

    @Test
    void findGreatestNoVals() {
        when(dataService.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, businessImpl.findGreatest());
    }

}