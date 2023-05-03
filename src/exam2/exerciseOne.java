package exam2;

public class exerciseOne extends Thread {

  @Override
  public void run() {
    
    System.out.println("Ажиллаж байна " + Thread.currentThread().getName() + "!");
  }

  public static void main(String[] args) {
   
    exerciseOne thread1 = new exerciseOne();
    exerciseOne thread2 = new exerciseOne();
    
    
    thread1.setName("Thread 1");
    thread1.setPriority(Thread.MAX_PRIORITY);
    thread2.setName("Thread 2");
    thread2.setPriority(Thread.MIN_PRIORITY);
    
    
    thread1.start();
    thread2.start();
    
    
    System.out.println("Нийт thread ийн тоо: " + Thread.activeCount());
    System.out.println(thread1.getName() + " идэвхитэй байдал: " + thread1.isAlive());
    System.out.println(thread2.getName() + " идэвхитэй байдал: " + thread2.isAlive());
  }
}
