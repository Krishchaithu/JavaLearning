package javaLearning;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map <String,String> obj1 = new HashMap<String,String>();
		obj1.put("Hashirama", "Madara");
		obj1.put("Kakashi", "Obito");
		obj1.put("Naruto", "sasuke");
		obj1.put("oruchimaro", "jiraya");
		obj1.put("Hinata", "Sakura");
		System.out.println("the key pares are : "+obj1);
		Map <Integer,String> obj2 = new HashMap<Integer,String>();
		obj2.put(1, "Madara");
		obj2.put(2, "Obito");
		obj2.put(3, "sasuke");
		obj2.put(4, "jiraya");
		obj2.put(5, "Sakura");
		System.out.println("the key pares are : "+obj2);
		System.out.println(obj2.keySet());
		System.out.println(obj1.keySet());
		System.out.println(obj2.values());
		obj2.remove(3);
		System.out.println(obj2);

	}

}
