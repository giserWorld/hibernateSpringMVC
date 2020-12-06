package hibernate.com.test.sessionAPI;

import hibernate.com.test.dataSouce.DataConnecton;
import hibernate.com.test.entity.User;

import org.hibernate.Session;
import org.junit.Test;

public class Session_function {

	@Test
	//测试session.load()
	public void session_load(){
		Session session=DataConnecton.getSession();//获取session
		//获取持久化实体对象,从数据库中获取数据同时转为对象
		User user1=(User)session.load(User.class,new Integer(1));
		User user2=(User)session.load(User.class,new Integer(1));
		System.out.println("**********user1==user2？*********");
		System.out.println(user1 ==user2);
	}
}
