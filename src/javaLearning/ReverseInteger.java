package javaIntQ;

public class ReverseInteger {

	public static void main(String[] args) {

		int v1=1234;
		int num =0;
		
		while (v1!=0){
			num =num*10 +v1%10;  // v1%10 will eliminate the last digit and multiplying with 10 will incraease the 10th position each time
			v1=v1/10;
			
		}
		System.out.println(num);
		
		// using stringBuffer class 
		int num1=1234546;
		StringBuffer sb=new StringBuffer(String.valueOf(num1)).reverse();
		System.out.println(Integer.parseInt(sb.toString()));
	}

}
