package com.first.variable;

import java.util.List;

public class Employee {
	private String id;
	private String name;
	private String entranceDate;
	//급여 지급 계좌 정보
	//Reference type 초기화 하지 않으면 null
	private AccountForPay account;
	//자료형
	private List<PersonalCertification> certs;
	public Employee(String id, String name, String entranceDate, AccountForPay account,
			List<PersonalCertification> certs) {
		super();
		this.id = id;
		this.name = name;
		this.entranceDate = entranceDate;
		this.account = account;
		this.certs = certs;
	}
	public void showInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(entranceDate);
		account.showInfo();
		for(PersonalCertification cert : certs) {
			cert.showInfo();
		}
	}
}

class AccountForPay{
	String accountNo;
	String bankCd;
	public AccountForPay(String accountNo, String bankCd) {
		this.accountNo = accountNo;
		this.bankCd = bankCd;
	}
	public void showInfo() {
		System.out.println("accountNo" + accountNo);
		System.out.println("bankCd" + bankCd);		
	}
}

class PersonalCertification{
	String certNo;
	String certKind;
	String acquisitionDate;
	public PersonalCertification(String certKind) {
		this.certKind = certKind;
	}
	public void showInfo() {
		System.out.println("certKind " + certKind);
	}
}
class FoodCertification extends PersonalCertification{

	public FoodCertification(String certKind) {
		super(certKind);
		// TODO Auto-generated constructor stub
	}
}