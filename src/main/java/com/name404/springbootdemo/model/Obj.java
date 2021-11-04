package com.name404.springbootdemo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class Obj extends BaseEntity {
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 文章封面
     */
    private String headImg;
    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章总点赞数
     */
    private Long totalLikeCount;

    /**
     * 文章标题
     */
    private String articleName;
}