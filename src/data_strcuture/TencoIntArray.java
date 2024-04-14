package data_strcuture;

public class TencoIntArray {

	int[] intArr;
	int count; // 배열안에 들어간 요소의 개수

	public final int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;

	public TencoIntArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}

	public TencoIntArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}

	// 배열에 요소(elements)의 제일 뒤에 값 추가 하기
	public void addElement(int inputData) {
		// 방어적 코드 작성
		// 하나의 요소가 추가되면
		// count 값을 + 1 증가 하게 설계 할 예정
		if (count >= ARRAY_SIZE) {
			System.out.println("sorry, my memory is full.");
			return; // 실행에 제어권 반납
		}
		// int[0] = 777; --> count = count + 1 (동작 됨)
		intArr[count++] = inputData;
	}

	// 배열의 지정한 인덱스 위치에 값을 삽입 하기
	public void insertElement(int position, int inputData) {

		// 방어적 코드 1
		if (count >= ARRAY_SIZE) { // 꽉 참
			System.out.println("sorry, my memory is full.");
			return; // 실행에 제어권 반납
		}
		// 방어적 코드 2
		if (position < 0 || position > 0) {
			// 사용자가 메소드 호출시
			// index 숫자를 잘못 입력한 상태
			System.out.println("insert error");
			return; // 실행에 제어권 반납
		}

		// position = 3;
		// [ 11, 12, 13, 14, 15 ]
		// 1. 요소 15값을 뒤로 이동 (사실 복사 후 덮어 써짐)
		// 2. 요소 14값을 뒤로 이동
		// 3. 인덱스 3에 사용자가 넣은 값을 저장
		for (int i = count - 1; i >= position; i--) {
			intArr[i + 1] = intArr[i]; // 하나씩
			// intArr[5] = 15; - 수행 1
			// intArr[4] = 14; - 수행 2
		}
		// 사용자가 원했던 index 번호에 값을 담자
		intArr[position] = inputData;
		// intArr[3] = 사용자가 입력한 값 대입
		// 요소가 하나 더 늘었기 때문에 반드시 count 수를 1증가
		count++;
	}

	// 지정한 인덱스 번호의 요소를 꺼내 주기 
	public int getElement(int position) {
		
		if (position < 0 || position > count - 1) {
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count + "개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}

	// 지정한 인덱스 번호에 요소 삭제 하기
	public int removeElement(int position) {
		int ret = ERROR_NUM;

		if (isEmpty()) {
			System.out.println("There is no element");
			return ret;
		}

		if (position < 0 || position >= count) { // index error
			System.out.println("remove Error");
			return ret;
		}

		ret = intArr[position];

		for (int i = position; i < count - 1; i++) {
			intArr[i] = intArr[i + 1]; // 한 칸씩 앞으로 이동
		}
		count--; // 전체 요소 갯수 - 1 처리
		return ret;
	}

	public void removeAll() {
		for (int i = 0; i < count; i++) {
			intArr[i] = 0;
		}
		count = 0;
	}

	public int getSize() {
		return count;
	}

	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else
			return false;
	}

	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}

		for (int i = 0; i < count; i++) {
			System.out.println(intArr[i]);
		}

	}

}
