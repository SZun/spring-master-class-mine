package com.zun.basics.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public int binarySeach(int[] nums, int item){

        int[] sortedNums = sortAlgorithm.sort(nums);
        System.out.println(sortAlgorithm.getClass().getSimpleName());

        return 3;
    }

    @PostConstruct
    public void postCounstruct(){
        LOGGER.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        LOGGER.info("preDestroy");
    }
}
