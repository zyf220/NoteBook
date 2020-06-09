package com.zyf.notebook.controller;

import com.zyf.notebook.entity.Category;
import com.zyf.notebook.entity.Note;
import com.zyf.notebook.service.NoteBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/category")
public class NoteBookController {
    @Autowired
    private NoteBookService noteBookService;

    @CrossOrigin("*")  // 跨域的标志
    @RequestMapping("/findAllCategory")
    public Map<String,Object> getAllCategory(String id){
        Map<String,Object> map = new HashMap<>();
        List<Category> categories = noteBookService.findAllCategory();
        map.put("categories",categories);
        return map;
    }
    @CrossOrigin("*")  // 跨域的标志
    @RequestMapping("/findByCategoryId")
    public Map<String,Object> getCategoryById(Integer id){
        Map<String,Object> map = new HashMap<>();
        List<Note> notes = noteBookService.findNoteByCategoryId(id);
        map.put("notes",notes);
        return map;
    }

    /*我们知道现在我们服务端同学接收参数用的是 @RequestParam（通过字符串中解析出参数）
    其实还有另一种是 @RequestBody（从请求体中获取参数）。*/
    @CrossOrigin("*")  // 跨域的标志
    @PostMapping("/editSimple")
    public Map<String,Object> edit (Note note){
        Map<String,Object> map = new HashMap<>();
        System.out.println(note);
        noteBookService.editNote(note);

        //map.put("notes",notes);
        return map;
    }

    @CrossOrigin("*")  // 跨域的标志
    @PostMapping("/addNote")
    public Map<String,Object> addNote(Note note,@RequestParam("category") Integer category){
        Map<String,Object> map = new HashMap<>();
        System.out.println(note);
        note.setCategory(category);
        Integer i = noteBookService.addNote(note);
        //map.put("notes",notes);
        return map;
    }

    @CrossOrigin("*")  // 跨域的标志
    @PostMapping("/addCategory")
    public Map<String,Object> addCategory(Category category){
        Map<String,Object> map = new HashMap<>();
        System.out.println(category);
        noteBookService.addCategory(category);
        map.put("category",category);
        return map;
    }

    @CrossOrigin("*")  // 跨域的标志
    @GetMapping("/deleCategory")
    public Map<String,Object> deleCategory(Integer id){
        Map<String,Object> map = new HashMap<>();
        noteBookService.deleCategory(id);
        return map;
    }

    @CrossOrigin("*")  // 跨域的标志
    @GetMapping("/getNoteMd")
    public Map<String,Object> getNoteMd(Integer id){
        System.out.println(id);
        Map<String,Object> map = new HashMap<>();
        Note note= noteBookService.getNoteMd(id);
        System.out.println(note);
        map.put("note",note);
        return map;
    }

    @CrossOrigin("*")  // 跨域的标志
    @PostMapping("/saveNoteMd")
    public Map<String,Object> saveNoteMd( Note note){
        //System.out.println(noteId);
        System.out.println(note);
        if (note.getContentMd()==null){
            note.setContentMd("请添加笔记");
        }
        Map<String,Object> map = new HashMap<>();
       int i= noteBookService.saveNoteMd(note);
        System.out.println(note);
        //map.put("note",note);

        return map;
    }
}
