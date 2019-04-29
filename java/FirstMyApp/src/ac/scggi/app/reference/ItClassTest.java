package ac.scggi.app.reference;

public class ItClassTest {
	public static void main(String[] args) {
		ItClass javaCls = null;
		// 
		Student[] students = new Student[5];
		students[0] = new Student("배성현", "순천시 1", 90, 80, 75);
		students[1] = new Student("김백섭", "순천시 2", 91, 85, 83);
		students[2] = new Student("이용선", "순천시 3", 70, 80, 90);
		students[3] = new Student("황종하", "순천시 4", 70, 65, 90);
		students[4] = new Student("노성소", "순천시 5", 80, 85, 73);
		
		javaCls = new ItClass("java class", students);
		
		javaCls.showInfo();
	}
}
