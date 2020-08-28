package com.zun.springaop.data;

import com.zun.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retrieveSomething(){
        return this.getClass().getSimpleName();
    }

}
