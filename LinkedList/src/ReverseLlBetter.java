import java.util.Scanner;

public class ReverseLlBetter {

	public static DoubleNode reverseLLBetter(Node<Integer> head) {
		
		if(head == null || head.next == null) {
			DoubleNode ans = new DoubleNode();
			ans.headNode = head;
			ans.tailNode = head;
			return ans;
		}
		
		DoubleNode smallAns = reverseLLBetter(head.next);
		smallAns.tailNode.next = head;
		head.next = null;
		
		DoubleNode ansDoubleNode = new DoubleNode();
		ansDoubleNode.headNode = smallAns.headNode;
		ansDoubleNode.tailNode = head;
		return ansDoubleNode;	
		
	}
	
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
	
	public static void main(String[] args) {

		
		Node<Integer> headNode = takeInput();
		DoubleNode ansDoubleNode = reverseLLBetter(headNode);
		print(ansDoubleNode.headNode);
	}

}



 class DoubleNode {

	Node<Integer> headNode;
	Node<Integer> tailNode;
}
