package hibernate.com.test.test;

import hibernate.com.test.dataSouce.DataConnecton;
import hibernate.com.test.entity.User;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Test;

//测试hibernate 
public class Test_db_sql {

	@SuppressWarnings("rawtypes")
	@Test
	//测试select语句-sql
	public void testSelect(){
		Session session = null;
		try {
			//获取session
			session=DataConnecton.getSession();
			
			//sql语句
			String sqlStr="SELECT * from tb_user";
			//将查询结果集数据映射到User实体
			Query query=session.createSQLQuery(sqlStr).addEntity(User.class);
			List list = query.list();
			//获取第一条数据
			User user=(User)list.get(1);
			System.out.println("名字:"+user.getName());
		}
		finally{
			if(session!=null){
				session.close();
			}
		}
	}
}
