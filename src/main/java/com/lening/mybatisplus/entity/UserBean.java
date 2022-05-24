package com.lening.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 映射关系，就是这个实体类和数据库中那个表示对应的
 * 默认就用实体类的名字，是表名字，我们不一样，导致没有找到
 * 通用mapper没有自己的注解，所以使用的是jpa的注解，但是我们的mp有自己的注解
 * 所以必须使用自己的注解
 */
@Data
@TableName(value = "user")
public class UserBean implements Serializable {
    @TableId(type = IdType.ID_WORKER)
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;
}
