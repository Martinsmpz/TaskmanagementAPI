package com.example.task_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.martins.apigerentask.entity.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
