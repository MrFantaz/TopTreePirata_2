package com.herokuapp.toptreepirata.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "goods")
public class GoodsEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "start_rate")
    private Timestamp startRate;
    @Basic
    @Column(name = "end_rate")
    private Timestamp endRate;
    @Basic
    @Column(name = "price")
    private double price;
    @ManyToOne(fetch = FetchType.EAGER,optional=true)
    @JoinColumn( name = "user_seller")
    private UsersEntity userSeller;
    @OneToOne(mappedBy = "goodsRate")
    private RatesEntity ratesEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category")
    private CategoriesEntity category;

    public GoodsEntity() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public CategoriesEntity getCategory() {
        return category;
    }

    public void setCategory(CategoriesEntity category) {
        this.category = category;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String descripton) {
        this.description = descripton;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public Timestamp getStartRate() {
        return startRate;
    }

    public void setStartRate(Timestamp startRate) {
        this.startRate = startRate;
    }


    public Timestamp getEndRate() {
        return endRate;
    }

    public void setEndRate(Timestamp endRate) {
        this.endRate = endRate;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public UsersEntity getUserSeller() {
        return userSeller;
    }

    public void setUserSeller(UsersEntity userSeller) {
        this.userSeller = userSeller;
    }

//    @Basic
//    @Column(name = "user_seller")
//    public Integer getUserSeller() {
//        return userSeller;
//    }


    @Override
    public String   toString() {
        return "GoodsEntity{" + "id=" + id + ", title='" + title + '\'' + ", description='" + description + '\'' + ", url='" + url + '\'' + ", startRate=" + startRate + ", endRate=" + endRate + ", price=" + price + ", userSeller=" + userSeller + ", ratesEntity=" + ratesEntity + ", category=" + category + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsEntity that = (GoodsEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (startRate != null ? !startRate.equals(that.startRate) : that.startRate != null) return false;
        if (endRate != null ? !endRate.equals(that.endRate) : that.endRate != null) return false;
        if (userSeller != null ? !userSeller.equals(that.userSeller) : that.userSeller != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (startRate != null ? startRate.hashCode() : 0);
        result = 31 * result + (endRate != null ? endRate.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (userSeller != null ? userSeller.hashCode() : 0);
        return result;
    }
}