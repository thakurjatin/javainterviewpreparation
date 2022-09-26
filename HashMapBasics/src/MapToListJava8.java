import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapToListJava8 {

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
		
		
		// mapkeys to list and sort
		
		List<String> keyList = hmap1.keySet().stream().sorted().collect(Collectors.toList());
		keyList.forEach(System.out::println);
		
		// mapValues to List and sort
		List<Integer> valueList = hmap1.values().stream().sorted().collect(Collectors.toList());
		valueList.forEach(System.out::println);
		
		// map key and values to list and sort
		Map<String, Integer> mapSorted = hmap1.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new)); 	
		
		Map<String, Integer> map2 = new LinkedHashMap<String, Integer>();
		hmap1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach((a -> map2.put(a.getKey(), a.getValue())));
		System.out.println(map2);
		System.out.println(mapSorted);
	}
}
