package com.zb.service;

import com.zb.model.Student;

/**
 * Created by zhangbin on 2018/1/10.
 */
public interface StudentService {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

}
