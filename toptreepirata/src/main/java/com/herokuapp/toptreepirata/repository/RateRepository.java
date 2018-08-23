package com.herokuapp.toptreepirata.repository;

import com.herokuapp.toptreepirata.model.RatesEntity;
import org.springframework.data.repository.CrudRepository;

public interface RateRepository extends CrudRepository<RatesEntity, Long> {
}
