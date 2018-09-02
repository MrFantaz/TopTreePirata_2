package com.herokuapp.toptreepirata.repository;

import com.herokuapp.toptreepirata.model.CategoriesEntity;
import com.herokuapp.toptreepirata.model.GoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface GoodRepository extends JpaRepository<GoodsEntity, Long> {

<<<<<<< HEAD
   List<GoodsEntity> findAllByCategoryIsLike (CategoriesEntity category);
=======
   List<GoodsEntity> findAllByCategory (CategoriesEntity category);
>>>>>>> 7fdb9557d552b110ae623ad180e6074290648668
}
