import java.util.Scanner;

public class InsertRecursively {

	public static Node<Integer> takeInput(){
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head){
		
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static Node<Integer> insert(Node<Integer> head, int pos, int elem){
		
		if(pos == 0) {
			Node<Integer> newNode = new Node<>(elem);
			newNode.next = head;
			return newNode;
		}
		
		head.next = insert(head.next, pos-1, elem);
		return head;
		
	}
	
	public static void main(String[] args) {

		Node<Integer> headNode = takeInput();
		headNode = insert(headNode, 2, 10);
		print(headNode);
		
	}

}
