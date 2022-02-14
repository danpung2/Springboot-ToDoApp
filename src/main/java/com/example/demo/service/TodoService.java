package com.example.demo.service;

import com.example.demo.model.ToDoEntity;
import com.example.demo.persistence.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public String testService(){
        ToDoEntity entity = ToDoEntity.builder().title("My first todo item").build();
        repository.save(entity);
        ToDoEntity savedEntity = repository.findById(entity.getId()).get();

        return savedEntity.getTitle();
    }
}
