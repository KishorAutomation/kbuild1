package P1;

public class ReverseNumb {
	
	public static void main(String[] args){
		
		int number = 987654;
		int remainder= 0;
		int reverNumber = 0;
		while(number!=0){
			remainder = number%10;
			reverNumber = reverNumber*10+remainder;
					number = number/10;	
		}
		System.out.print(reverNumber);
		
	}

}
