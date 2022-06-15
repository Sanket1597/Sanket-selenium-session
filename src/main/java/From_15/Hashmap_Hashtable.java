package From_15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashmap_Hashtable {

	public static void main(String[] args) {
		
	//	HashMap<String,String> userMap= new HashMap<String,String>();
		Map<String,String> userMap= new HashMap<String,String>();
		
		userMap.put("id", "1");
		userMap.put("name", "tom");
		userMap.put("city", "pune");
		userMap.put(null, "pune");// only one nullkey is alloed , multiple null values are accepted 
		userMap.put("company", null);
		userMap.put("counrty", null);
		
		System.out.println(userMap.get("id"));
		
		for(Map.Entry m :userMap.entrySet()) {
			System.out.println(m.getKey()+" " + m.getValue());	
		}
		//Hashtable
		
		Hashtable<String,Integer> productTable= new Hashtable<String,Integer>();
		productTable.put("apple", 2000);
		productTable.put("hp", 3000);
		productTable.put("d", 4000);
		productTable.put(null, null);// no null key & value are hashtablr
		System.out.println(productTable);
		System.out.println(productTable.get("hp"));
			
		for(Map.Entry m :productTable.entrySet()) {
			System.out.println(m.getKey()+" " + m.getValue());
		
		//hashmap is not sychronized --not  thread safe
		
		
		
	}
	}
}
