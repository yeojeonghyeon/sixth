package com.helloworld.vo;

public class AnnualBonusVO {
	private String empNm;
	private String bonusCd;
	private String detNm;
	public AnnualBonusVO(String empNm, String bonusCd, String detNm, String bonusAmt) {
		this.empNm = empNm;
		this.bonusCd = bonusCd;
		this.detNm = detNm;
		this.bonusAmt = bonusAmt;
	}
	public AnnualBonusVO() {}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public String getBonusCd() {
		return bonusCd;
	}
	public void setBonusCd(String bonusCd) {
		this.bonusCd = bonusCd;
	}
	public String getDetNm() {
		return detNm;
	}
	public void setDetNm(String detNm) {
		this.detNm = detNm;
	}
	public String getBonusAmt() {
		return bonusAmt;
	}
	public void setBonusAmt(String bonusAmt) {
		this.bonusAmt = bonusAmt;
	}
	private String bonusAmt;
}
