package com.martin.projects.todoapi.persistence.repository;

import com.martin.projects.todoapi.persistence.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
