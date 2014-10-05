package com.bachat.models;

/**
 * Created by somesh.shrivastava on 05/10/14.
 */
public enum Days {
     SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

    @Override
    public String toString(){
        String s = super.toString();
        return s.substring(0, 1) + s.substring(1).toLowerCase();
    }
}
