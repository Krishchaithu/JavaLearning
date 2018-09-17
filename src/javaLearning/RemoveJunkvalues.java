package javaIntQ;

public class RemoveJunkvalues {

	public static void main(String[] args) {

		String s="!!!!This## ti The #@NTN $UNBJKBFDNO#N ONO$ #@$$f athi$gdg dnglsn34notgio4nto4";
		
		// we can remove junk values using regular expressions [^a-zA-Z0-9] use \\s for ignoring space in string 
		//https://www.youtube.com/watch?v=s_PfopWcMwI
		
		s=s.replaceAll("[^\\sa-zA-Z0-9]", " ");
		System.out.println(s);
		
		
		
		
	}

}
