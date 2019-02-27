// program to demonstrate use of getId () function

class Demo extends Thread {
        public void run () {
                System.out.println ("Name is " + this.getName () + ".");
                System.out.println ("Thread ID: " + this.currentThread ().getId ());
                for (int i = 3; i > 0; i--) 
                        System.out.println (i);
        }
}

public class Question49 {
        public static void main(String[] args) {
                for (int i = 0; i < 3; i++) {
                        Demo obj = new Demo ();
                        obj.start ();
                }
        }
}