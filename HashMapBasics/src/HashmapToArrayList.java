import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapToArrayList {

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
		
		// getting set of keys
		Set<String> keySet = hmap1.keySet();
		// creating arraylist
		List<String> listOfKeys = new ArrayList<String>(keySet);
		System.out.println(listOfKeys);
		for(String list : listOfKeys) {
			System.out.println(list);
		}
		System.out.println("-------------------------------------------------------");
		// getting collection of values
		
		Collection<Integer> list = hmap1.values();
		List<Integer> vaulueList = new ArrayList<Integer>(list);
		System.out.println(vaulueList);
		Collections.sort(vaulueList);
		System.out.println(vaulueList);
		for(Integer list1 : vaulueList) {
			System.out.println(list1);
		}
		System.out.println("-------------------------------------------------------");

		// Getting the set of entries
		
		Set<Entry<String, Integer>> entrySet2 = hmap1.entrySet();
		List<Entry<String, Integer>> list3 = new ArrayList<Map.Entry<String,Integer>>(entrySet2);
		System.out.println(list3);
		for(Entry<String, Integer> finalEntry : list3) {
			System.out.println(finalEntry.getKey() + "  " + finalEntry.getValue());
		}
		
	}
}
