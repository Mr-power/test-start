package com.study.config.log.services;

import com.study.config.log.LogRecordOps;

/**
 * <h1>用于保存日志</h1>
 */
public interface ILogRecordService {
    /**
     * 保存 log
     *
     * @param logRecord 日志实体
     */
    void record(LogRecordOps logRecord);

}

