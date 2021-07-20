package InterviewQuestions;

public class largestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numbers[]= {-10,24,28,4565};

int largest =numbers[0];
int smallest =numbers[0];

for (int i=0;i<numbers.length;i++) {
	
	if(numbers[i]>largest) {
		
		largest=numbers[i];
		
	}
	else if (numbers[i]<smallest)
		
		smallest= numbers[i];
	
	
}

System.out.println(largest);
System.out.println(smallest);





	}

}
