package com.entity.view;

import com.entity.BingzhengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 常见病症
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("bingzheng")
public class BingzhengView extends BingzhengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 常见病症类型的值
		*/
		private String bingzhengValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public BingzhengView() {

	}

	public BingzhengView(BingzhengEntity bingzhengEntity) {
		try {
			BeanUtils.copyProperties(this, bingzhengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 常见病症类型的值
			*/
			public String getBingzhengValue() {
				return bingzhengValue;
			}
			/**
			* 设置： 常见病症类型的值
			*/
			public void setBingzhengValue(String bingzhengValue) {
				this.bingzhengValue = bingzhengValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}














}
