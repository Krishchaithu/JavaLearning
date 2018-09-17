package conditionalDemo;

public class StringDemo {

	public static void main(String[] args) {
		// string is an array of chars
		char simplestring[]={'K','I','N','G','S'};
		for(int count=0; count < simplestring.length; count++){
			System.out.println(simplestring[count]);
		}
		// assigning array of chars to string
		String hashirama= new String (simplestring);
		System.out.println(hashirama+" "+simplestring.length);
		
		// Character at position and Index of character
		{
			hashirama=("the first Hokage");
			String Madara=(" the rival of the first Hokage");
			String number=("10000");
			System.out.println("character at position : "+ hashirama.charAt(5));
			System.out.println("index of character : "+hashirama.indexOf('r'));
			
			// compareto Method
			System.out.println("comaring the string : "+hashirama.compareTo("the first hokage"));
			System.out.println("comaring the string : "+hashirama.compareToIgnoreCase("the first hokage"));
			System.out.println("checking "+hashirama.contains(Madara));
			System.out.println("the combination of gr8 power "+hashirama.concat(Madara));
			System.out.println(hashirama.toUpperCase());
			System.out.println(Madara.toLowerCase());
			
			// converting string to Integer
			
			{
				System.out.println("after conversion: "+Integer.parseInt(number));
			}
		}

	}

}
