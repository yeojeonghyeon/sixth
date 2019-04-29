package ac.scggi.app.inheritance3;

public class Member {
	String id;
	String name;
	String team;
	public Member(String id, String name, String team) {
		this.id = id;
		this.name = name;
		this.team = team;
	}
	public boolean checkIn(String time) {
		if ( time.equals("09:30") ) return true;
		return false;
	}
	public boolean checkOut(String time) {
		if ( time.equals("17:50") ) return true;
		return false;
	}
	public void showInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(team);
	}
}

class Student extends Member{
	String studentId;
	public Student(String id, String name, String team, String studentId) {
		super(id, name, team);
		this.studentId = studentId;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("ÇÐ»ýID "+studentId);
	}
}

class OrdinaryPerson extends Member{
	String bornDate;
	public OrdinaryPerson(String id, String name, String team, String bornDate) {
		super(id, name, team);
		this.bornDate = bornDate;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Åº»ýÀÏ "+bornDate);
	}
}