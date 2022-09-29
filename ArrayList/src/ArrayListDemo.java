import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println(list1.size());
		list1.add(2);
		list1.add(4);
		list1.add(8);
		list1.add(2, 14);
		//list1.get(4);
//		System.out.println(list1.size());
//		System.out.println(list1);
		for(int ele: list1) {
			System.out.print(ele + " ");
			ele = 1000;
		}
		System.out.println();

		for(int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		
//		list1.set(2, 100);
//		for(int i =0; i<list1.size(); i++) {
//			System.out.print(list1.get(i) + " ");
//		}
	}
}
