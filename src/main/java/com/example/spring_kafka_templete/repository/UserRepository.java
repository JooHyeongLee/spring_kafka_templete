package com.example.spring_kafka_templete.repository;

import com.example.spring_kafka_templete.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
