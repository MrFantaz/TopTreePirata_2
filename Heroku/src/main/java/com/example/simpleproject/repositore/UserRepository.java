package com.example.simpleproject.repositore;


import com.example.simpleproject.model.UsersEntity;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserRepository extends CrudRepository<UsersEntity,Long> {
    List<UsersEntity> findByLastName(String lastName);
    UsersEntity getById(Long id);
}
