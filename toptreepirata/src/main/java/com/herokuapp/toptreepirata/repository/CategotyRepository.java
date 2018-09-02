package com.herokuapp.toptreepirata.repository;

import com.herokuapp.toptreepirata.model.CategoriesEntity;
import com.herokuapp.toptreepirata.model.GoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CategotyRepository extends JpaRepository<CategoriesEntity, Long> {

    @Query(value ="select * from categories  where category = '91'", nativeQuery = true)
    CategoriesEntity findAllBySubcategory(String myCategory);
}
