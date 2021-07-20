package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class duplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"Java","C","Path","Java","javaScript","C"};
		
		Set<String> store = new HashSet<String>();
		
		
		for(String name: names) {
			
			if(store.add(name)==false) {
				
				System.out.println(name);
			}
			
	
				
		
			}
		
		}
	

	}

