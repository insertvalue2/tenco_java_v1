package ex_12;

public class Company {

	static String companyName = "그린컴퍼니";
	static int empSerialNumber = 1; 
	
	// main method 
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("야스오");
		Employee employee2 = new Employee("티모");
		Employee employee3 = new Employee("샤코");
		
		System.out.println("야스오 : " + employee1.getEmployeeId());
		System.out.println("티모 : " +employee2.getEmployeeId());
		System.out.println("샤코 : " +employee3.getEmployeeId());
		
	}
}
