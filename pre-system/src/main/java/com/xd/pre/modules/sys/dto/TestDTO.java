package com.xd.pre.modules.sys.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class TestDTO implements Serializable {
    private Integer testid;
    private String username;
    private String sex;
    private String age;
    private LocalDateTime time;
    private  String introduce;
}
