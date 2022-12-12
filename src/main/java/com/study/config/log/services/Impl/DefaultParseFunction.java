package com.study.config.log.services.Impl;

import com.study.config.log.services.IParseFunction;

public class DefaultParseFunction implements IParseFunction {

    @Override
    public boolean executeBefore() {
        return true;
    }

    @Override
    public String functionName() {
        return null;
    }

    @Override
    public String apply(String value) {
        return null;
    }
}