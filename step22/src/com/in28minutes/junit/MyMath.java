package com.in28minutes.junit;

public class MyMath {
	int sum(int[] nums) {
		return Arrays.stream(nums).sum();
	}
}
