package com.entity.view;

import com.entity.WenzhangLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 心理文章留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wenzhang_liuyan")
public class WenzhangLiuyanView extends WenzhangLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 wenzhang
			/**
			* 心理文章名称
			*/
			private String wenzhangName;
			/**
			* 心理文章编号
			*/
			private String wenzhangUuidNumber;
			/**
			* 心理文章照片
			*/
			private String wenzhangPhoto;
			/**
			* 心理文章类型
			*/
			private Integer wenzhangTypes;
				/**
				* 心理文章类型的值
				*/
				private String wenzhangValue;
			/**
			* 文章热度
			*/
			private Integer wenzhangClicknum;
			/**
			* 赞数量
			*/
			private Integer zanNumber;
			/**
			* 踩数量
			*/
			private Integer caiNumber;
			/**
			* 心理文章内容
			*/
			private String wenzhangContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer wenzhangDelete;

		//级联表 yonghu
			/**
			* 用户唯一编号
			*/
			private String yonghuUuidNumber;
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public WenzhangLiuyanView() {

	}

	public WenzhangLiuyanView(WenzhangLiuyanEntity wenzhangLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, wenzhangLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set wenzhang

					/**
					* 获取： 心理文章名称
					*/
					public String getWenzhangName() {
						return wenzhangName;
					}
					/**
					* 设置： 心理文章名称
					*/
					public void setWenzhangName(String wenzhangName) {
						this.wenzhangName = wenzhangName;
					}

					/**
					* 获取： 心理文章编号
					*/
					public String getWenzhangUuidNumber() {
						return wenzhangUuidNumber;
					}
					/**
					* 设置： 心理文章编号
					*/
					public void setWenzhangUuidNumber(String wenzhangUuidNumber) {
						this.wenzhangUuidNumber = wenzhangUuidNumber;
					}

					/**
					* 获取： 心理文章照片
					*/
					public String getWenzhangPhoto() {
						return wenzhangPhoto;
					}
					/**
					* 设置： 心理文章照片
					*/
					public void setWenzhangPhoto(String wenzhangPhoto) {
						this.wenzhangPhoto = wenzhangPhoto;
					}

					/**
					* 获取： 心理文章类型
					*/
					public Integer getWenzhangTypes() {
						return wenzhangTypes;
					}
					/**
					* 设置： 心理文章类型
					*/
					public void setWenzhangTypes(Integer wenzhangTypes) {
						this.wenzhangTypes = wenzhangTypes;
					}


						/**
						* 获取： 心理文章类型的值
						*/
						public String getWenzhangValue() {
							return wenzhangValue;
						}
						/**
						* 设置： 心理文章类型的值
						*/
						public void setWenzhangValue(String wenzhangValue) {
							this.wenzhangValue = wenzhangValue;
						}

					/**
					* 获取： 文章热度
					*/
					public Integer getWenzhangClicknum() {
						return wenzhangClicknum;
					}
					/**
					* 设置： 文章热度
					*/
					public void setWenzhangClicknum(Integer wenzhangClicknum) {
						this.wenzhangClicknum = wenzhangClicknum;
					}

					/**
					* 获取： 赞数量
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞数量
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩数量
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩数量
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 心理文章内容
					*/
					public String getWenzhangContent() {
						return wenzhangContent;
					}
					/**
					* 设置： 心理文章内容
					*/
					public void setWenzhangContent(String wenzhangContent) {
						this.wenzhangContent = wenzhangContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
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

					/**
					* 获取： 逻辑删除
					*/
					public Integer getWenzhangDelete() {
						return wenzhangDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setWenzhangDelete(Integer wenzhangDelete) {
						this.wenzhangDelete = wenzhangDelete;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 用户唯一编号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 用户唯一编号
					*/
					public void setYonghuUuidNumber(String yonghuUuidNumber) {
						this.yonghuUuidNumber = yonghuUuidNumber;
					}

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}















}
