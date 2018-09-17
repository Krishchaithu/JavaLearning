package javaLearning;

public class StringFormate {

	public static void main(String[] args) {
		Object floatVar = 7.5;
		Object intVar = 5;
		String stringVar = "test  thi s   ";
		System.out.printf("The value of the float variable is " + "%f, while the value of the integer "
				+ "variable is %d, and the string " + "is %s", floatVar, intVar, stringVar);
		System.out.println("n" + stringVar.length());
		String newstring = stringVar.trim();
		System.out.println(stringVar.trim() + " " + stringVar.length() + " " + newstring.length());
	}

}
