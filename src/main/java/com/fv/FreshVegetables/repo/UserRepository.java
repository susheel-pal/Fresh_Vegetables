package com.fv.FreshVegetables.repo;

import com.fv.FreshVegetables.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByEmail(String email);
}
