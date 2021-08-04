package constructor;

public class Moped {
    int accounNumber;
    String employeeName;
    String work ;
    void inset(){
        accounNumber = 20012;
        employeeName = "itachi";
        work = "Dark Knight";
    }
    void displayInfo(){
        System.out.println(accounNumber+" "+employeeName+" "+work);
    }
    Moped(int i,String s1, String s2){
        accounNumber = i;
        employeeName = s1;
        work = s2;
        System.out.println(accounNumber+" "+employeeName+" "+work);
    }
}
class test{
    public static void main(String[] args) {
        Moped m = new Moped(20,"krishna","automation");
//        System.out.println(m);
        m.inset();
        m.displayInfo();


    }
}
