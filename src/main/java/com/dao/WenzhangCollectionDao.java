package com.dao;

import com.entity.WenzhangCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhangCollectionView;

/**
 * 心理文章收藏 Dao 接口
 *
 * @author 
 */
public interface WenzhangCollectionDao extends BaseMapper<WenzhangCollectionEntity> {

   List<WenzhangCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
