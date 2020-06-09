package com.zyf.notebook.service;

import com.zyf.notebook.entity.Category;
import com.zyf.notebook.entity.Note;

import java.util.List;

public interface NoteBookService {

     List<Category> findAllCategory();

     List<Note> findNoteByCategoryId(Integer id);

     void editNote(Note note);


     Integer addNote(Note note);

     void addCategory(Category category);

     void deleCategory(Integer id);


     Note getNoteMd(Integer id);

     int saveNoteMd(Note note);
}
