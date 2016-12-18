package Edu2.Module_5_Assignments.src.module5.asso;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public final class TestMap 
{
	public static void main(String[] args) 
	{
		Hashtable<String, String> countries = new Hashtable<String, String>();

		// Hashtable.put(key=country, value=capital) 
		countries.put("India", "New Delhi");
		countries.put("Nepal", "Kathmandu");
		countries.put("Bhutan", "Thimpu");
		countries.put("Pakistan", "Islamabad");
		countries.put("Sri Lanka", "Colombo");

		// Hashtable.get(key) method is used to retrieve values from the Hashtable
		System.out.println("Capital of India: " + countries.get("India"));

		// Use Hashtable.containsKey(Object) method to check if an key in the Hashtable
		System.out.println("Does hashtable contain Pakistan as key: "
				+ countries.containsKey("Pakistan"));

		// Hashtable.containsValue(Object) returns true if Hashtable contains the specified value
		System.out.println("Does hashtable contain Thimpu as value: "
				+ countries.containsValue("Thimpu"));


		// Hashtable.elements() return enumeration of all Hashtable values
		System.out.println("Hashtable values:");
		Enumeration<String> enumeration = countries.elements();
		while (enumeration.hasMoreElements()) 
			System.out.println(enumeration.nextElement());


		// Hashtable.isEmpty() to check emptiness of Hashtable 
		System.out.println("Is hashtable empty: " + countries.isEmpty());
		// Hashtable.size() method to find size of hashtable in Java
		System.out.println("Size of hashtable: " + countries.size());


		// Hashtable.keySet() method to get a Set of all the keys 
		System.out.println("Keyset Elements:");
		Set<String> hash_set = countries.keySet();
		Iterator<String> it = hash_set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		// Hashtable.keys() return enumeration of all Hashtable keys
		System.out.println("Hashtable dump:");
		enumeration = countries.keys();
		Object obj = null;
		while (enumeration.hasMoreElements()) 
		{
			obj = enumeration.nextElement();
			// Using the key to retrieve the value.
			System.out.println(obj + " " + countries.get(obj));
		}

		// Hashtable.clear() clears all mappings, we can reuse an existing hashtable.
		countries.clear();
		System.out.println("Size of hashtable after clearing: " + countries.size());
	}
}
