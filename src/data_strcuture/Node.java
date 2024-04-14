package data_strcuture;

/**
 * String 데이터를 하나의 노드로 만들어 보자.
 * 
 */
public class Node {

	private String data; // 자료
	public Node next; // 다음 노드를 가리키는 링크
	// 자기 참조(Self-referencing) 관계
	// 정의: 자기 참조는 객체가 자신과 같은 타입의 다른 객체를
	// 가리키는 경우를 말합니다.
	// 용도: 연결 리스트, 트리 구조에 많이 활용

	// 생성자 - 1
	public Node() {
		data = null;
		next = null;
	}

	// 생성자 - 2
	public Node(String data) {
		this.data = data;
		this.next = null;
	}

	// 생성자 - 3
	public Node(String data, Node link) {
		this.data = data;
		this.next = link;
	}

	public String getData() {
		return data;
	}

}
