
package com.petproject.taskmanagementsystem.repository;

import com.petproject.taskmanagementsystem.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}

