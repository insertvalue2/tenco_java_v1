package ex_14;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		String[] names = new String[5];
		
		// 생성 - Create 
		// 배열 인덱스에 접근([] 인덱스 연산자 활용) 
		names[0] = "김씨";
		names[1] = "나씨";
		names[2] = "박씨";
		
		// 조회 - Read
		// 콘솔에 출력 하기 
		System.out.println(names);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		// 수정 - Update
		names[0] = "Mr. Kim";
		names[1] = "Mr. Na";
		names[2] = "Mr. Park";
		
		// 삭제 - Delete 
		names[0] = null;
		names[1] = null;
		names[2] = null;
		
		// 자바에서 null 값이 할당 되지 않은 상태를 나타냅니다. 
		// Object 타입에서 사용 가능 
		
		
		// 1 단계
		// 배열에 길이와 인덱스에 길이에 대한 이해
		System.out.println("배열에 크기 : " + names.length);
		System.out.println("인덱스에 크기(n - 1개) : " + ( names.length - 1));
		
		// 문제 1 
		// 배열에 크기가 50개 이면 인덱스에 크기는 얼마인가? 
		// 배열에 크기가 100개 이면 인덱스에 크기는 얼마인가?
		// 배열에 크기가 357개 이면 인덱스에 크기는 얼마인가?
		
		
	}

}
