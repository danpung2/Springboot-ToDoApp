package com.example.demo.persistence;

import com.example.demo.model.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<ToDoEntity, String> {
    List<ToDoEntity> findByUserId(String userId);
}
