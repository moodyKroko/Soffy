package com.soffy.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soffy.backend.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
