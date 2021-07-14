package com.hy.demo.common;

import java.util.List;

/**
 * @author: 何志权27629
 * @description: 分页结果类
 */
public class PageResult<T> {

   /** 总条数 */
   private Long totalSize = 0L;

   /** 总页数 */
   private Long totalPage = 0L;

   /** 当前页码 */
   private Long page = 0L;

   /** 每页显示条数 */
   private Long size = 0L;

   /** 返回结果集 */
   private List<T> rows;

   public PageResult(Long totalSize, Long totalPage, Long page, Long size, List<T> rows) {
      this.totalSize = totalSize;
      this.totalPage = totalPage;
      this.page = page;
      this.size = size;
      this.rows = rows;
   }

   public PageResult() {
   }

   public Long getTotalSize() {
      return totalSize;
   }

   public void setTotalSize(Long totalSize) {
      this.totalSize = totalSize;
   }

   public Long getTotalPage() {
      return totalPage;
   }

   public void setTotalPage(Long totalPage) {
      this.totalPage = totalPage;
   }

   public Long getPage() {
      return page;
   }

   public void setPage(Long page) {
      this.page = page;
   }

   public Long getSize() {
      return size;
   }

   public void setSize(Long size) {
      this.size = size;

      if (this.size > 0){
         this.totalPage = this.totalSize/this.size;
         if (this.totalSize % this.size > 0){
            this.totalPage = this.totalPage + 1;
         }
      }


   }

   public List<T> getRows() {
      return rows;
   }

   public void setRows(List<T> rows) {
      this.rows = rows;
   }
}