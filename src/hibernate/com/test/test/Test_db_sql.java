package hibernate.com.test.test;

import hibernate.com.test.dataSouce.DataConnecton;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.junit.Test;

//测试hibernate 
@SuppressWarnings("all")//禁止编译器产生的所有警告信息
public class Test_db_sql {

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
			//Query query=session.createSQLQuery(sqlStr).addEntity(User.class);
			
			//将查询的结果集转换为map列表
			//NativeQuery nativeQuery=session.createSQLQuery(sqlStr);
			//List listMap=nativeQuery.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
			//获取第一条map数据
			/*Map<String,Object> userMap=(Map<String,Object>)listMap.get(0);
			System.out.println("id:"+userMap.get("id"));
			System.out.println("名字:"+userMap.get("name"));*/
		}
		finally{
			if(session!=null){
				session.close();
			}
		}
	}
}
