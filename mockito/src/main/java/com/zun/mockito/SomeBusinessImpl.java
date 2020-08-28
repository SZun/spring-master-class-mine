package com.zun.mockito;

import java.util.Arrays;

public class SomeBusinessImpl {

    private final DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findGreatest(){
        int[] ints = dataService.retrieveAllData();
        return Arrays.stream(ints).max().orElse(Integer.MIN_VALUE);
    }

}
