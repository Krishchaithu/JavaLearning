package constructor;

public class Objects {
    Objects(){
        fact(3);
    }
    int fact = 1;
    void fact(int i){
        for (int k = 1;k<=i;k++){
            fact = fact * k;
//            System.out.println(fact);
        }
        System.out.println(fact);
    }
}
class Employee {
    public static void main(String[] args) {
        new Objects().fact(3);
        Objects obj = new Objects();
        obj.fact(7);
        new Objects().fact(-1);
    }
}
