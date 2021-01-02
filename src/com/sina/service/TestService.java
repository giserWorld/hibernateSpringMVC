package com.sina.service;

import java.util.Map;

/**
 * TestService
 * @author 
 *
 */

public interface TestService {
	
	 //通过id查找用户
     public Map<String,Object> getByUserById(String userid);
}
