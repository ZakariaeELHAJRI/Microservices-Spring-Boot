package com.zakariae.MicroServiceUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zakariae.MicroServiceUser.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}