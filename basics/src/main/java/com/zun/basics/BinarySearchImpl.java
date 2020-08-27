package com.zun.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySeach(int[] nums, int item){

        int[] sortedNums = sortAlgorithm.sort(nums);
        System.out.println(sortAlgorithm.getClass().getSimpleName());

        return 3;
    }
}
