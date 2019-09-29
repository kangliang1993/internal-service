package com.internal.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.internal.dao.front.entity.News;
import com.internal.vo.NewsListModel;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lips
 * @since 2019-09-27
 */
public interface NewsService extends IService<News> {

    IPage<NewsListModel> getNewsPage(Page page);

    News getNewsDetail(Long id);

    List<NewsListModel> getCompanyList();

    List<NewsListModel> getIndexNews();

    List<NewsListModel> getJoinList();

    News getAboutUs();
}
