package com.zb.service.impl;

import com.zb.mapper.StudentMapper;
import com.zb.model.Student;
import com.zb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhangbin on 2018/1/10.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    public int deleteByPrimaryKey(Integer id) {
        int result = studentMapper.deleteByPrimaryKey(id);
        throw new RuntimeException("test");
//        return result;
    }

    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    public Student selectByPrimaryKey(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }
}
