package cn.xiaobin.entity;

import java.util.ArrayList;

public class User {
	private Integer id;
	private String name;
	private ArrayList<String> hobbys;
//	private Role role;
//	public Role getRole() {
//		return role;
//	}
//	public void setRole(Role role) {
//		this.role = role;
//	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public ArrayList<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", hobbys=" + hobbys + ", role=" + role + "]";
//	}


	

}
