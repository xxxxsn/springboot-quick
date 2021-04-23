package com.xiesn.springboot.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel("分页信息")
public class PageInfo implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -5492426587912966519L;

    public static final int PAGE = 1;
    public static final int PAGE_SIZE = 10;

    public static final String ORDERBY = "create_date";
    public static final Boolean ASC = true;

    /**
     * 总记录数
     */
    @ApiModelProperty(value = "总记录数", hidden = true)
    private Long total;
    /**
     * 分页大小
     */
    @ApiModelProperty(value = "分页大小", example = "10")
    private Integer pageSize;
    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页", example = "1")
    private Integer currentPage;
    /**
     * 排序字段
     */
    @Deprecated
    @ApiModelProperty(value = "排序字段", example = "created_time")
    private String orderBy;

    /**
     * SQL 排序 ASC 数组
     */
    @ApiModelProperty(value = "正序字段")
    private List<String> ascList;


    /**
     * SQL 排序 DESC 数组
     */
    @ApiModelProperty(value = "逆序字段")
    private List<String> descList;

    /**
     * 排序顺序
     */
    @ApiModelProperty("升降序")
    private Boolean asc;

    public PageInfo() {
        this(PAGE, PAGE_SIZE, null, null);
    }

    public PageInfo(Integer currentPage, Integer pageSize) {
        this(currentPage, pageSize, null, null);
    }

    public PageInfo(Integer currentPage, Integer pageSize, Long total) {
        this(currentPage, pageSize, total, null);
    }

    public PageInfo(Integer currentPage, Integer pageSize, String orderBy) {
        this(currentPage, pageSize, null, orderBy);
    }

    public PageInfo(Long currentPage, Long pageSize, Long total, String orderBy) {
        this(currentPage.intValue(), pageSize.intValue(), total, orderBy);
    }

    public PageInfo(Integer currentPage, Integer pageSize, Long total, String orderBy) {
        this.total = total;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.orderBy = orderBy;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }


    public List<String> getAscList() {
        return ascList;
    }

    public void setAscList(List<String> ascList) {
        this.ascList = ascList;
    }

    public List<String> getDescList() {
        return descList;
    }

    public void setDescList(List<String> descList) {
        this.descList = descList;
    }

}