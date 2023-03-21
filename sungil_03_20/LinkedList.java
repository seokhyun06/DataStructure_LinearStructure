package sungil_03_20;

public class LinkedList {
	// 첫번째 노드를 가리키는 필드
	private Node head;
	private Node tail;
	private int size = 0;
	private class Node {
		private Object data; // 데이터가 저장할 필드
		private Node next; // 다음 노드를 가리키는 필드
		public Node(Object input) {
			this.data = input;
			this.next = null;
					
		}
		// 노드의 내용을 쉽게 출력해서 확인해볼 수 있는 기능
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	public void addFirst(Object input) {

		Node temp =new Node(input);	// 노드를 생성합니다.
		temp.next = head; // 새로운 노드의 다른 노드로 해드를 지정합니다.
		head = temp; // 해드로 새로운 노드를 지정합니다.
		size++;
		if(head.next == null){
			tail = head;
		}
	}
	public void addLast(Object input) {
		Node temp = new Node(input); // 노드를 생성합니다.
		if(size == 0) {
			addFirst(input);
		} 
		else { 
			tail.next = temp; // 마지막 노드의 다음 노드를 생성한 노드를 지정합니다.
			tail = temp; // 마지막 노드를 갱신합니다.
			size++; // 엘리먼트의 개수를 1 증가 시킵니다.

		}
	}
}
