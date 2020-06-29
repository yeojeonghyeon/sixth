package com.first.modifier.b;
// no modifier, 같은 패키지 내에서만 접근 가능
//import com.first.modifier.a.PackagePrivate;
import com.first.app.data.Student;

public class Client {
	public static void main(String[] args) {
//		BaseDao dao = new BaseDao();
		SubDao sDao = new SubDao();
		SubSubDao ssDao = new SubSubDao();
		sDao.showInfo();
		ssDao.showInfo();
	}
}
