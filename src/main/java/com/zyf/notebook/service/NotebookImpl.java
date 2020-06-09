package com.zyf.notebook.service;

import com.zyf.notebook.entity.Category;
import com.zyf.notebook.entity.Note;
import com.zyf.notebook.mapper.CategoryMapper;
import com.zyf.notebook.mapper.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NotebookImpl implements NoteBookService {

    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    NoteMapper noteMapper;
    @Override
    public List<Category> findAllCategory() {
        return categoryMapper.selectAll();
    }

    @Override
    public List<Note> findNoteByCategoryId(Integer id) {
        return noteMapper.selectNoteByCategoryId(id);
    }

    @Override
    public void editNote(Note note) {
        noteMapper.updateNote(note);
    }

    @Override
    public Integer addNote(Note note) {
        return noteMapper.insertSelective(note);
    }

    @Override
    public void addCategory(Category category) {
        categoryMapper.insert(category);

    }

    @Override
    public void deleCategory(Integer id) {
        categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Note getNoteMd(Integer id) {
        return noteMapper.selectByPrimaryKey(id);
    }

    @Override
    public int saveNoteMd(Note note) {
        return noteMapper.updateByPrimaryKeySelective(note);
    }


}

