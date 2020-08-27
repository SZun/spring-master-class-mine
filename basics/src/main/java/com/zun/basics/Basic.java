package com.zun.basics;

import com.zun.basics.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Basic {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Basic.class, args);

		BinarySearchImpl binarySearch = run.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 = run.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch2);

		int result = binarySearch.binarySeach(new int[]{12, 4, 6}, 3);
		System.out.println(result);
	}

}
