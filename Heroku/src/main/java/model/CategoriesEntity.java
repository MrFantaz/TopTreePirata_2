package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories", schema = "public", catalog = "d3lt7eju0rnvls")
public class CategoriesEntity {
    @Basic
    @Column(name = "main_category")
    private String mainCategory;
    @Id
    @Column(name = "subcategory")
    private String subcategory;

    @OneToMany(mappedBy = "category")
    private List<GoodsEntity> goodsEntities;

    public CategoriesEntity() {
    }


    public String getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(String mainCategory) {
        this.mainCategory = mainCategory;
    }


    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }
    public List<GoodsEntity> getGoodsEntities() {
        return goodsEntities;
    }

    public void setGoodsEntities(List<GoodsEntity> goodsEntities) {
        this.goodsEntities = goodsEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoriesEntity that = (CategoriesEntity) o;

        if (mainCategory != null ? !mainCategory.equals(that.mainCategory) : that.mainCategory != null) return false;
        if (subcategory != null ? !subcategory.equals(that.subcategory) : that.subcategory != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mainCategory != null ? mainCategory.hashCode() : 0;
        result = 31 * result + (subcategory != null ? subcategory.hashCode() : 0);
        return result;
    }
}
