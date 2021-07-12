package P1;

public class StringSample {

	public static void main(String[] args) {
		char ch[]={'s','t','r','i','n','g','s'};  
		String s1 = "Kishor";
		String s2 = new String(ch);
		 
		System.out.println(s1);  
		System.out.println(s2); 
		
		System.out.println(s1.length());
		System.out.println(ch.length);  
		
		for(int i =0; i<ch.length;i++)
		System.out.println(ch[i]);  
		
	}

}
