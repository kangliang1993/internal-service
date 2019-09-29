package com.internal.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.internal.common.exception.InternalException;
import com.internal.common.type.Constants;
import com.internal.dao.front.entity.News;
import com.internal.dao.front.mapper.NewsMapper;
import com.internal.service.NewsService;
import com.internal.vo.NewsListModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lips
 * @since 2019-09-27
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

    @Resource
    private NewsMapper newsMapper;

    public IPage<NewsListModel> getNewsPage(Page page) {
        return newsMapper.getNewsPage(page, Constants.NewsType.NEWS);
    }

    public News getNewsDetail(Long id) {
        News news = newsMapper.selectById(id);
        if (null == news || news.getDelFlag() || !news.getShowFlag()) {
            throw InternalException.create("信息不存在");
        }
        return news;
    }

    public List<NewsListModel> getCompanyList() {
        return newsMapper.selectListByTypeAndLimit(Constants.NewsType.COMPANY, 0);
    }

    public List<NewsListModel> getIndexNews() {
        return newsMapper.selectListByTypeAndLimit(Constants.NewsType.NEWS, 5);
    }

    public List<NewsListModel> getJoinList() {
        return newsMapper.selectListByTypeAndLimit(Constants.NewsType.JOIN, 0);
    }

    public News getAboutUs() {
        return newsMapper.selectOne(new QueryWrapper<News>().eq("type", Constants.NewsType.AboutUs)
                .eq("del_flag", 0).eq("show_flag", 1).orderByDesc("display")
                .last(" LIMIT 1"));
    }
}
