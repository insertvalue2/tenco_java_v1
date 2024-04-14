package data_strcuture;

interface IQueue {
	// 데이터 넣기
	public void enQueue(String data);

	// 데이터 꺼내기
	public String deQueue();

	// 전체 출력
	public void printQueue();
}

public class MyListQueue extends MyLinkedList implements IQueue {
	
	MyLinkedList front; 
	MyLinkedList rear; 
	
	@Override
	public void enQueue(String data) {
		
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printQueue() {
		// TODO Auto-generated method stub

	}

	// 테스트 코드 
	public static void main(String[] args) {

	}

}
