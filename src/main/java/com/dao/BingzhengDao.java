package com.dao;

import com.entity.BingzhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BingzhengView;

/**
 * 常见病症 Dao 接口
 *
 * @author 
 */
public interface BingzhengDao extends BaseMapper<BingzhengEntity> {

   List<BingzhengView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
