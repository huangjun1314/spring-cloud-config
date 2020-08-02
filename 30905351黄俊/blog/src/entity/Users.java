package entity;

public class Users {

	private Integer id;                  // int(11) NOT NULL用户id
	private String username;            //varchar(64) NOT NULL用户名
	private String password;             //varchar(64) NOT NULL密码
	private Integer age;                    // int(11) NOT NULL年龄
	private Integer sex;                   // int(11) NOT NULL性别
	private String nickname;               //varchar(64) NOT NULL昵称
	private String mobile;               //varchar(64) NOT NULL手机
	private String address;              //varchar(64) NOT NULL地址
	private Integer supper;                // int(11) NOT NULL管理员(1是，0否)
	private String picpath;              // varchar(300) NULL头像路径
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getSupper() {
		return supper;
	}
	public void setSupper(Integer supper) {
		this.supper = supper;
	}
	public String getPicpath() {
		return picpath;
	}
	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}
		
	
	
	
	
	
}
