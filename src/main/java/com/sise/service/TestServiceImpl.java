package com.sise.service;

import com.sise.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rola
 */
@Service("testService")
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao testDao;

    @Override
    public void testService() {
        testDao.daoTest();
        System.out.println("after dao service");
    }
}
