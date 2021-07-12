package P1;

public class String_Equal {

	public static void main(String[] args) {
	
		String s1 = "Sachin";
		String s2 = "SACHIN";
		String s3 = s1;
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s3));
	}

}
