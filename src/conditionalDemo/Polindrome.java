package conditionalDemo;

public class Polindrome {

	public static void main(String[] args) {
		int r,sum=0,temp;
		int n=2332;
		temp=n;
		while(n>0){
			r=n%10;
			System.out.println(r);
			sum=(sum*10)+r;
			System.out.println(sum);
			n=n/10;
			System.out.println("third"+n);
			
		}
		if(temp==sum){
			System.out.println("polindeone");
		}else{
			System.out.println("not a polindrone");
		}

	}

}
