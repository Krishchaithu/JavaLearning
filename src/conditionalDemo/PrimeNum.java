package conditionalDemo;

public class PrimeNum {

	public static void main(String[] args) {
		int i,n1=0,count=-12;
		if(count%2==0){
			System.out.println("number not a  prime");
		}else{
			System.out.println("not is a gs prime");
		}
		
		for(i=2;i<=count/2;i++){
			if(count/i==0){
				System.out.println("the number is not prime");
				 n1 = 1;
				 break;
			}
			
		}
		if(n1==0){
			System.out.println("numb is prime");
		}

	}

}
