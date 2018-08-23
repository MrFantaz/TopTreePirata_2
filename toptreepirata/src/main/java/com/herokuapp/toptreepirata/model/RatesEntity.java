package com.herokuapp.toptreepirata.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "rates")
public class RatesEntity implements Serializable {
    @Basic
    @Column(name = "datetime")
    private Timestamp datetime;
    @Basic
    @Column(name = "price")
    private double price;
    @Basic
    @Column(name = "users_id")
    private int usersId;
    @Id
    @Column(name = "goods_id")
    private long goodsId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "users_id", insertable=false, updatable=false,nullable = false)
    private UsersEntity userRate;
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private GoodsEntity goodsRate;
    public RatesEntity() {
    }


    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }


    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public UsersEntity getUserRate() {
        return userRate;
    }

    public void setUserRate(UsersEntity userRate) {
        this.userRate = userRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RatesEntity that = (RatesEntity) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (usersId != that.usersId) return false;
        if (goodsId != that.goodsId) return false;
        if (datetime != null ? !datetime.equals(that.datetime) : that.datetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = datetime != null ? datetime.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + usersId;
        result = 31 * result + (int) (goodsId ^ (goodsId >>> 32));
        return result;
    }
}
