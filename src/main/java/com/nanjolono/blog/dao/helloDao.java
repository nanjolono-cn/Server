package com.nanjolono.blog.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface helloDao {

    @Select("SELECT id, name FROM user")
    List<Map> getSth();
}
