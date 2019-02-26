// program to demonstrate use of getId () function

public class Question49 implements Runnable {
   Thread t;
   Question49() {
      t = new Thread(this, "Admin Thread");
      t.setPriority(1);
      System.out.println("thread  = " + t);
      t.start();
   }
   public void run() {
      System.out.println("Name = " + t.getName());
      System.out.print("Id = " + t.getId());
   }
   public static void main(String[] args) {
      new Question49();
   }
}