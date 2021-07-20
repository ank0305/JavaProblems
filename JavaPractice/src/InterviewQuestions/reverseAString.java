package InterviewQuestions;

public class reverseAString {

	public static void main(String[] args) {
		
		
		
		/*String s = "Selenium" ;
		int len =s.length();
		String rev = "";
		
		for(int i=len-1;i>=0;i--)
		{
			rev= rev+s.charAt(i);
		}
		
		System.out.println("Reverse of String is " +rev);*/
		
		
		StringBuffer s1 = new StringBuffer("Selenium");
		s1.reverse();
		System.out.println(s1);
	}

}
