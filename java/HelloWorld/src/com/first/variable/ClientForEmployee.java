package com.first.variable;

import java.util.ArrayList;
import java.util.List;

public class ClientForEmployee {
	public static void main(String[] args) {
		List<PersonalCertification> list = new ArrayList<PersonalCertification>();
		list.add(new PersonalCertification("컴활1급"));
		list.add(new PersonalCertification("정보처리기사"));
		list.add(new FoodCertification("한식 조리사 자격증"));
		AccountForPay accountForPay = new AccountForPay("123456789", "001");
		
		Employee emp = new Employee("chocoball", "홍길동", "1995.04.27", accountForPay, list);
		emp.showInfo();
	}
}
