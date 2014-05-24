
import java.util.*;
public class Klasa1 {

	static Collection fill(Collection<String> collection)
	{
		collection.add("szczur");
		collection.add("kot");
		collection.add("pies");
		collection.add("mysz");
		return collection;
	};
	
	static Map fill(Map <String, String> map) // tak jak w slowniku - obiekt -obiekt
	{
		map.put("szczur", "rat");
		map.put("kot", "cat");
		map.put("pies", "dog");
		map.put("mysz", "mouse");
		return map;
	}
	
	public static void main(String[] args)
	{
		System.out.println("LinkedList: " + fill(new LinkedList<String>()));
		System.out.println("ArrayList: " +fill(new ArrayList<String>()));
		System.out.println("HashSet: " + fill(new HashSet<String>()));
		System.out.println("TreeSet: " + fill(new TreeSet<String>()));
		System.out.println("LinkedHashSet: " + fill(new LinkedHashSet<String>()));
		System.out.println("HashMap: " +fill(new HashMap<String,String>()));
		System.out.println("TreeMap"  + fill(new TreeMap<String,String>()));	
		System.out.println("LinkedHashMap: " + fill(new LinkedHashMap<String,String>()));
		
	}
}
