package wuchaolong_week2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class Person2 {
	
	private BigInteger id;
	private String name;
	private Integer age;
	private BigDecimal xin;
	private Date time;
	public Person2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person2(BigInteger id, String name, Integer age, BigDecimal xin, Date time) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.xin = xin;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", xin=" + xin.doubleValue() + ", time=" + time + "]";
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public BigDecimal getXin() {
		return xin;
	}
	public void setXin(BigDecimal xin) {
		this.xin = xin;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
}
