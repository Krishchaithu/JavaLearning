package conditionalDemo;

class ArrayObjectDemo{
   public static void main(String args[]){
     Account obj[] = new Account[3] ;
     obj[0] = new Account();
     obj[1] = new Account();
     obj[2]=new Account();
    obj[0].setData(1,2,3);
    obj[1].setData(3,4,5);
    obj[2].setData(12,15,15);
    System.out.println("For Array Element 0");
    obj[0].showData();
    System.out.println("For Array Element 1");
     obj[1].showData();
     System.out.println("For array Element 2");
     obj[2].showData();
  }
  }

class Account{
  int a;
  int b;
  int z;
 public void setData(int c,int d,int y){
   a=c;
   b=d;
   z=y;
 }
 public void showData(){
   System.out.println("Value of a ="+a);
   System.out.println("Value of b ="+b);
   System.out.println("value of y ="+z);
 }
}