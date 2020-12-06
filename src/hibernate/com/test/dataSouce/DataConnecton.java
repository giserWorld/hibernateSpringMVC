package hibernate.com.test.dataSouce;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//数据库连接
public class DataConnecton {
	
	static SessionFactory sessionFactory;
	static{
		//创建hibernate配置对象
		Configuration config=new Configuration();
		config.configure();//从hibernate.cfg.xml文件中自动读取配置
		//从hibernate配置中构建SessionFactory对象
		sessionFactory=config.buildSessionFactory();
	}
	
	public static void main(String[] args) {
		//Session session=DataConnecton.getSession();
		//获取sql session
		System.out.println("*********数据库连接成功！**********");
	}
	
	//获取sessionFactory实例
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//获取数据库Session实例
	public static Session getSession() {
		Session sesstion =sessionFactory.openSession();
		System.out.println("*********数据库连接成功！**********");
		return sesstion;
	}
}
