package ex_12;

public class Employee {
	
	// 요구 조건  
	// 사원이 존재하게 될 때 마다 고유한 사원 번호를 
	// 할당하고 싶다. 단 사원 번호는 중복 되어서는 안된다. 
	
	private int employeeId; // 멤버 변수(고유값) 
	private String name; 
	private String department; 
	
	// 생성자 
	public Employee(String name) {
		employeeId = Company.empSerialNumber;
		Company.empSerialNumber++;
		this.name = name; 
	}
	
	// setter 
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	// getter 
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}
	
}
