package Important_Concepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicate_elements {

	public static void main(String[] args) {
		String[] names= {"java","selenium","testng","java","cucumber","selenium"};
		
		//compare each element(O[nxn])-- time complexity is high
		
		for (int i=0;i<names.length;i++){
			
			for (int j= i+1;j<names.length;j++){
				
				if (names[i].equals(names[j])){
					
					System.out.println("duplicate element is found-->"+names[i]);
				}
			}
		}
		System.out.println("+++++++++++++++++");
//using HashSet{it stores unique values} (O(n)) time complexity is less
		
		Set<String> hash= new HashSet<String>();
		for (String name: names){
			
			if (hash.add(name)== false){
				
				System.out.println("the duplicate found using HashSet is --->"+name);
			}
			
		}
		System.out.println("+++++++++++++++++");
		//using  HashMap logic (O(2n)) time complexity is really less
		
		Map<String, Integer> store=new HashMap<String,Integer>();
		
		for (String name: names){
			
			Integer count =store.get(name);
			
			if (count==null){
				
				store.put(name, 1);
			}
			else {
				
				store.put(name, ++count);
				
			}}
			
			Set<Entry<String, Integer>> entryset= store.entrySet(); 
			for(Entry<String, Integer> entry: entryset){
				
				if (entry.getValue()>1){
					
					System.out.println("the duplicate value found using hashMap is ---->"+entry.getKey());
					
				}
				
			}
			
		}
		
		
		
	

}
