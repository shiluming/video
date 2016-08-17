package com.sise.service.impl;

import com.sise.dao.TestDao;
import com.sise.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rola on 16-8-17.
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public void testService() {
        testDao.daoTest();
        System.out.println("after dao service");
    }
}