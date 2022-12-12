package com.study.config.log.services;

public interface IFunctionService {
    String apply(String functionName, String value);


    boolean beforeFunction(String functionName);
}
