package com.mjalg.todoapp.controller;
import com.mjalg.todoapp.repo.todorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value="/todo")
public class todocontroller {

    @Autowired
    private todorepo todorepo;

    @GetMapping
    public List <todoitem> findAll(){
        return todorepo.findAll();

    }
    @PostMapping
    public todoitem save(@Valid @NotNull@RequestBody todoitem todoitem){
        return todorepo.save(todoitem);

    }

}
