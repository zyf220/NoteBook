package com.zyf.notebook.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Note {
    private Integer id;

    private String name;

    private String abs;

    private Integer author;

    private Integer category;

    private Date lastModifiedTime;

    private Date cresteTime;

    private String contentHtml;

    private String contentMd;


}