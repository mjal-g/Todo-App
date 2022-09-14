package com.mjalg.todoapp.repo;
import com.mjalg.todoapp.model.todoitem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface todorepo extends JpaRepository <todoitem,Long>{
}
