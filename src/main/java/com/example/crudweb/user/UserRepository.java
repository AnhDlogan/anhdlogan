package com.example.crudweb.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    public long countById(Integer id);

}
