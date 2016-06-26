/**
* qccr.com Inc.
* Copyright (c) 2014-2016 All Rights Reserved.
*/
package com.qccr.marketcenter.model.dbo.promotion;

import java.io.Serializable;
import java.util.Date;

/**
 *  限时限量活动表 (store_promotion)
 *  @author tangdu
 *  @since $Revision:1.0.0, $Date: 2016年06月26日 22:36:04 $
 */
public class StorePromotion implements Serializable {
    /** 活动ID */
    private Long promotionId;

    /** 活动名称 */
    private String name;

    /** 活动描述 */
    private String description;

    /** 1:限时，2限量 */
    private Integer promotionType;

    /** 活动价格 */
    private Integer promotionPrice;

    /** 活动类型 : 活动类型（1.商品；2.门店服务；3.保养优惠套餐；4.保养项目活动） */
    private Integer type;

    /** 省份ID */
    private Integer provinceId;

    /** 市区ID */
    private Integer cityId;

    /** 活动状态（0.待上线 1.上线 2.下线 3.删除） */
    private Integer status;

    /** 服务类目一级ID */
    private String firstCategoryId;

    /** 服务类目一级名称 */
    private String firstCategoryName;

    /** 服务类目二级ID */
    private String secondCategoryId;

    /** 服务类目二级名称 */
    private String secondCategoryName;

    /** 使用优惠卷(0:不可用;1:可用) */
    private Integer useCoupon;

    /** 参与频率(天数:次数) */
    private String cycle;

    /** 活动发起人（1.平台；2.商户) */
    private Integer sponsor;

    /** 开始时间 */
    private Date startTime;

    /** 结束时间 */
    private Date endTime;

    /** 运行状态（1. 待开始；2. 进行中；3. 已结束) */
    private Integer runtimeStatus;

    /** 参与门店数量 */
    private Integer applyNum;

    /** 限时规则 json */
    private String timeRules;

    /** 核销码有效天数 */
    private Integer verificationCodeAging;

    /** 活动图片 */
    private String adPicture;

    /** 可用渠道 1-通用, 2,用户版app 3,商户版app 4,用户版web 5,商户版web */
    private Integer channel;

    /** 销售数量 */
    private Integer saleNum;

    /** 创建时间 */
    private Date createTime;

    /** 修改时间 */
    private Date updateTime;

    /** 创建人 */
    private String createPerson;

    /** 更新人 */
    private String updatePerson;

    /***/
    private static final long serialVersionUID = 1L;

    /**
     * 返回 活动ID
     */
    public Long getPromotionId() {
        return promotionId;
    }

    /**
     * 设置 活动ID
     * @param promotionId
     */
    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    /**
     * 返回 活动名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 活动名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 返回 活动描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置 活动描述
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 返回 1:限时，2限量
     */
    public Integer getPromotionType() {
        return promotionType;
    }

    /**
     * 设置 1:限时，2限量
     * @param promotionType
     */
    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    /**
     * 返回 活动价格
     */
    public Integer getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 设置 活动价格
     * @param promotionPrice
     */
    public void setPromotionPrice(Integer promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * 返回 活动类型 : 活动类型（1.商品；2.门店服务；3.保养优惠套餐；4.保养项目活动）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置 活动类型 : 活动类型（1.商品；2.门店服务；3.保养优惠套餐；4.保养项目活动）
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 返回 省份ID
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * 设置 省份ID
     * @param provinceId
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 返回 市区ID
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置 市区ID
     * @param cityId
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 返回 活动状态（0.待上线 1.上线 2.下线 3.删除）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 活动状态（0.待上线 1.上线 2.下线 3.删除）
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 返回 服务类目一级ID
     */
    public String getFirstCategoryId() {
        return firstCategoryId;
    }

    /**
     * 设置 服务类目一级ID
     * @param firstCategoryId
     */
    public void setFirstCategoryId(String firstCategoryId) {
        this.firstCategoryId = firstCategoryId;
    }

    /**
     * 返回 服务类目一级名称
     */
    public String getFirstCategoryName() {
        return firstCategoryName;
    }

    /**
     * 设置 服务类目一级名称
     * @param firstCategoryName
     */
    public void setFirstCategoryName(String firstCategoryName) {
        this.firstCategoryName = firstCategoryName;
    }

    /**
     * 返回 服务类目二级ID
     */
    public String getSecondCategoryId() {
        return secondCategoryId;
    }

    /**
     * 设置 服务类目二级ID
     * @param secondCategoryId
     */
    public void setSecondCategoryId(String secondCategoryId) {
        this.secondCategoryId = secondCategoryId;
    }

    /**
     * 返回 服务类目二级名称
     */
    public String getSecondCategoryName() {
        return secondCategoryName;
    }

    /**
     * 设置 服务类目二级名称
     * @param secondCategoryName
     */
    public void setSecondCategoryName(String secondCategoryName) {
        this.secondCategoryName = secondCategoryName;
    }

    /**
     * 返回 使用优惠卷(0:不可用;1:可用)
     */
    public Integer getUseCoupon() {
        return useCoupon;
    }

    /**
     * 设置 使用优惠卷(0:不可用;1:可用)
     * @param useCoupon
     */
    public void setUseCoupon(Integer useCoupon) {
        this.useCoupon = useCoupon;
    }

    /**
     * 返回 参与频率(天数:次数)
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * 设置 参与频率(天数:次数)
     * @param cycle
     */
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    /**
     * 返回 活动发起人（1.平台；2.商户)
     */
    public Integer getSponsor() {
        return sponsor;
    }

    /**
     * 设置 活动发起人（1.平台；2.商户)
     * @param sponsor
     */
    public void setSponsor(Integer sponsor) {
        this.sponsor = sponsor;
    }

    /**
     * 返回 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置 开始时间
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 返回 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置 结束时间
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 返回 运行状态（1. 待开始；2. 进行中；3. 已结束)
     */
    public Integer getRuntimeStatus() {
        return runtimeStatus;
    }

    /**
     * 设置 运行状态（1. 待开始；2. 进行中；3. 已结束)
     * @param runtimeStatus
     */
    public void setRuntimeStatus(Integer runtimeStatus) {
        this.runtimeStatus = runtimeStatus;
    }

    /**
     * 返回 参与门店数量
     */
    public Integer getApplyNum() {
        return applyNum;
    }

    /**
     * 设置 参与门店数量
     * @param applyNum
     */
    public void setApplyNum(Integer applyNum) {
        this.applyNum = applyNum;
    }

    /**
     * 返回 限时规则 json
     */
    public String getTimeRules() {
        return timeRules;
    }

    /**
     * 设置 限时规则 json
     * @param timeRules
     */
    public void setTimeRules(String timeRules) {
        this.timeRules = timeRules;
    }

    /**
     * 返回 核销码有效天数
     */
    public Integer getVerificationCodeAging() {
        return verificationCodeAging;
    }

    /**
     * 设置 核销码有效天数
     * @param verificationCodeAging
     */
    public void setVerificationCodeAging(Integer verificationCodeAging) {
        this.verificationCodeAging = verificationCodeAging;
    }

    /**
     * 返回 活动图片
     */
    public String getAdPicture() {
        return adPicture;
    }

    /**
     * 设置 活动图片
     * @param adPicture
     */
    public void setAdPicture(String adPicture) {
        this.adPicture = adPicture;
    }

    /**
     * 返回 可用渠道 1-通用, 2,用户版app 3,商户版app 4,用户版web 5,商户版web
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * 设置 可用渠道 1-通用, 2,用户版app 3,商户版app 4,用户版web 5,商户版web
     * @param channel
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    /**
     * 返回 销售数量
     */
    public Integer getSaleNum() {
        return saleNum;
    }

    /**
     * 设置 销售数量
     * @param saleNum
     */
    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    /**
     * 返回 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 返回 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 修改时间
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 返回 创建人
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * 设置 创建人
     * @param createPerson
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * 返回 更新人
     */
    public String getUpdatePerson() {
        return updatePerson;
    }

    /**
     * 设置 更新人
     * @param updatePerson
     */
    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }
}