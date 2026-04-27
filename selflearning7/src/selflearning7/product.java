package selflearning7;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class product {
	
	

	public static void main(String[] args) {
		Map<Integer,String> map = new Hashtable<>();
		map.put(1, "laptop");
		map.put(2, "bag");
		map.put(2, "mobile");
		map.put(1, "headphone");
		
		Set<Entry<Integer, String>> entySet = map.entrySet(); 
		for (Entry<Integer, String> en : entySet) {
			Integer key = en.getKey(); 
			String val = en.getValue(); 
			System.out.println(key + "----" + val);
		}

	}

}
