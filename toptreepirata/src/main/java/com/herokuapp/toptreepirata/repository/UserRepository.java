package com.herokuapp.toptreepirata.repository;

import com.herokuapp.toptreepirata.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
