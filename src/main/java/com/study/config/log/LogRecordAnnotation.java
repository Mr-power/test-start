package com.study.config.log;


import java.lang.annotation.*;




//https://github.com/gengzi/logrecord/blob/master/log-record-autoconfig/src/main/java/fun/gengzi/autocinfig/EnableLogRecord.java
//
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface LogRecordAnnotation {
    /**
     * 操作日志的文本模板
     *
     * @return
     */
    String success();
    /**
     * 操作日志失败的文本版本
     *
     * @return
     */
    String fail() default "";
    /**
     * 操作日志的执行人
     *
     * @return
     */
    String operator() default "";
    /**
     * 操作日志绑定的业务对象标识
     *
     * @return
     */
    String bizNo();
    /**
     * 操作日志的种类
     *
     * @return
     */
    String category() default "";
    /**
     * 扩展参数，记录操作日志的修改详情
     *
     * @return
     */
    String detail() default "";
    /**
     * 记录日志的条件
     *
     * @return
     */
    String condition() default "";

    /**
     * 前缀标记
     * @return
     */
    String prefix() default "";
}
