package collections;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.LinkedList<Integer> list = new java.util.LinkedList<Integer>();
		System.out.println(list.size());
		list.add(5);
		list.add(8);
		System.out.println(list.size());
		list.addFirst(99);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
