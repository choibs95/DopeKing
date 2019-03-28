package com.java.pizza_board.dto;

import java.sql.Timestamp;

public class UDto {
	int pId;
	String pName;
	String pTitle;
	String pContent;
	Timestamp pDate;
	int pHit;
	int pGroup;
	int pStep;
	int pIndent;
	
	public UDto() {
		
	}
	public UDto(int pId, String pName, String pTitle, String pContent, Timestamp pDate, int pHit, int pGroup, int pStep, int pIndent) {
		this.pId=pId;
		this.pName=pName;
		this.pTitle=pTitle;
		this.pContent=pContent;
		this.pDate=pDate;
		this.pHit=pHit;
		this.pGroup=pGroup;
		this.pStep=pStep;
		this.pIndent=pIndent;
		
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

	public String getpTitle() {
		return pTitle;
	}

	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}

	public Timestamp getpDate() {
		return pDate;
	}

	public void setpDate(Timestamp pDate) {
		this.pDate = pDate;
	}

	public int getpHit() {
		return pHit;
	}

	public void setpHit(int pHit) {
		this.pHit = pHit;
	}

	public int getpGroup() {
		return pGroup;
	}

	public void setpGroup(int pGroup) {
		this.pGroup = pGroup;
	}

	public int getpStep() {
		return pStep;
	}

	public void setpStep(int pStep) {
		this.pStep = pStep;
	}

	public int getpIndent() {
		return pIndent;
	}

	public void setpIndent(int pIndent) {
		this.pIndent = pIndent;
	}

	public String getpContent() {
		return pContent;
	}

	public void setpContent(String pContent) {
		this.pContent = pContent;
	}
	

}
