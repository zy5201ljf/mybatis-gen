package com.levmin.service.impl;

import com.levmin.entity.TbStudent;
import com.levmin.entity.TbStudentExample;
import com.levmin.mapper.TbStudentMapper;
import com.levmin.request.TbStudentRequest;
import com.levmin.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private TbStudentMapper mapper;
    @Override
    public List<TbStudent> getTbStudentByNameAndAddr(TbStudentRequest request) {
        TbStudentExample tbStudentExample = new TbStudentExample();
        TbStudentExample.Criteria criteria = tbStudentExample.createCriteria();
//        if (request.getId()!=null){
//            criteria.andIdBetween(request.getAge1(),request.getAge2());
//        }

        if (!StringUtils.isEmpty(request.getName())){
            tbStudentExample.or().andNameLike(request.getName());
            tbStudentExample.or().andAddressEqualTo(request.getAddress());
            tbStudentExample.or().andSexEqualTo(request.getSex());

        }
        List<TbStudent> tbStudents = mapper.selectByExample(tbStudentExample);
        return tbStudents;
    }
}
