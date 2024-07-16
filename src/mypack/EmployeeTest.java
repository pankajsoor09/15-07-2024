package mypack;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setId(111);
		emp.setName("Pankaj");
		emp.setSalary(1100010);
		
		System.out.println("Employee Details : ");
		System.out.println("Id : "+emp.getId());
		System.out.println("Name : "+emp.getName());
        System.out.println("Salary :"+emp.getSalary());
	}

}
