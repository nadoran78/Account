package com.example.account;

import lombok.experimental.UtilityClass;

import javax.persistence.criteria.CriteriaBuilder;

@UtilityClass
public class NumberUtil {

    public static Integer sum(Integer a, Integer b) {
        return a + b;
    }

    public static Integer minus(Integer a, Integer b){
        return a - b;
    }
}
