package data_strcuture;

/**
 * 앞서 직접 만들었던 객체배열을 활용 함.
 */
public class MyArrayStack {

	int top; // 스택의 최상위 요소를 가리킴
	TencoIntArray arrayStack;

	// 기본 생성자: 스택을 초기화합니다.
	public MyArrayStack() {
		top = 0; // 스택 포인터 초기화
		arrayStack = new TencoIntArray();
		// 기본 크기의 배열 생성
	}

	// 크기를 지정하여 스택을 생성하는 생성자
	public MyArrayStack(int size) {
		// 지정된 크기의 배열로 스택 초기화
		arrayStack = new TencoIntArray(size);
	}

	// 스택의 크기(요소의 수)를 반환
	public int getSize() {
		return top;
	}

	// 스택이 가득 찼는지 확인
	public boolean isFull() {
		return top == arrayStack.ARRAY_SIZE;
	}

	// 스택이 비어있는지 확인
	public boolean isEmpty() {
		return top == 0;
	}

	// 스택의 모든 요소를 출력
	public void printAll() {
		arrayStack.printAll();
	}

	// 스택에 데이터를 추가하는 메서드
	public void push(int data) {
		if (isFull()) { // 스택이 가득 차 있으면 추가하지 않음
			System.out.println("stack is full");
			return;
		}

		arrayStack.addElement(data); // 배열에 데이터 추가
		top++; // 스택 포인터 증가
	}

	// 스택에서 데이터를 제거하고 반환하는 메서드
	public int pop() {
		if (top == 0) { // 스택이 비어있으면 오류 반환
			System.out.println("stack is empty");
			return TencoIntArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top); // 배열에서 요소를 제거하고 top 감소
	}

	// 스택의 최상위 요소를 반환하지만 제거하지는 않음
	public int peek() {
		if (top == 0) { // 스택이 비어있으면 오류 반환
			System.out.println("stack is empty");
			return TencoIntArray.ERROR_NUM;
		}
		return arrayStack.getElement(top - 1); // 최상위 요소 반환
	}

	// 코드 테스트
	public static void main(String[] args) {
		
		MyArrayStack stack = new MyArrayStack(3);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40); // full 

		stack.printAll(); // 전체 출력 

		System.out.println("top element is " + stack.pop());
		stack.printAll();
		System.out.println("stack size is " + stack.getSize());
		System.out.println("-------------------------------");
		System.out.println("top element is " + stack.peek());
		stack.printAll();
		System.out.println("stack size is " + stack.getSize());
	}

}
