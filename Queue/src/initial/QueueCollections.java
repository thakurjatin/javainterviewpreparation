package initial;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(20);
		queue.add(30);
		System.out.println(queue.size());
//		Queue<Integer> q=new LinkedList<Integer>();
//        Stack<Integer> s=new Stack<Integer>();
//        q.add(5);
//        q.add(10);
//        s.push(10);
//        s.push(20);
//        System.out.print(q.peek()+s.pop());
	}
}
