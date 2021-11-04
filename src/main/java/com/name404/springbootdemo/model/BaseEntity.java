package com.name404.springbootdemo.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass //不会被映射到数据库，而会作为父类的字段到其他子类数据库内
public class BaseEntity implements Serializable{

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    @Column(name = "create_time", nullable = false, updatable = false)
    @CreatedDate
    private Long createTime;

    /**
     * 上次更新时间
     */
    @Column(name = "update_time", nullable = false)
    @LastModifiedDate
    private Long updateTime;

    /**
     * 是否已被删除
     */
    @Column(name = "is_del")
    private Boolean isDel;
}