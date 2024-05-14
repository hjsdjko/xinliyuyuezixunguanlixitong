package com.dao;

import com.entity.BingzhengCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BingzhengCollectionView;

/**
 * 常见病症收藏 Dao 接口
 *
 * @author 
 */
public interface BingzhengCollectionDao extends BaseMapper<BingzhengCollectionEntity> {

   List<BingzhengCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
