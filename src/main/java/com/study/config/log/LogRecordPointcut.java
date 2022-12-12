package com.study.config.log;

import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.lang.reflect.Method;

public class LogRecordPointcut extends StaticMethodMatcherPointcut implements Serializable {
    // LogRecord的解析类
    private LogRecordOperationSource logRecordOperationSource;
    @Override
    public boolean matches(Method method, Class<?> aClass) {
        return CollectionUtils.isEmpty(logRecordOperationSource.computeLogRecordOperations(method, aClass));
    }

    void setLogRecordOperationSource(LogRecordOperationSource logRecordOperationSource) {
        this.logRecordOperationSource = logRecordOperationSource;
    }
}
