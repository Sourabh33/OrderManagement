package com.app.orderapp.carts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductCart {
    @Id
    @GeneratedValue
    private Long id;
    private Long bookId;
    private Integer count;
    private Long userId;

    public ProductCart() {}

    public ProductCart(Long id, Long bookId, Integer count, Long userId) {
        this.id = id;
        this.bookId = bookId;
        this.count = count;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ProductCart{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", count=" + count +
                ", userId=" + userId +
                '}';
    }
}
