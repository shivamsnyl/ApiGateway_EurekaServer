package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
