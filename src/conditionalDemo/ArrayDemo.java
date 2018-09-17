package conditionalDemo;

public class ArrayDemo {

	public static void main(String[] args) {
        int []array = new int[20];
        for (int count=0;count<7;count++){
           array[count]=count+1;
       }
       for (int count=0;count<7;count++){
           System.out.println("array stary with "+count+" "+array[count]);
       }
      System.out.println("Length of Array  =  "+array.length);
      array[8] =10;
      
       int intarray[] ={12,12,16,16};
       
       for (int count=0;count < intarray.length; count++)
       {
    	   System.out.println("array position at "+count+" "+intarray[count]);
       }
      }
}