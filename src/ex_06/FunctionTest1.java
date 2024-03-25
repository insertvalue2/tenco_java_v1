package ex_06;

public class FunctionTest1 {

	public static void main(String[] args) {

		add(77, 33);
		int addResult2 = add(10, 30);
		System.out.println(addResult2);
		System.out.println("--------------------");
		System.out.println(add(10,10));	
	} // end of main() 
	
	
	static int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result; // 리턴 키워드를 만났을 때 제어권을 반환 
		//int a = 10 + 100;
		
	} // end of add() 

} // end of class 
