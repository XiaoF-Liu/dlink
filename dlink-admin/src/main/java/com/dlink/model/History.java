package com.dlink.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * History
 *
 * @author wenmo
 * @since 2021/6/26 22:48
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dlink_history")
public class History implements Serializable {

    private static final long serialVersionUID = 4058280957630503072L;

    private Integer id;
    private Integer clusterId;
    private String session;
    private String jobId;
    private String jobName;
    private String jobManagerAddress;
    private Integer status;
    private String statement;
    private Integer type;
    private String error;
    private String result;
    private String config;
    private LocalDate startTime;
    private LocalDate endTime;
    private String msg;
    private Integer taskId;
    private String statusText;
}