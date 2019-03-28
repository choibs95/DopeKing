package com.java.pizza_board.dto;

public class CartDto {
		private	String picture_url; 
		private	int cId ;
		private	String cName; 
		private	int cPrice; 
		private	int cQuantity;
		private int	sPrice;
		
		
		
		
		public int getcPrice() {
			return cPrice;
		}
		public void setcPrice(int cPrice) {
			this.cPrice = cPrice;
		}
		public int getsPrice() {
			return sPrice;
		}
		public void setsPrice(int sPrice) {
			this.sPrice = sPrice;
		}
		
		public String getPicture_url() {
			return picture_url;
		}
		public void setPicture_url(String picture_url) {
			this.picture_url = picture_url;
		}
		public int getcId() {
			return cId;
		}
		public void setcId(int cId) {
			this.cId = cId;
		}
		public String getcName() {
			return cName;
		}
		public void setcName(String cName) {
			this.cName = cName;
		}
	
		public int getcQuantity() {
			return cQuantity;
		}
		public void setcQuantity(int cQuantity) {
			this.cQuantity = cQuantity;
		}

}
