package com.entity.view;

import com.entity.ZixunshiOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 咨询师预约订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zixunshi_order")
public class ZixunshiOrderView extends ZixunshiOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 预约时间段的值
		*/
		private String shijianduanValue;
		/**
		* 预约状态的值
		*/
		private String zixunshiOrderValue;



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

		//级联表 zixunshi
			/**
			* 咨询师编号
			*/
			private String zixunshiUuidNumber;
			/**
			* 咨询师姓名
			*/
			private String zixunshiName;
			/**
			* 咨询师手机号
			*/
			private String zixunshiPhone;
			/**
			* 咨询师身份证号
			*/
			private String zixunshiIdNumber;
			/**
			* 咨询师头像
			*/
			private String zixunshiPhoto;
			/**
			* 电子邮箱
			*/
			private String zixunshiEmail;
			/**
			* 擅长
			*/
			private String zixunshiShanchang;
			/**
			* 挂号费用
			*/
			private Double guahaofei;
			/**
			* 咨询师详细介绍
			*/
			private String zuoyeContent;

	public ZixunshiOrderView() {

	}

	public ZixunshiOrderView(ZixunshiOrderEntity zixunshiOrderEntity) {
		try {
			BeanUtils.copyProperties(this, zixunshiOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 预约时间段的值
			*/
			public String getShijianduanValue() {
				return shijianduanValue;
			}
			/**
			* 设置： 预约时间段的值
			*/
			public void setShijianduanValue(String shijianduanValue) {
				this.shijianduanValue = shijianduanValue;
			}
			/**
			* 获取： 预约状态的值
			*/
			public String getZixunshiOrderValue() {
				return zixunshiOrderValue;
			}
			/**
			* 设置： 预约状态的值
			*/
			public void setZixunshiOrderValue(String zixunshiOrderValue) {
				this.zixunshiOrderValue = zixunshiOrderValue;
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


				//级联表的get和set zixunshi

					/**
					* 获取： 咨询师编号
					*/
					public String getZixunshiUuidNumber() {
						return zixunshiUuidNumber;
					}
					/**
					* 设置： 咨询师编号
					*/
					public void setZixunshiUuidNumber(String zixunshiUuidNumber) {
						this.zixunshiUuidNumber = zixunshiUuidNumber;
					}

					/**
					* 获取： 咨询师姓名
					*/
					public String getZixunshiName() {
						return zixunshiName;
					}
					/**
					* 设置： 咨询师姓名
					*/
					public void setZixunshiName(String zixunshiName) {
						this.zixunshiName = zixunshiName;
					}

					/**
					* 获取： 咨询师手机号
					*/
					public String getZixunshiPhone() {
						return zixunshiPhone;
					}
					/**
					* 设置： 咨询师手机号
					*/
					public void setZixunshiPhone(String zixunshiPhone) {
						this.zixunshiPhone = zixunshiPhone;
					}

					/**
					* 获取： 咨询师身份证号
					*/
					public String getZixunshiIdNumber() {
						return zixunshiIdNumber;
					}
					/**
					* 设置： 咨询师身份证号
					*/
					public void setZixunshiIdNumber(String zixunshiIdNumber) {
						this.zixunshiIdNumber = zixunshiIdNumber;
					}

					/**
					* 获取： 咨询师头像
					*/
					public String getZixunshiPhoto() {
						return zixunshiPhoto;
					}
					/**
					* 设置： 咨询师头像
					*/
					public void setZixunshiPhoto(String zixunshiPhoto) {
						this.zixunshiPhoto = zixunshiPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getZixunshiEmail() {
						return zixunshiEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setZixunshiEmail(String zixunshiEmail) {
						this.zixunshiEmail = zixunshiEmail;
					}

					/**
					* 获取： 擅长
					*/
					public String getZixunshiShanchang() {
						return zixunshiShanchang;
					}
					/**
					* 设置： 擅长
					*/
					public void setZixunshiShanchang(String zixunshiShanchang) {
						this.zixunshiShanchang = zixunshiShanchang;
					}

					/**
					* 获取： 挂号费用
					*/
					public Double getGuahaofei() {
						return guahaofei;
					}
					/**
					* 设置： 挂号费用
					*/
					public void setGuahaofei(Double guahaofei) {
						this.guahaofei = guahaofei;
					}

					/**
					* 获取： 咨询师详细介绍
					*/
					public String getZuoyeContent() {
						return zuoyeContent;
					}
					/**
					* 设置： 咨询师详细介绍
					*/
					public void setZuoyeContent(String zuoyeContent) {
						this.zuoyeContent = zuoyeContent;
					}













}
