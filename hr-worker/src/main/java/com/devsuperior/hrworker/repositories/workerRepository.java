package com.devsuperior.hrworker.repositories;

import com.devsuperior.hrworker.entities.Worker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface workerRepository extends JpaRepository <Worker, Long>  {
    
}
