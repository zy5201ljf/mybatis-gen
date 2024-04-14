package com.levmin.service;

import com.levmin.entity.TbStudent;

import java.util.List;

public interface DemoService {
    List<TbStudent> getTbStudentByNameAndAddr(TbStudent request);
}
