import java.util.Scanner;

public class ReverseLL {

	public static Node<Integer> takeInput(){
		
		Node<Integer> headNode = null, tailNode = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(headNode == null) {
				headNode = newNode;
				tailNode = newNode;
			}
			else {
				tailNode.next = newNode;
				tailNode = newNode;
			}
			data = s.nextInt();
		}
		return headNode;
	}
	
	public static void print(Node<Integer> head) {
		
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
		
	}
	
	public static Node<Integer> reverseR(Node<Integer> head){
		
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> finalHead = reverseR(head.next);
		Node<Integer> tempNode = finalHead;
		while(tempNode.next != null) {
			tempNode = tempNode.next;
		} 
		tempNode.next = head;
		head.next = null;
		return finalHead;
	}
	
	public static void main(String[] args) {

		Node<Integer> updatedNode = takeInput();
		updatedNode = reverseR(updatedNode);
		print(updatedNode);
	}

}
