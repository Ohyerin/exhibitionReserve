package exhibition.vo;

public class Exhibition {
	private int eid;
	private String title;
	private String img;
	private String period;
	private String time;
	private String theme;
	private int aPrice;
	private int tPrice;
	private int cPrice;
	private String place;
	private String content;
	public Exhibition() {}
	public Exhibition(int eid, String title, String img, String period, String time, 
	String theme, int aPrice, int tPrice, int cPrice, String place, String content )
	{
		this.eid=eid;
		this.title= title;
		this.img= img;
		this.period=period;
		this.time=time;
		this.theme=theme;
		this.aPrice=aPrice;
		this.tPrice=tPrice;
		this.cPrice=cPrice;
		this.place=place;
		this.content=content;
	}
	
	public int getId()
	{
		return eid;
	}
	public void setId(int eid)
	{
		this.eid=eid;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getImg()
	{
		return img;
	}
	public void setImg(String img)
	{
		this.img=img;
	}
	public String getPeriod()
	{
		return period;
	}
	public void setPeriod(String period)
	{
		this.period= period;
	}
	public String getTime()
	{
		return time;
	}
	public void setTime(String time)
	{
		this.time= time;
	}
	public String getTheme()
	{
		return theme;
	}
	public void setTheme(String theme)
	{
		this.theme= theme;
	}
	public int getAPrice()
	{
		return aPrice;
	}
	public void setAPrice(int aPrice)
	{
		this.aPrice=aPrice;
	}
	public int getTPrice()
	{
		return tPrice;
	}
	public void setTPrice(int tPrice)
	{
		this.tPrice=tPrice;
	}
	public int getCPrice()
	{
		return cPrice;
	}
	public void setCPrice(int cPrice)
	{
		this.cPrice=cPrice;
	}
	public String getPlace()
	{
		return place;
	}
	public void setPlace(String place)
	{
		this.place=place;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content=content;
	}
	
}
