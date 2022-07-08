package com.xd.pre.modules.sys.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_test")
public class SysTest extends Model<SysTest> {
    private static final long serialVersionUID = 1L;
    /**
     * 主键Id
     */
    @TableId(value = "test_id", type = IdType.AUTO)
    private Integer testid;

    /**
     * 名称
     */
    private String username;

    /**
     * 性别
     */
    private String sex;
    /**
     *年龄
     */
    private String age;
    /**
     * 时间
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime time;
    /**
     * 备注
     */
    private  String introduce;
    /**
     * 地区
     */
    private String area;
}
