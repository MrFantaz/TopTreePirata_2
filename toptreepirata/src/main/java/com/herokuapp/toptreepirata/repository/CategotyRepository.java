package com.herokuapp.toptreepirata.repository;

import com.herokuapp.toptreepirata.model.CategoriesEntity;
import com.herokuapp.toptreepirata.model.GoodsEntity;
import org.springframework.data.repository.CrudRepository;

public interface CategotyRepository extends CrudRepository<CategoriesEntity, Long> {

    CategoriesEntity findAllBySubcategory(String myCategory);
}
