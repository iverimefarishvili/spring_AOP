package com.example.demo.service.impl;

import com.example.demo.aspect.Loggable;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Loggable
    @Override
    public String getTask() {
        System.out.println("getTask");
        return "getTask";
    }

    @Override
    public void setTask(String task) {
        System.out.println("setTask");
    }

    @Override
    public void exc() {
        System.out.println("exc");
        throw new RuntimeException();
    }
}
