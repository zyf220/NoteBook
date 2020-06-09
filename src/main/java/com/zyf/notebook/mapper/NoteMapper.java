package com.zyf.notebook.mapper;

import com.zyf.notebook.entity.Note;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface NoteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Note record);

    int insertSelective(Note record);

    Note selectByPrimaryKey(Integer id);

    List<Note> selectNoteByCategoryId(Integer id);

    int updateByPrimaryKeySelective(Note record);

    int updateByPrimaryKeyWithBLOBs(Note record);

    int updateNote(Note record);



}