import java.util.Scanner;

// program to demonstrate the use of static variable, static method and static block

class Student {  
   int rollno;
   String name; 
   static String college;
   static void changeCollege (String c) { college = c; }
   static {
      college = "MSI";
      System.out.println ("Static block invoked.");
   }
   Student (int r, String n) {
      rollno = r;  
      name = n;  
   }
   void display () { System.out.println(rollno + " " + name + " " + college); }
}  

public class Question27 { 
   public static void main (String args[]) {  
      Scanner input = new Scanner (System.in);
      Student s1 = new Student (10, "Vihan");  
      Student s2 = new Student (11, "Niharika");  
      s1.display ();
      s2.display ();
      System.out.print ("Enter new college: ");
      String newCollege = input.next ();
      s1.changeCollege (newCollege);
      System.out.println ("After changing college: ");
      s1.display ();
      s2.display ();
   }
}