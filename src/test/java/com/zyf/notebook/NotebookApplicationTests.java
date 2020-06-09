package com.zyf.notebook;

import com.zyf.notebook.entity.Category;
import com.zyf.notebook.entity.Note;
import com.zyf.notebook.mapper.CategoryMapper;
import com.zyf.notebook.service.NoteBookService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class NotebookApplicationTests {

    @Autowired
    private NoteBookService noteBookService;

    @Test
    void contextLoads() {

        System.out.println();
    }

    @Test
    void contextLoads2() {
        Note note= new Note();
        note.setId(3);
        note.setName("www");
        note.setAbs("aaaaaa");
        System.out.println(note);
        noteBookService.editNote(note);
    }
    @Test
    void contextLoads3() {
        Note note1 = new Note();
        note1.setId(2);
        note1.setContentMd("asasas");
        System.out.println(noteBookService.saveNoteMd(note1));
        //Note note= noteBookService.getNoteMd(2);
        //System.out.println(note);
    }
    @Test
    void contextLoads4() {
        Category c=new Category();
        c.setName("wwww");

        System.out.println(c);
        noteBookService.addCategory(c);
        System.out.println(c);
    }
}
