package com.edmund.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private Integer id;

    private String name;

    private Date timm;

    private Integer age;
    
    private Depart depart;
    
    private int departid;

    public User(){}
    
    public User( String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

    
	public User( Integer age,String name,int departid) {
		super();
		this.name = name;
		this.age = age;
		this.departid = departid;
	}

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
        this.name = name == null ? null : name.trim();
    }

    public Date getTimm() {
        return timm;
    }

    public void setTimm(Date timm) {
        this.timm = timm;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

	public Depart getDepart() {
		return depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}

	public int getDepartid() {
		return departid;
	}

	public void setDepartid(int departid) {
		this.departid = departid;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", timm=" + timm + ", age=" + age + "]";
	}

	



	
}