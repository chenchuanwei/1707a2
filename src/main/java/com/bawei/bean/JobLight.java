package com.bawei.bean;

/**
 * @author ccw
 *
 * 2019年11月9日
 */
public class JobLight {

	private Integer id;
	private Integer jid;
	private Integer lid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public JobLight(Integer id, Integer jid, Integer lid) {
		super();
		this.id = id;
		this.jid = jid;
		this.lid = lid;
	}
	public JobLight() {
		super();
	}
	@Override
	public String toString() {
		return "JobLight [id=" + id + ", jid=" + jid + ", lid=" + lid + "]";
	}
	
	
}
