package com.bawei.bean;

/**
 * @author ccw
 *
 * 2019年11月8日
 */
public class Job {

	private Integer jid;
	private String jname;
	private String jdate;
	private Integer price;
	private Integer lid1;
	private Integer lid2;
	private Integer lid3;
	private String lid;
	private String lname1;
	private String lname2;
	private String lname3;
	private String lname;
	private String bdate;
	private String edate;
	private String orderl;
	private String ordergz;
	public Job(Integer jid, String jname, String jdate, Integer price, Integer lid1, Integer lid2, Integer lid3,
			String lid, String lname1, String lname2, String lname3, String lname, String bdate, String edate,
			String orderl, String ordergz) {
		super();
		this.jid = jid;
		this.jname = jname;
		this.jdate = jdate;
		this.price = price;
		this.lid1 = lid1;
		this.lid2 = lid2;
		this.lid3 = lid3;
		this.lid = lid;
		this.lname1 = lname1;
		this.lname2 = lname2;
		this.lname3 = lname3;
		this.lname = lname;
		this.bdate = bdate;
		this.edate = edate;
		this.orderl = orderl;
		this.ordergz = ordergz;
	}
	public Job() {
		super();
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public String getJdate() {
		return jdate;
	}
	public void setJdate(String jdate) {
		this.jdate = jdate;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getLid1() {
		return lid1;
	}
	public void setLid1(Integer lid1) {
		this.lid1 = lid1;
	}
	public Integer getLid2() {
		return lid2;
	}
	public void setLid2(Integer lid2) {
		this.lid2 = lid2;
	}
	public Integer getLid3() {
		return lid3;
	}
	public void setLid3(Integer lid3) {
		this.lid3 = lid3;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getLname1() {
		return lname1;
	}
	public void setLname1(String lname1) {
		this.lname1 = lname1;
	}
	public String getLname2() {
		return lname2;
	}
	public void setLname2(String lname2) {
		this.lname2 = lname2;
	}
	public String getLname3() {
		return lname3;
	}
	public void setLname3(String lname3) {
		this.lname3 = lname3;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getOrderl() {
		return orderl;
	}
	public void setOrderl(String orderl) {
		this.orderl = orderl;
	}
	public String getOrdergz() {
		return ordergz;
	}
	public void setOrdergz(String ordergz) {
		this.ordergz = ordergz;
	}
	@Override
	public String toString() {
		return "Job [jid=" + jid + ", jname=" + jname + ", jdate=" + jdate + ", price=" + price + ", lid1=" + lid1
				+ ", lid2=" + lid2 + ", lid3=" + lid3 + ", lid=" + lid + ", lname1=" + lname1 + ", lname2=" + lname2
				+ ", lname3=" + lname3 + ", lname=" + lname + ", bdate=" + bdate + ", edate=" + edate + ", orderl="
				+ orderl + ", ordergz=" + ordergz + "]";
	}
	
	
}
