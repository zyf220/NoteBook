package com.zyf.notebook.entity;

import lombok.Data;

import java.util.List;

@Data
public class Category {
    private Integer id;

    private String name;
    /*关联关系*/
    private List<Note> notes;


}