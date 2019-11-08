package com.bawei.bean;

/**
 * @author ccw
 *
 * 2019年11月8日
 */
public class Light {

	private Integer lid;
	private String lname;
	
	public Light(Integer lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}
	public Light() {
		super();
	}
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Light [lid=" + lid + ", lname=" + lname + "]";
	}
	
	
}
