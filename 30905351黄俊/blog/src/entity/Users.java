package entity;

public class Users {

	private Integer id;                  // int(11) NOT NULL�û�id
	private String username;            //varchar(64) NOT NULL�û���
	private String password;             //varchar(64) NOT NULL����
	private Integer age;                    // int(11) NOT NULL����
	private Integer sex;                   // int(11) NOT NULL�Ա�
	private String nickname;               //varchar(64) NOT NULL�ǳ�
	private String mobile;               //varchar(64) NOT NULL�ֻ�
	private String address;              //varchar(64) NOT NULL��ַ
	private Integer supper;                // int(11) NOT NULL����Ա(1�ǣ�0��)
	private String picpath;              // varchar(300) NULLͷ��·��
	
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
