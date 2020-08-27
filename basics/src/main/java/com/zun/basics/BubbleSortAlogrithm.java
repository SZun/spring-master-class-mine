package com.zun.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlogrithm implements SortAlgorithm {

    public int[] sort(int[] nums){
        return nums;
    }

}
