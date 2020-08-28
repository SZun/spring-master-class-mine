package com.zun.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    public String retrieveSomething(){
        return this.getClass().getSimpleName();
    }

}
