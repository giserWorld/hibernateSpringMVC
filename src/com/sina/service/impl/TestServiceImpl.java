package com.sina.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sina.dao.BaseDAO;
import com.sina.service.TestService;


@Service("TestService")//暴露出自定义名字的service bean
@Transactional//事务注解为transactional bean
public class TestServiceImpl implements TestService {
	//自动注入
	//@Resource
	//private BaseDAO<UserBean> uDAO;
	@Resource
	private BaseDAO<Map<String,Object>> mDAO;
	
	@Override
	public Map<String,Object> getByUserById(String userid) {
		String sql="select * from tb_user where id="+userid;
		Map<String,Object> usermap = mDAO.getBySQL1(sql);
		return usermap;
	}

}
