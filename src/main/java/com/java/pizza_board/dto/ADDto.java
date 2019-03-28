package com.java.pizza_board.dto;

public class ADDto {
	
	private int pId;
	private String pName;
	private int Lprice;
	private int Rprice;
	private int pQuantity;
	private int extPrice;
	private String pContent;
	private String picture_url;
	
	//생성자
	public ADDto() {
		// TODO Auto-generated constructor stub
	}
	public ADDto(int pId,String pName,
			int lprice,int rprice,int pQuantity,int extPrice,String pContent,String picture_url) {
		this.pId=pId;
		this.pName=pName;
		this.Lprice=lprice;
		this.Rprice=rprice;
		this.pQuantity=pQuantity;
		this.extPrice=extPrice;
		this.pContent=pContent;
		this.picture_url=picture_url;
		
		
	}
	
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getLprice() {
		return Lprice;
	}
	public void setLprice(int lprice) {
		Lprice = lprice;
	}
	public int getRprice() {
		return Rprice;
	}
	public void setRprice(int rprice) {
		Rprice = rprice;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}
	public int getExtPrice() {
		return extPrice;
	}
	public void setExtPrice(int extPrice) {
		this.extPrice = extPrice;
	}
	public String getpContent() {
		return pContent;
	}
	public void setpContent(String pContent) {
		this.pContent = pContent;
	}
	public String getPicture_url() {
		return picture_url;
	}
	public void setPicture_url(String picture_url) {
		this.picture_url = picture_url;
	}
	
	
	
	
	

}
