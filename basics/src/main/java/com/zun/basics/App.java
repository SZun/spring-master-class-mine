package com.zun.basics;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int i = binarySearch.binarySeach(new int[]{12, 4, 6}, 3);
		System.out.println(i);

		//SpringApplication.run(App.class, args);
	}

}
