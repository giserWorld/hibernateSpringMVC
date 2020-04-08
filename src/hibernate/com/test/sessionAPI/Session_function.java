package hibernate.com.test.sessionAPI;

import hibernate.com.test.dataSouce.DataConnecton;
import hibernate.com.test.entity.User;

import org.hibernate.Session;
import org.junit.Test;

/******************hibernate session API********************
 *session对象是hibernate框架的核心，包含一些数据持久化的操作接口
 ************************session方法*************************
 *1.session.load(entityName,id):获取持久化的实体类对象，id为主键值
 *2.
 * */
public class Session_function {

	@Test
	//测试session.load()
	public void session_load(){
		Session session=DataConnecton.getSession();//获取session
		//获取持久化实体对象,从数据库中获取数据同时转为对象
		User user1=session.load(User.class,new Integer(1));
		User user2=session.load(User.class,new Integer(1));
		System.out.println("**********user1==user2？*********");
		System.out.println(user1 ==user2);
	}
}
