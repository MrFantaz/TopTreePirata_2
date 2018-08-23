package com.herokuapp.toptreepirata.repository;

import com.herokuapp.toptreepirata.model.GoodsEntity;
import org.springframework.data.repository.CrudRepository;

public interface GoodRepository extends CrudRepository<GoodsEntity, Long> {
}
