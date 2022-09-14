package com.mjalg.todoapp.model;
import javax.persistence.Entity;

@Entity
public class todoitem {
    private Long id;
    @NotBlank
    private String title;
    private boolean done;

    public todoitem(){

    }
    public todoitem(Long id, String title,boolean done){
        this.id=id;
        this.title=title;
        this.done=done;
    }
    @Id
    @GeneratedValue
    public Long getId(){
        return id;
    }
}
