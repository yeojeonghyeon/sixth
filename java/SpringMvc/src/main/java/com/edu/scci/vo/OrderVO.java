package com.edu.scci.vo;

import java.util.List;

public class OrderVO {
	private String ordId;
	private String custId;
	private String ordDt;
	private List<OrderDetVO> details;
	public List<OrderDetVO> getDetails() {
		return details;
	}
	public void setDetails(List<OrderDetVO> details) {
		this.details = details;
	}
	public String getOrdId() {
		return ordId;
	}
	public void setOrdId(String ordId) {
		this.ordId = ordId;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getOrdDt() {
		return ordDt;
	}
	public void setOrdDt(String ordDt) {
		this.ordDt = ordDt;
	}
}
