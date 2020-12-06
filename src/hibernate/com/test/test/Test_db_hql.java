package hibernate.com.test.test;

import hibernate.com.test.dataSouce.DataConnecton;
import hibernate.com.test.entity.User;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/***********************hql查询***********************
 *1. 
 */
public class Test_db_hql {

	@Test
	//hql-查询语句
	public void hql_selectData(){
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
	
	@Test
	//hql-插入语句
	public void hql_insertData(){
		Session session = null;
		try {
			//获取session
			session=DataConnecton.getSession();
			Transaction tx=session.beginTransaction();
			User newUser=new User();
			//newUser.setId(3);
			newUser.setName("小李");
			session.save(newUser);
			tx.commit();//事务提交
		}
		finally{
			if(session!=null){
				session.close();
			}
		}
	}
	
	@Test
	//hql-更新语句
	public void hql_updateData(){
		Session session = null;
		try {
			//获取session
			session=DataConnecton.getSession();
			Transaction tx=session.beginTransaction();
			User user=(User)session.load(User.class,5);
			user.setName("小李66");
			tx.commit();//事务提交
		}
		finally{
			if(session!=null){
				session.close();
			}
		}
	}
	
	@Test
	//hql-删除语句
	public void hql_deleteData(){
		Session session = null;
		try {
			//获取session
			session=DataConnecton.getSession();
			Transaction tx=session.beginTransaction();
			User user=(User)session.load(User.class,5);//根据主键获取数据
			session.delete(user);
			tx.commit();//事务提交
		}
		finally{
			if(session!=null){
				session.close();
			}
		}
	}
}
