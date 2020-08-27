package com.zun.basics;

public class BinarySearchImpl {

    private final SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySeach(int[] nums, int item){

        int[] sortedNums = sortAlgorithm.sort(nums);
        System.out.println(sortAlgorithm.getClass().getSimpleName());

        return 3;
    }

}
