package service.impl;

import com.internal.dao.front.entity.News;
import com.internal.dao.front.mapper.NewsMapper;
import service.NewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lips
 * @since 2019-09-27
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

}
