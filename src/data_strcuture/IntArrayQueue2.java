package data_strcuture;

public class IntArrayQueue2 {

	private int[] array;
	private int front; // 큐의 시작 지점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size; // 큐에 저장된 요소의 개수

	public IntArrayQueue2(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	// 데이터 넣기
	public void enqueue(int item) {
		// 1  = 1 % 5 ; 몫 0, 나머지 1 
		// 2  = 2 % 5 ; 몫 0, 나머지 2 
		rear = (rear + 1) % capacity; // rear를 순환하도록 업데이트
		array[rear] = item;
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1;
		}
		int item = array[front];
		front = (front + 1) % capacity; // front를 순환하도록 업데이트
		size--;
		return item;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty. No element to peek.");
			return -1;
		}
		return array[front];
	}

	// 테스트 코드
	public static void main(String[] args) {
		IntArrayQueue2 queue = new IntArrayQueue2(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);
		queue.enqueue(500);
		System.out.println("-------------------------");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
}
