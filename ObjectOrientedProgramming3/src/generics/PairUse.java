package generics;

public class PairUse {

	public static void main(String[] args) {

//		Pair p = new Pair(1, 2);
//		p.setFirst(10);
//		System.out.println(p.getFirst());
//		System.out.println(p.getSecond());
		
		Pair<String, String> p = new Pair<String, String>("ab", "cd");
		p.setFirst("def");
		String s = p.getFirst();
		
		int a =10;
		int b =20;
		int c =30;
		Pair<Integer, Integer> i = new Pair<>(a,b);

		
		Pair<Pair<Integer, Integer>, Integer> p2 = new Pair<>(i,c);
		
		System.out.println(p2.getSecond());
		System.out.println(p2.getFirst().getFirst());
		System.out.println(p2.getFirst().getSecond());
		

	}

}
