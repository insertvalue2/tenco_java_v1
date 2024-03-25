package ex_09;

import java.util.Scanner;

public class GoingToSchool2 {

	public static void main(String[] args) {
		
		// 스캐너를 활용해서 실행에 흐름 만들어 보기 
		
		Scanner scanner = new Scanner(System.in);
		Student student = new Student("야스오", 50000);
		Bus bus100 = new Bus(100);
		Bus bus200;
		Subway line1 = new Subway(1);
		
		System.out.println("1.버스 2.지하철");
		System.out.println("선택해주세요");
		String c1 = scanner.next();
		if(c1.equals("1")) {
			System.out.println("버스를 선택 하였습니다.");
			student.takeBus(bus100);
			//student.takeBus(bus200);
			student.showInfo();
		}
		
		// ... 실행에 흐름을 계속 만들 보세요
		
	} // end of main 

} // end of class 
