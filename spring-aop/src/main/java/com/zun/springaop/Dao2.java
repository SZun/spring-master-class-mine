package com.zun.springaop;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

    public String retrieveSomething(){
        return this.getClass().getSimpleName();
    }

}
