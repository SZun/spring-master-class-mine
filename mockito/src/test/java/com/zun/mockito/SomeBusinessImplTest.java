package com.zun.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {

    @Test
    void findGreatest() {
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int res = businessImpl.findGreatest();
        assertEquals(24, res);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{24, 6, 15};
    }
}