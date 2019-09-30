package com.internal.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.internal.dao.front.entity.News;
import com.internal.service.NewsService;
import com.internal.vo.NewsListModel;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author kl
 * @since 2019-09-27
 */
@RestController
@RequestMapping("front/news")
@Slf4j
public class NewsController {

    @Resource
    private NewsService newsService;

    @GetMapping(value = "getIndexNews")
    @ApiOperation(value = "首页新闻")
    public List<NewsListModel> getIndexNews() {
        return newsService.getIndexNews();
    }

    @GetMapping(value = "getNewsPage")
    @ApiOperation(value = "分页获取新闻信息列表")
    public IPage<NewsListModel> getNewsPage(Page page) {
        return newsService.getNewsPage(page);
    }

    @GetMapping(value = "getDetail/{id}")
    @ApiOperation(value = "新闻详情",notes = "信息详情，使用content字段渲染页面")
    @ApiImplicitParam(paramType = "path", name = "id", value = "新闻id")
    public News getDetail(@PathVariable Long id) {
        return newsService.getNewsDetail(id);
    }


    @GetMapping(value = "getCompanyDetail")
    @ApiOperation(value = "公司概况",notes = "返回list,使用titleImage字段渲染页面")
    public List<NewsListModel> getCompanyList() {
        return newsService.getCompanyList();
    }

    @GetMapping(value = "getJoinList")
    @ApiOperation(value = "人才招聘", notes = "返回list，根据getDetail接口获取详情")
    public List<NewsListModel> getJoinList() {
        return newsService.getJoinList();
    }

    @GetMapping(value = "getAboutUs")
    @ApiOperation(value = "商务合作", notes = "只返回一条信息，使用content渲染页面")
    public News getAboutUs() {
        return newsService.getAboutUs();
    }


}
