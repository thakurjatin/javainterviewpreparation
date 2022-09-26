import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapBasics {

	public static void main(String[] args) {
		
		Map<String, Integer> hmap1 = new HashMap<String, Integer>();
		hmap1.put("First", 1);
		hmap1.put("Seconf", 2);
		hmap1.put("Third", 3);
		hmap1.put("Fourth", 4);
		hmap1.put("Fifth", 5);
		hmap1.put("Six", 6);
		hmap1.put("Seven", 7);
		hmap1.put("Eight", 8);
		hmap1.put("Nine", 9);
		
		// printing key-value pair
		
	//	Set<Entry<String, Integer>> setting = hmap1.entrySet();
		for(Entry<String, Integer> entry : hmap1.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		System.out.println("----------------------------------------------");

		// printing keys or values
		for(String entry : hmap1.keySet()) {
			System.out.println("Key : " + entry);
		}
		for(Integer entry : hmap1.values()) {
			System.out.println("Values :" + entry);
		}
		
		// using iterator
		System.out.println("----------------------------------------------");
		Iterator<Map.Entry<String, Integer>> itr = hmap1.entrySet().iterator();
		while(itr.hasNext()) {
			
		Map.Entry<String, Integer> entry = itr.next();
		System.out.println("Key = " + entry.getKey() + " Values : " + entry.getValue());
		}

		// using forEach(action) methid java8 lambda expression
		System.out.println("----------------------------------------------");
		hmap1.forEach((Key123, Value123) -> System.out.println("Key = " + Key123 + " Value = " + Value123));
		
		// syncronized map 
		Map<String, Integer> hmap2 = Collections.synchronizedMap(hmap1);
		
	}
}
