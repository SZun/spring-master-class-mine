package com.zun.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;

    public int binarySeach(int[] nums, int item){

        int[] sortedNums = bubbleSortAlgorithm.sort(nums);
        System.out.println(bubbleSortAlgorithm.getClass().getSimpleName());

        return 3;
    }
}
