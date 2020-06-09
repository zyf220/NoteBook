package com.zyf.notebook.mapper;

import com.zyf.notebook.entity.Category;
import com.zyf.notebook.entity.Note;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
    List<Category> selectAll();

    //关联关系
    List<Note> selectNotes(Integer id);
}