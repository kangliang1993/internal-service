package com.internal.dao.front.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.internal.dao.front.entity.News;
import com.internal.vo.NewsListModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author lips
 * @since 2019-09-27
 */
public interface NewsMapper extends BaseMapper<News> {

    IPage<NewsListModel> getNewsPage(Page page, @Param("type") Integer type);

    List<NewsListModel> selectListByTypeAndLimit(@Param("type")int type,@Param("limit") int limit);
}
