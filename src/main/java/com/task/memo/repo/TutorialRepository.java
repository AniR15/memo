package com.task.memo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.memo.entity.Tutorial;

public interface  TutorialRepository extends JpaRepository<Tutorial, Long> {
    
}
