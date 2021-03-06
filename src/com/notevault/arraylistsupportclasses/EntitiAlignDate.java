package com.notevault.arraylistsupportclasses;

import java.util.Comparator;

public class EntitiAlignDate {

	String TYPE;
	String NAME;
	String TRD_COMP;
	String CLASSI_STAT;
	String HR_QTY;
	int ID;
	int EIdentity;
	String Action;
	String header;
	int Date;

	public static class OrderByEDate implements Comparator<EntitiAlignDate> {

		@Override
		 public int compare(EntitiAlignDate e1, EntitiAlignDate e2) {
			if(e1.Date < e2.Date){
	            return 1;
	        } else {
	            return -1;
	        }
	
        }
	}
	public EntitiAlignDate(int eiDentity2, int id2, String type2, String name2,
			String classi_STAT2, String hr_QTY2, String trd_COMP2,
			String action2, int date2) {

		this.TYPE = type2;
		this.NAME = name2;
		this.TRD_COMP = trd_COMP2;
		this.CLASSI_STAT = classi_STAT2;
		this.HR_QTY = hr_QTY2;
		this.ID = id2;
		this.EIdentity = eiDentity2;
		this.Action = action2;
		this.Date = date2;

	}

	

	public int getDate() {
		return Date;
	}



	public void setDate(int date) {
		Date = date;
	}



	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}

	public String getHR_QTY() {
		return HR_QTY;
	}

	public void setHR_QTY(String hR_QTY) {
		HR_QTY = hR_QTY;
	}

	public int getEIdentity() {
		return EIdentity;
	}

	public void setEIdentity(int eIdentity) {
		EIdentity = eIdentity;
	}

	public String getTYPE() {
		return TYPE;
	}

	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getTRD_COMP() {
		return TRD_COMP;
	}

	public void setTRD_COMP(String tRD_COMP) {
		TRD_COMP = tRD_COMP;
	}

	public String getCLASSI_STAT() {
		return CLASSI_STAT;
	}

	public void setCLASSI_STAT(String cLASSI_STAT) {
		CLASSI_STAT = cLASSI_STAT;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	public int compareTo(EntitiAlignDate o) {
		 return this.Date > o.Date ? 1 : (this.Date < o.Date ? -1 : 0);
	}

	/*
	 * implementing toString method to print orderId of Order
	 */
	@Override
	public String toString() {
		return String.valueOf(NAME);
	}


}
