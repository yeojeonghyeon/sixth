package com.first.modifier.b;

// java는 하나만 상속 가능.
public class SubDao extends BaseDao {
	@Override
	void showInfo() {
		System.out.println("SubDao's showInfo invoked");
	}
}

// final class는 더이상 상속 할 수 없다.
final class SubSubDao extends SubDao {
	@Override
	void showInfo() {
		System.out.println("SubSubDao's showInfo invoked");
	}
}
// final 클래스는 상속 할 수 없다.
//class SubSubSubDao extends SubSubDao{
//	
//}
