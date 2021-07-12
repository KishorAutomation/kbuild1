package Inheritance_polyMorprhism;

public class Bank_Polymorphism {
	public static void main(String args[]) {
		bank b;
		b = new SBI();
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
		
	}
}
