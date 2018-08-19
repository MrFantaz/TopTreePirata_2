package com.example.simpleproject.repositore;


import com.example.simpleproject.model.UsersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepositore extends CrudRepository<UsersEntity,Long>    {
    List<UsersEntity> findByLastName(String lastName);
}
