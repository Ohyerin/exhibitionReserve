package exhibition.vo;

public class User {
	private String id;
	private String pwd;
	private String email;
	private String name;
	public User() {}
	public User(String tId, String tPwd, String tEmail, String tName)
	{
		this.id=tId;
		this.pwd=tPwd;
		this.email=tEmail;
		this.name=tName;	
	}
	
	public String getId()
	{
		return id;
	}
	public void setId(String tId)
	{
		this.id=tId;
	}
	public String getPwd()
	{
		return pwd;
	}
	public void setPwd(String tpwd)
	{
		this.pwd= tpwd;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String temail)
	{
		this.email= temail;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String tname)
	{
		this.name= tname;
	}
	
}


