import java.util.HashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		
		// Map: Key and pair value
		// Fruit-->  10
		// Grapes-->  20
		// Mangoes --> 50
		
		String[] fri = {"Fruits", "Grapes", "Mango", "Papaya"};
		Map<String,Integer> map= new HashMap<String,Integer>();
		//Map<Character,String> map= new HashMap<Character,String>();
		map.put(fri[0], 10);
		map.put(fri[1], 20);
		map.put(fri[2], 30);
		map.put(fri[3], 50);
		System.out.println(map.get("Fruits"));
		System.out.println(map.get("Grapes"));
		System.out.println(map.get("Mango"));	
		System.out.println(map.get("Papaya"));
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(String a:map.keySet())
		{
			if(a.equals("Papaya"))
			{
				System.out.println(map.get(a));
			}
		}
		for(String a:map.keySet())
		{
			if(map.get(a)==20)
			{
				System.out.println(a);
			}
		}
				
		}
	}
	

