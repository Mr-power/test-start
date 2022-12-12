package com.study.config.log;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;

public class LogRecordPointcutAdvisor extends AbstractBeanFactoryPointcutAdvisor {
    private Pointcut pointcut;
    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }
    public LogRecordPointcutAdvisor() {
    }

    /**
     * 初始化pointcut  和 advice
     *
     * @param pointcut
     * @param advice
     */
    public LogRecordPointcutAdvisor(Pointcut pointcut, Advice advice) {
        this.pointcut = pointcut;
        setAdvice(advice);
    }

    public void setPointcut(Pointcut pointcut) {
        this.pointcut = pointcut;
    }
}
