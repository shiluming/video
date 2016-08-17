package com.sise.dao.impl;

import com.sise.dao.TestDao;
import com.sise.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rola on 16-8-17.
 */
@Repository("testDao")
public class TestDaoImpl implements TestDao{


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void daoTest() {
        String sql = "SELECT * FROM TB_USER";
        List<User> userList = jdbcTemplate.queryForList(sql, User.class);
        System.out.println("userList size = " + userList.size());
    }
}
