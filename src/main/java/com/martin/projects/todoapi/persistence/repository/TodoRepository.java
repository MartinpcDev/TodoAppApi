package com.martin.projects.todoapi.persistence.repository;

import com.martin.projects.todoapi.persistence.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
