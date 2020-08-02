package entity;

import java.util.Date;

public class Blog {
	
	private Integer id;                      //int(11) NOT NULL微博id
	private String content;               //varchar(300) NOT NULL内容
	private Date publishtime;              // datetime NOT NULL发布时间
	private Integer userid;                    //  int(11) NOT NULL用户id
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPublishtime() {
		return publishtime;
	}
	public void setPublishtime(Date publishtime) {
		this.publishtime = publishtime;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	
	
	
}
