package data_strcuture;

public class IntArrayQueue {

	private int[] array;
	private int front; // 큐의 시작 지점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size; // 큐에 저장된 요소의 개수

	public IntArrayQueue(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// 데이터 넣기
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot enqueue " + item);
		} else {
			rear++;
			array[rear] = item;
			size++;
		}
	}
	
	// 데이터 꺼내기
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1;
		} else {
			// 100  200  300  400  0  0  0  0  0  0  
			//시나리오 - 처음 동작시 front 0 일때 
			int item = array[front];
			// front를 한 칸 앞으로 이동시켜서 데이터를 제거합니다.
			for (int i = front; i < rear; i++) {
				array[i] = array[i + 1];
				
			}
			// 마지막 요소를 초기화합니다.
			array[rear] = 0;
			// rear도 감소시켜줍니다.
			rear--;			
			size--;
			return item;
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty. No element to peek.");
			return -1;
		} else {
			return array[front];
		}
	}
	
	// 추후 확인 
//	public void printAll() {
//		if (isEmpty()) {
//			System.out.println("Queue is Empty");
//			return;
//		}
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + "  ");
//		}
//		System.out.println();
//	}

	// 테스트 코드
	public static void main(String[] args) {
		IntArrayQueue queue = new IntArrayQueue(3);
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400); // 안들어 감 
		queue.enqueue(500); // 안들어 감 
		System.out.println("-------------------------");
		System.out.println("꺼내기 : " +  queue.dequeue());
		System.out.println("꺼내기 : " +  queue.dequeue());
		System.out.println("1111, 2222 추가");
		queue.enqueue(1111);
		queue.enqueue(2222);
		System.out.println("꺼내기 : " +  queue.dequeue());
		System.out.println("꺼내기 : " +  queue.dequeue());
		System.out.println("꺼내기 : " +  queue.dequeue());
		System.out.println("꺼내기 : " +  queue.dequeue());
	}
}
