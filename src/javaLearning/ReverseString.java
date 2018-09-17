package javaIntQ;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "no one knows wen to start and wen to end";
		int length =s.length();
		System.out.println(length);
		String rev="";
		//Reverse a string with for loop
		for (int i=length-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		//reverse a string with String buffer in-built function sting buffer is mutable function and string is not mutable reverse will not work
		StringBuffer sf =new StringBuffer(s);
		System.out.println(sf.reverse());
		
	}

}
