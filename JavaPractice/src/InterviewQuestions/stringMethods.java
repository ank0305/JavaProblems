package InterviewQuestions;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		
		String s = "  It is a raining days here   ";
		String s1 = "IT is a raining days here";
		String s3 = "hellow_world_selenium_string";
		/*System.out.println(s.length());
		System.out.println(s.charAt(6));
		System.out.println(s.indexOf('s'));
		System.out.println(s.indexOf('s', 7));
		
		System.out.println(s.equalsIgnoreCase(s1));*/
		//substring
		System.out.println(s.substring(0, 12));
		
			System.out.println(s.trim());	
			System.out.println(s.replace(" ", ""));
			
			//Split
			
		String test[]= s3.split("_");
		
		for(int i=0;i<test.length;i++) {
				System.out.println(test[i]);
			

	}
		
		System.out.println(s.concat(s1));
	}
}
