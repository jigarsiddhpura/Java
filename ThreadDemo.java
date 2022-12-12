class Movie extends Thread {
  public synchronized void run() {
    for (int i = 1; i <= 5; i++) System.out.println(i);
  }
}
class ThreadDemo {

  public static void main(String z[]) {
    Movie m = new Movie();
    Thread t1 = new Thread(m);
    Thread t2 = new Thread(m);
    t1.start();
    t2.start();
    System.out.println("t1 thread is Alive? " + t1.isAlive());
    System.out.println("t2 thread is Alive? " + t2.isAlive());
    System.out.println("t1 thread is Alive? " + t1.isAlive());
    System.out.println("t2 thread is Alive? " + t2.isAlive());
  }
}
