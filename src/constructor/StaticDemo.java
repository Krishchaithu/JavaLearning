package constructor;

public class StaticDemo {

}
  class Student {
     int rollno;
     String studentName;
     static String collegeName="Old Name";

     static void change(String NN) {
         collegeName = NN;
     }

     Student(int r, String sn) {
         rollno = r;
         studentName = sn;
     }

     void display() {
         System.out.println(rollno + " " + studentName + " " + collegeName);
     }
}
 class TestStatic{
    public static void main(String[] args) {
        Student s1 = new Student(1,"siva"),s2=new Student(2,"H1"),s3 = new Student(3,"pr");
    s1.display();
    s2.display();
    s3.display();
    Student.change("newName");
        System.out.println("after change");
        s1.display();
        s2.display();
        s3.display();
    }
}

