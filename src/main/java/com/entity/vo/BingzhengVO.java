package com.entity.vo;

import com.entity.BingzhengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 常见病症
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("bingzheng")
public class BingzhengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 常见病症名称
     */

    @TableField(value = "bingzheng_name")
    private String bingzhengName;


    /**
     * 常见病症编号
     */

    @TableField(value = "bingzheng_uuid_number")
    private String bingzhengUuidNumber;


    /**
     * 常见病症照片
     */

    @TableField(value = "bingzheng_photo")
    private String bingzhengPhoto;


    /**
     * 常见病症类型
     */

    @TableField(value = "bingzheng_types")
    private Integer bingzhengTypes;


    /**
     * 病症症状
     */

    @TableField(value = "bingzheng_zhengzhuang")
    private String bingzhengZhengzhuang;


    /**
     * 病症详细介绍
     */

    @TableField(value = "bingzheng_content")
    private String bingzhengContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "bingzheng_delete")
    private Integer bingzhengDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：常见病症名称
	 */
    public String getBingzhengName() {
        return bingzhengName;
    }


    /**
	 * 获取：常见病症名称
	 */

    public void setBingzhengName(String bingzhengName) {
        this.bingzhengName = bingzhengName;
    }
    /**
	 * 设置：常见病症编号
	 */
    public String getBingzhengUuidNumber() {
        return bingzhengUuidNumber;
    }


    /**
	 * 获取：常见病症编号
	 */

    public void setBingzhengUuidNumber(String bingzhengUuidNumber) {
        this.bingzhengUuidNumber = bingzhengUuidNumber;
    }
    /**
	 * 设置：常见病症照片
	 */
    public String getBingzhengPhoto() {
        return bingzhengPhoto;
    }


    /**
	 * 获取：常见病症照片
	 */

    public void setBingzhengPhoto(String bingzhengPhoto) {
        this.bingzhengPhoto = bingzhengPhoto;
    }
    /**
	 * 设置：常见病症类型
	 */
    public Integer getBingzhengTypes() {
        return bingzhengTypes;
    }


    /**
	 * 获取：常见病症类型
	 */

    public void setBingzhengTypes(Integer bingzhengTypes) {
        this.bingzhengTypes = bingzhengTypes;
    }
    /**
	 * 设置：病症症状
	 */
    public String getBingzhengZhengzhuang() {
        return bingzhengZhengzhuang;
    }


    /**
	 * 获取：病症症状
	 */

    public void setBingzhengZhengzhuang(String bingzhengZhengzhuang) {
        this.bingzhengZhengzhuang = bingzhengZhengzhuang;
    }
    /**
	 * 设置：病症详细介绍
	 */
    public String getBingzhengContent() {
        return bingzhengContent;
    }


    /**
	 * 获取：病症详细介绍
	 */

    public void setBingzhengContent(String bingzhengContent) {
        this.bingzhengContent = bingzhengContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getBingzhengDelete() {
        return bingzhengDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setBingzhengDelete(Integer bingzhengDelete) {
        this.bingzhengDelete = bingzhengDelete;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
