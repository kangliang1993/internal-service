package com.internal.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class NewsListModel {
    private Long id;

    private String title;

    private Date createTime;

    private Integer pageView;

    private String shortContent;

    private String titleImage;

    private String content;

}
