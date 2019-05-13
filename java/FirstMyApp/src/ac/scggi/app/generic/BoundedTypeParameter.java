package ac.scggi.app.generic;

public class BoundedTypeParameter {
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArry, T ele) {
		int count = 0;
		for(T e : anArry) {
			if ( e.compareTo(ele) > 0 ) count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// 배열만 선언
		Student[] stuArr = new Student[5];
		stuArr[0] = new Student("james", 80); 
		stuArr[1] = new Student("smith", 85); 
		stuArr[2] = new Student("adam", 92); 
		stuArr[3] = new Student("hily", 95); 
		stuArr[4] = new Student("hoho", 73);
		Student stu = new Student("robert", 85);
		
		int count = BoundedTypeParameter.<Student>countGreaterThan(stuArr, stu);
		System.out.println(count);
	}
}

class Student implements Comparable<Student>{
	int score;
	String name;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return score-o.score;
	}
	
}