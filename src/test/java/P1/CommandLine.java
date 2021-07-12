package P1;

import java.util.Scanner;

public class CommandLine {
//	public static void main(String[] args){
//		for(int i=0;i<args.length;i++){
//			System.out.print(args[i]);
//			
//		}
//		
//	}
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Username is: " + userName);  // Output user input
	  }
}
