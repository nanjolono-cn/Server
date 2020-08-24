package com.nanjolono.blog.service.impl;

import com.nanjolono.blog.dao.helloDao;
import com.nanjolono.blog.service.helloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class helloServiceImpl implements helloService {
    @Autowired
    helloDao hello;
    @Override
    public List<Map> getSth() {
        return hello.getSth();
    }
}
