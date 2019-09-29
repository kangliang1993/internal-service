package com.internal.dao.front.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author lips
 * @since 2019-09-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("front_news")
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String title;

    private Date createTime;

    private Date updateTime;

    private Boolean delFlag;

    private Boolean showFlag;

    private Integer pageView;

    private String shortContent;

    private String titleImage;

    private Integer type;

    private String content;

    private String display;

}
