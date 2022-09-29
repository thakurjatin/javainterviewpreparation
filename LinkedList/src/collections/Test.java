package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.ibm.json.java.JSONObject;
import com.ibm.json.java.OrderedJSONObject;

public class Test {

	public static void main(String[] args) {
		List<String> attribute = new ArrayList<String>();
		attribute.add("status");
		attribute.add("owner");
		attribute.add("description");		
		attribute.add("urgency");	
		attribute.add("description_longdescription");
		attribute.add("Worklog");
		attribute.add("Worklog Details");
		attribute.add("impact");		
		//System.out.println(attribute);		
	
		JSONObject jsonobjMap = new JSONObject();
		for(String as : attribute) {jsonobjMap.put(as, as);}
		
		OrderedJSONObject jsonobjMapO = new OrderedJSONObject();		
        for(String as : attribute) {jsonobjMapO.put(as, as);}
       // Iterator<OrderedJSONObject> i = jsonobjMapO.getOrder();
        
        
	/*
	 * for (Object object : jsonobjMap.entrySet()) {
	 * 
	 * @SuppressWarnings("unchecked") Map.Entry<String, JSONObject> entry =
	 * (Entry<String, JSONObject>) object; jsonobjMapO.put(entry.getKey(),
	 * entry.getValue()); }
	 */
		System.err.println(jsonobjMap);		
		System.out.println(jsonobjMapO);
		
//		jsonobjMap.containsKey()
		
		
		OrderedJSONObject out4 = new OrderedJSONObject();	
		
		Iterator<OrderedJSONObject> i = jsonobjMapO.getOrder();
		while(i.hasNext()) {
			
			String keyString = i.next() +"";
			out4.put(keyString, jsonobjMapO.get(keyString));
		}
		
		System.out.println(out4);
		

	}
	
	
	
	
}
