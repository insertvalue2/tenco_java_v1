package data_strcuture;

public class MyLinkedList {

	private Node head; // 요소의 맨 처음
	int count; // MyLinkedList에 몇개의 노드가 연결 되어 있는가.

	// MyLinkedList 처음 생성시 노드는 없는 상태
	public MyLinkedList() {
		head = null;
		count = 0;
	}

	// 새로운 Node 1개 추가
	public Node addElement(String data) {
		Node createNode = new Node(data);
		if (head == null) {
			// 맨 처음을 일 때 head 에 참조 값 대임
			head = createNode;
		} else {
			// [] -> [찾아야함, node --> null]
			// newNode을 [찾아야함, node.next = newNode(주소)]
			// newNode --> [data, null];
			// 즉, 새로 생성한 노드 앞 노드에 newNode 주소를 넣어야
			// 연결이 된다.

			Node preNode = head; // head 부터 찾아야 다음 노드를 찾을 수 있음
			// 데이터를 잠시 보관하는 용도로 사용 됨 preNode --> temp
			while (preNode.next != null) {
				// node.next 속성이 null 아니라면 수행 됨
				preNode = preNode.next;
			} // 맨 뒤로 감 즉, preNode는 [x, null] 전에 멈춤
			preNode.next = createNode; // 새로 생성한 노드 주소 넣기
		}
		count++; // MyLinkedList.count 속성에 연결 된 개수를 1 증가
		return createNode;
	} // end of addElement

	// 저장된 Node의 개수
	public int getSize() {
		return count;
	}

	public Node removeElement(int position) {
		// 방어적 코드 작성
		if (position >= count) {
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
			return null;
		}

		// 동작에 시작은 head 부터 -> 임시 상자에 담아 두기
		Node tempNode = head;
		// Node nextNode = head.next;

		if (position == 0) { // 맨 앞을 삭제요청 경우
			head = tempNode.next;
		} else {

			Node preNode = null;
			// position - 3라고 가정
			// 한번, 두번 반복 동작
			for (int i = 0; i < position; i++) {
				// 한번 : tempNode(head)
				preNode = tempNode;
				// 한번 : tempNode.next --> 다음 노드를 말함
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "번째 항목 삭제되었습니다.");
		return tempNode;
	}

	// 전제 출력 하기
	public void printAll() {
		// 방어적 코드 작성
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if (temp != null) {
				System.out.print(" --> ");
			}
		}
		System.out.println();
	}

	// 지정한 위치의 노드 하나만 출력하기
	public Node getNode(int position) {

		if (position >= count) {
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
			return null;
		}

		Node tempNode = head;

		if (position == 0) {
			return head;
		}

		for (int i = 0; i < position; i++) {
			tempNode = tempNode.next;
		}
		return tempNode;
	}
	// 전체 삭제 
	public void removeAll() {
		head = null;
		count = 0;
	}

	// 테스트 코드
	public static void main(String[] args) {

		// add 동작 확인
		// 롤 챔프 이름을 LinkedList로 보관해보자
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addElement("야스오");
		myLinkedList.addElement("티모");
		myLinkedList.addElement("소라카");
		myLinkedList.addElement("샤코");
		System.out.println("count : " + myLinkedList.getSize());

		// 삭제 동작 확인
		myLinkedList.removeElement(0);
		System.out.println("count : " + myLinkedList.getSize());
		System.out.println("---------------------");
		
		// myLinkedList.removeAll(); <-- 전체 삭제 
		
		// 전체 출력 하기
		myLinkedList.printAll();
		System.out.println("---------------------");
		
		// 하나만 출력
		Node targetNode = myLinkedList.getNode(1);
		System.out.println(targetNode.getData());

	}

}
