package InterviewQuestions;

public class removeJunkChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "$#@%$#%@%@ Test ))*&%%";

s= s.replaceAll("[^a-zA-z0-9]", "");

System.out.println(s);
	}

}
