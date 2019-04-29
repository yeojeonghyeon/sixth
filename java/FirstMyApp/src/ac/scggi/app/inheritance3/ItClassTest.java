package ac.scggi.app.inheritance3;

import java.util.ArrayList;

public class ItClassTest {
	public static void main(String[] args) {
		ItClass it;
		ArrayList<Member> list = new ArrayList<>();
//		list = (ArrayList<Member>)Arrays.<Member>asList(new Student("01", "ȫ�浿", "10", "stu01"),
//				new OrdinaryPerson("01", "임꺽정", "10", "stu01"));
		list.add(new Student("01", "홍길동", "10", "stu01"));
		list.add(new OrdinaryPerson("02", "임꺽정", "10", "stu01"));
		it = new ItClass(list);
		it.showInfo();
	}
}
