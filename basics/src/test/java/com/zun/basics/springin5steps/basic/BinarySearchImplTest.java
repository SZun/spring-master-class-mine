package com.zun.basics.springin5steps.basic;

import com.zun.basics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
// @ContextConfiguration(locations = "/applicationContext.xml")
public class BinarySearchImplTest {

    @Autowired
    private BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario(){
        int res = binarySearch.binarySearch(new int[]{}, 5);
        assertEquals(3, res);
    }

}