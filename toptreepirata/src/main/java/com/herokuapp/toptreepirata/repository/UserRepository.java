package com.herokuapp.toptreepirata.repository;

import com.herokuapp.toptreepirata.model.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UsersEntity,Long> {
}
