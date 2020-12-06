package hibernate.com.test.test;

import hibernate.com.test.dataSouce.DataConnecton;
import hibernate.com.test.entity.User;

import javax.management.RuntimeErrorException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

//测试数据库事务管理
public class TestTransaction {
	
	
	@Test
	//事务回滚
	public void test_update_rollback(){
		Session session=DataConnecton.getSession();
		Transaction transaction=null;
		try {
			transaction=session.beginTransaction();//开始事务
			User user=(User)session.load(User.class,3);
			user.setName("8888");
			int num=9/0;
			transaction.commit();
		} catch (Exception e) {
			if(transaction!=null){
				transaction.rollback();//事务回滚
			}
			String msg=e.getMessage();//获取异常消息
			throw new RuntimeException(msg);//抛出运行异常
		}
		finally{
			if(session!=null){
				session.close();//关闭session
			}
		}
	}
}
