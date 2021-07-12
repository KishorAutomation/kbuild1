package P1;

public class Casting {
	  public static void main(String[] args) {
		    int myInt = 9;
		    double myDouble = myInt; // Automatic casting: int to double

		    System.out.println(myInt);      // Outputs 9
		    System.out.println(myDouble);   // Outputs 9.0
		    
		    double d = 9.78f;
		    int i = (int) d; // Manual casting: double to int

		    System.out.println(d);   // Outputs 9.78
		    System.out.println(i);      // Outputs 9
		  }
}
