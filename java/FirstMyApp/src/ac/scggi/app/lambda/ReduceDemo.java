package ac.scggi.app.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceDemo {
	public static void main(String[] args) {
		List<Employee> empList = createList();
		Optional<Employee> result = empList.stream().reduce((e1, e2) ->
			e1.getSalary()>e2.getSalary()?e1:e2);
		if(result.isPresent()) {
			System.out.println(result.get().getSalary());
		}
		
//		IntStream.range(1, 2000).filter(x->x>1000).forEach(System.out::println);
		Employee emp = empList.stream().reduce(new Employee(), (e1, e2) ->
			e1.getSalary() > e2.getSalary() ? e1 : e2);
		
        System.out.println("Employee with max salary - " + emp.getFirstName() 
        + " salary " + emp.getSalary());
	}
	
	private static List<Employee> createList() {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee();
		emp.setEmpId("E001");
		emp.setAge(40);
		emp.setFirstName("Ram");
		emp.setLastName("Chandra");
		emp.setSalary(5000);
		empList.add(emp);
		emp = new Employee();
		emp.setEmpId("E002");
		emp.setAge(35);
		emp.setFirstName("Sheila");
		emp.setLastName("Baijal");
		emp.setSalary(7000);
		empList.add(emp);
		emp = new Employee();
		emp.setEmpId("E003");
		emp.setAge(24);
		emp.setFirstName("Mukesh");
		emp.setLastName("Rishi");
		emp.setSalary(9000);
		empList.add(emp);
		return empList;
	}
}
