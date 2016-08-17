package com.sise.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by rola
 */
@Repository("testDao")
public class TestDaoImpl implements TestDao{


    @Override
    public void daoTest() {
        System.out.println("Test Dao");
    }
}
