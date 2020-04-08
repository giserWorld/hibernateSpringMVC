package hibernate.com.test.test;

import hibernate.com.test.dataSouce.DataConnecton;
import hibernate.com.test.entity.User;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Test;

//测试hibernate 
public class Test_db_hql {

	@Test
	//测试select语句-hql
	public void testSelect(){
		Session session = null;
		try {
			//获取session
			session=DataConnecton.getSession();
			//hql语句
			String hqlStr="from User where id=1";
			Query query=session.createQuery(hqlStr);
			List list=query.list();
			//获取第一条数据
			User user=(User)list.get(0);
			System.out.println("名字:"+user.getName());
		}
		finally{
			if(session!=null){
				session.close();
			}
		}
	}
}
