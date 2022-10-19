package cn.xiaobin.entity;

import java.util.Arrays;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;



public class Role {
	
	@NotNull(message="不能为空")
	private Integer id;
	
	@Length(min=4,max=10,message="必须在4位到10位之间 ")
	//@JsonIgnore//加入name的值传到前端，为了保密不显示，就使用这个注解
	private String name;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Past(message="必须是过去时间")
	@JsonFormat(pattern="yyyy-MM-dd")//json格式化用注解
	private Date brithday;
	
	@NumberFormat(style=Style.CURRENCY)
	@Min(value=30000,message="不能低于30000")
	
	private Double money; //金額　　￥５０
	
	
	
	private Double salary; //給料　３０，０００
	
	@NumberFormat(style=Style.PERCENT)
	private Float pasent; // パーセント　50％
	private String[]hibbys; //趣味
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBrithday() {
		return brithday;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Float getPasent() {
		return pasent;
	}
	public void setPasent(Float pasent) {
		this.pasent = pasent;
	}
	public String[] getHibbys() {
		return hibbys;
	}
	public void setHibbys(String[] hibbys) {
		this.hibbys = hibbys;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", brithday=" + brithday + ", money=" + money + ", salary="
				+ salary + ", pasent=" + pasent + ", hibbys=" + Arrays.toString(hibbys) + "]";
	}
	


}
