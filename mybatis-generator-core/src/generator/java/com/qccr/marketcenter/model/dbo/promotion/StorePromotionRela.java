/**
* qccr.com Inc.
* Copyright (c) 2014-2016 All Rights Reserved.
*/
package com.qccr.marketcenter.model.dbo.promotion;

import java.io.Serializable;
import java.util.Date;

/**
 *  限时限量门店活动关联明细表 (store_promotion_rela)
 *  @author tangdu
 *  @since $Revision:1.0.0, $Date: 2016年06月26日 22:36:04 $
 */
public class StorePromotionRela implements Serializable {
    /** id */
    private Integer id;

    /** 活动ID */
    private Long promotionId;

    /** 门店ID  */
    private Integer storeId;

    /** 门店名称 */
    private String storeName;

    /** 联系人 */
    private String header;

    /** 服务ID */
    private Integer productId;

    /** 省份ID */
    private Integer provinceId;

    /** 市区ID */
    private Integer cityId;

    /** 运行状态: 0 待上线 1 上线  2下线 */
    private Integer operatorStatus;

    /** 确认状态: 0:未启动, 1未确认 2 已确认 3 已否决 */
    private Integer confirmStatus;

    /** 销售数量 */
    private Integer saleNum;

    /** 已售数量 */
    private Integer soldNum;

    /** 预扣数量 */
    private Integer preSoldNum;

    /** 库存 */
    private Integer stock;

    /** 活动价,分为单位 */
    private Integer promotionAmt;

    /** 结算价,分为单位 */
    private Integer promotionClearAmt;

    /** 商家补贴,分为单位 */
    private Integer merchantAllowance;

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
     * 返回 id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 id
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * 返回 门店ID 
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 设置 门店ID 
     * @param storeId
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 返回 门店名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 设置 门店名称
     * @param storeName
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * 返回 联系人
     */
    public String getHeader() {
        return header;
    }

    /**
     * 设置 联系人
     * @param header
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * 返回 服务ID
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置 服务ID
     * @param productId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
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
     * 返回 运行状态: 0 待上线 1 上线  2下线
     */
    public Integer getOperatorStatus() {
        return operatorStatus;
    }

    /**
     * 设置 运行状态: 0 待上线 1 上线  2下线
     * @param operatorStatus
     */
    public void setOperatorStatus(Integer operatorStatus) {
        this.operatorStatus = operatorStatus;
    }

    /**
     * 返回 确认状态: 0:未启动, 1未确认 2 已确认 3 已否决
     */
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * 设置 确认状态: 0:未启动, 1未确认 2 已确认 3 已否决
     * @param confirmStatus
     */
    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
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
     * 返回 已售数量
     */
    public Integer getSoldNum() {
        return soldNum;
    }

    /**
     * 设置 已售数量
     * @param soldNum
     */
    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    /**
     * 返回 预扣数量
     */
    public Integer getPreSoldNum() {
        return preSoldNum;
    }

    /**
     * 设置 预扣数量
     * @param preSoldNum
     */
    public void setPreSoldNum(Integer preSoldNum) {
        this.preSoldNum = preSoldNum;
    }

    /**
     * 返回 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置 库存
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 返回 活动价,分为单位
     */
    public Integer getPromotionAmt() {
        return promotionAmt;
    }

    /**
     * 设置 活动价,分为单位
     * @param promotionAmt
     */
    public void setPromotionAmt(Integer promotionAmt) {
        this.promotionAmt = promotionAmt;
    }

    /**
     * 返回 结算价,分为单位
     */
    public Integer getPromotionClearAmt() {
        return promotionClearAmt;
    }

    /**
     * 设置 结算价,分为单位
     * @param promotionClearAmt
     */
    public void setPromotionClearAmt(Integer promotionClearAmt) {
        this.promotionClearAmt = promotionClearAmt;
    }

    /**
     * 返回 商家补贴,分为单位
     */
    public Integer getMerchantAllowance() {
        return merchantAllowance;
    }

    /**
     * 设置 商家补贴,分为单位
     * @param merchantAllowance
     */
    public void setMerchantAllowance(Integer merchantAllowance) {
        this.merchantAllowance = merchantAllowance;
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