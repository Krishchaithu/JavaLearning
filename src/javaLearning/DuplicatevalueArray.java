package javaLearning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatevalueArray {

	public static void main(String[] args) {

		
		String Text1[]={"test","rest","nest","Fist","Mist","rest","test"};

		//using code to find dupilcate this is wrost approach if we have more values time consuming o(n*n)
		for (int i=0;i<Text1.length;i++){
			for (int j=i+1;j<Text1.length;j++){
				if(Text1[i].equals(Text1[j]))//comparing first element with all remaining elements with loop inside loop
				System.out.println("Duplicate Value: "+Text1[i]);
			}
		}
		System.out.println("\nsecond solution");
		// 2) using hashset : Java collections : it stores unique values : o(n)
		Set<String> store =new HashSet<String>();
		for(String name :Text1){
			if(store.add(name)==false){
				System.out.println("Duplicate value: "+name);
			}
		}
		System.out.println("\nThird solution");
		//3) using HashMap: it store in Key and value format
		
		Map<String,Integer> storemap= new HashMap<String, Integer>(); // storing the array in key and value format.
		for (String names :Text1){
			Integer count = storemap.get(names);
			if(count == null){
				storemap.put(names, 1);
			}else{
				storemap.put(names, ++count);
			}
		}
		Set<Entry<String,Integer>> enterySet = storemap.entrySet();// getting the key which have more than 1 value.
		for(Entry<String,Integer> entery: enterySet){
			if(entery.getValue()>1){
				System.out.println("Duplicate Value is: "+entery.getKey()+" repeted for "+entery.getValue());
			}
		}
		
		
		
	}

}
