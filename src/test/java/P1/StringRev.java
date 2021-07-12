package P1;

public class StringRev {
	public static void main(String[] args){
		
	String s = "kishor";
	String sr = "";
	for(int i=s.length()-1;i>=0;i--){
		sr = sr+s.charAt(i);
		
	}
	System.out.println(sr);
		
	}

}
