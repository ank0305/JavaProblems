package InterviewQuestions;

public class reversAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 123456;
		int rev =0;
		while(i!=0) {
			
			rev = rev*10 +i%10;//6
			i=i/10;//12345
			
		}
		
		
		System.out.println(rev);
		

	}

}
