package com.entity.view;

import com.entity.BingzhengCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 常见病症收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("bingzheng_collection")
public class BingzhengCollectionView extends BingzhengCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String bingzhengCollectionValue;



		//级联表 bingzheng
			/**
			* 常见病症名称
			*/
			private String bingzhengName;
			/**
			* 常见病症编号
			*/
			private String bingzhengUuidNumber;
			/**
			* 常见病症照片
			*/
			private String bingzhengPhoto;
			/**
			* 常见病症类型
			*/
			private Integer bingzhengTypes;
				/**
				* 常见病症类型的值
				*/
				private String bingzhengValue;
			/**
			* 病症症状
			*/
			private String bingzhengZhengzhuang;
			/**
			* 病症详细介绍
			*/
			private String bingzhengContent;
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
			private Integer bingzhengDelete;

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

	public BingzhengCollectionView() {

	}

	public BingzhengCollectionView(BingzhengCollectionEntity bingzhengCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, bingzhengCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getBingzhengCollectionValue() {
				return bingzhengCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setBingzhengCollectionValue(String bingzhengCollectionValue) {
				this.bingzhengCollectionValue = bingzhengCollectionValue;
			}




				//级联表的get和set bingzheng

					/**
					* 获取： 常见病症名称
					*/
					public String getBingzhengName() {
						return bingzhengName;
					}
					/**
					* 设置： 常见病症名称
					*/
					public void setBingzhengName(String bingzhengName) {
						this.bingzhengName = bingzhengName;
					}

					/**
					* 获取： 常见病症编号
					*/
					public String getBingzhengUuidNumber() {
						return bingzhengUuidNumber;
					}
					/**
					* 设置： 常见病症编号
					*/
					public void setBingzhengUuidNumber(String bingzhengUuidNumber) {
						this.bingzhengUuidNumber = bingzhengUuidNumber;
					}

					/**
					* 获取： 常见病症照片
					*/
					public String getBingzhengPhoto() {
						return bingzhengPhoto;
					}
					/**
					* 设置： 常见病症照片
					*/
					public void setBingzhengPhoto(String bingzhengPhoto) {
						this.bingzhengPhoto = bingzhengPhoto;
					}

					/**
					* 获取： 常见病症类型
					*/
					public Integer getBingzhengTypes() {
						return bingzhengTypes;
					}
					/**
					* 设置： 常见病症类型
					*/
					public void setBingzhengTypes(Integer bingzhengTypes) {
						this.bingzhengTypes = bingzhengTypes;
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
					* 获取： 病症症状
					*/
					public String getBingzhengZhengzhuang() {
						return bingzhengZhengzhuang;
					}
					/**
					* 设置： 病症症状
					*/
					public void setBingzhengZhengzhuang(String bingzhengZhengzhuang) {
						this.bingzhengZhengzhuang = bingzhengZhengzhuang;
					}

					/**
					* 获取： 病症详细介绍
					*/
					public String getBingzhengContent() {
						return bingzhengContent;
					}
					/**
					* 设置： 病症详细介绍
					*/
					public void setBingzhengContent(String bingzhengContent) {
						this.bingzhengContent = bingzhengContent;
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
					public Integer getBingzhengDelete() {
						return bingzhengDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setBingzhengDelete(Integer bingzhengDelete) {
						this.bingzhengDelete = bingzhengDelete;
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
