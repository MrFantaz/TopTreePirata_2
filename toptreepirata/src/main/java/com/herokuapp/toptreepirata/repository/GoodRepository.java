package com.herokuapp.toptreepirata.repository;

import com.herokuapp.toptreepirata.model.CategoriesEntity;
import com.herokuapp.toptreepirata.model.GoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface GoodRepository extends JpaRepository<GoodsEntity, Long> {

   List<GoodsEntity> findAllByCategory (CategoriesEntity category);
}
