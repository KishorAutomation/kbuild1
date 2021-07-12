package Inheritance_polyMorprhism;

public class pulsar1 extends Bike1{
	
	int x=200;
public void run(){
	
	System.out.println("Run with 120kmh");
	
}

public static void main(String[] args){
	runstatic();
	Bike1 b;
	b= new Bike1();
	b.run();
	System.out.println(Bike1.x);
	b = new pulsar1();
	b.run();
	System.out.println(Bike1.x);
	
//	pulsar1 p =(pulsar1) new Bike1();
//	p.run(); 
//	System.out.println(p.x);
	
}
}
