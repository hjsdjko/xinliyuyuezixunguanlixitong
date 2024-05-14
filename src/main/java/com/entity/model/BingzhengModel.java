package com.entity.model;

import com.entity.BingzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 常见病症
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BingzhengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 逻辑删除
     */
    private Integer bingzhengDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：常见病症名称
	 */
    public String getBingzhengName() {
        return bingzhengName;
    }


    /**
	 * 设置：常见病症名称
	 */
    public void setBingzhengName(String bingzhengName) {
        this.bingzhengName = bingzhengName;
    }
    /**
	 * 获取：常见病症编号
	 */
    public String getBingzhengUuidNumber() {
        return bingzhengUuidNumber;
    }


    /**
	 * 设置：常见病症编号
	 */
    public void setBingzhengUuidNumber(String bingzhengUuidNumber) {
        this.bingzhengUuidNumber = bingzhengUuidNumber;
    }
    /**
	 * 获取：常见病症照片
	 */
    public String getBingzhengPhoto() {
        return bingzhengPhoto;
    }


    /**
	 * 设置：常见病症照片
	 */
    public void setBingzhengPhoto(String bingzhengPhoto) {
        this.bingzhengPhoto = bingzhengPhoto;
    }
    /**
	 * 获取：常见病症类型
	 */
    public Integer getBingzhengTypes() {
        return bingzhengTypes;
    }


    /**
	 * 设置：常见病症类型
	 */
    public void setBingzhengTypes(Integer bingzhengTypes) {
        this.bingzhengTypes = bingzhengTypes;
    }
    /**
	 * 获取：病症症状
	 */
    public String getBingzhengZhengzhuang() {
        return bingzhengZhengzhuang;
    }


    /**
	 * 设置：病症症状
	 */
    public void setBingzhengZhengzhuang(String bingzhengZhengzhuang) {
        this.bingzhengZhengzhuang = bingzhengZhengzhuang;
    }
    /**
	 * 获取：病症详细介绍
	 */
    public String getBingzhengContent() {
        return bingzhengContent;
    }


    /**
	 * 设置：病症详细介绍
	 */
    public void setBingzhengContent(String bingzhengContent) {
        this.bingzhengContent = bingzhengContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getBingzhengDelete() {
        return bingzhengDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setBingzhengDelete(Integer bingzhengDelete) {
        this.bingzhengDelete = bingzhengDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
