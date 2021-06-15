package exhibition.vo;

public class Enroll {
	private int rid;
	private String uid;
	private int eid;
	private int totalPrice;
	public Enroll() {}
	public Enroll(int rId, String uId, int eId, int totalPrice)
	{
		this.rid=rid;
		this.uid=uid;
		this.eid=eid;
		this.totalPrice=totalPrice;
	}
	
	public int getrId()
	{
		return rid;
	}
	public void setrId(int rid)
	{
		this.rid=rid;
	}
	public String getuId()
	{
		return uid;
	}
	public void setrId(String uid)
	{
		this.uid=uid;
	}
	public int geteId()
	{
		return eid;
	}
	public void seteId(int eid)
	{
		this.eid=eid;
	}
	public int gettotalPrice()
	{
		return totalPrice;
	}
	public void settotalPrice(int totalPrice)
	{
		this.totalPrice=totalPrice;
	}

}
