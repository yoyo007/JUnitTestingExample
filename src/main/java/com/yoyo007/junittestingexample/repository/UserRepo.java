package com.yoyo007.junittestingexample.repository;

import com.yoyo007.junittestingexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    
}
