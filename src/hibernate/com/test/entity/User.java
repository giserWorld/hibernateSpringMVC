package hibernate.com.test.entity;

//db_tb_user实体类(javaBean)
public class User {
	private int id;//pk
	private String name;//用户名
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
