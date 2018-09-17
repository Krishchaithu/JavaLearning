package conditionalDemo;

public class StringSplit {

	public static void main(String[] args) {
		String str1="NULL";
		
		if (true) {
		 str1 ="http://cat.markethub.shell.com";
			
		}
		String store[]=str1.split("\\.");
		System.out.println("print 1 "+ store[0]);
	}

}
