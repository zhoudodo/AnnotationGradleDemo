package com.gangyi.myapplication.response;

import com.gangyi.java2dart_library_annotation.Java2Dart;

import java.util.List;

//返回PageVo<CompanyListVo>
@Java2Dart("PageVo")
public class PageVo<T> {
    /**
     * 总记录数
     */
    private Long total;
    /**
     * 当前页数
     */
    private Integer pageNum;
    /**
     * 当前页的记录数
     */
    private Integer size;
    /**
     * 总页数
     */
    private Integer pages;
    /**
     * 数据
     */
    private List<T> list;


    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}