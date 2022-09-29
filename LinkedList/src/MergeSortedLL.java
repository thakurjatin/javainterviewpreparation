import java.awt.print.Printable;
import java.util.Scanner;

public class MergeSortedLL {

	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
		
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		Node<Integer> t1 = head1, t2 = head2, head3 = null, tail3 = null;
		
		if(t1.data < t2.data) {
			head3 = t1;
			tail3 = t1;
			t1 = t1.next;
		}else {
			head3 = t2;
			tail3 = t2;
			t2 = t2.next;
		}
		
		while(t1 !=null && t2 !=null) {
			if(t1.data < t2.data) {
				//head3 = t2;
				tail3.next = t1;
				tail3 = t1;
				t1 = t1.next;
			}else {
			//	head3 = t1;
				tail3.next = t2;
				tail3 = t2;
				t2 = t2.next;
			}
		}
		if(t1 != null) {
			tail3.next = t1;
		}else {
			tail3.next = t2;
		}
		
		return head3;
		
	}
	
	public static void main(String[] args) {

		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer> head3 = merge(head1, head2);
		print(head3);
	}

	private static void print(Node<Integer> head3) {
		
		while(head3 != null) {
			System.out.println(head3.data + " ");
			head3 = head3.next;
		}
		System.out.println();
		
	}

	private static Node<Integer> takeInput() {
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head =newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

}
