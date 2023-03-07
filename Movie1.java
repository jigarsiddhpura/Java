class Movie extends Thread {
//  v = vacant , r = required
  int v = 2, r;

  Movie(int x) {
    r = x;
  }

  public synchronized void run() {
    if (r <= v) {
      System.out.println(
        "tickets are booked for " + Thread.currentThread().getName()
      );
      try {
        Thread.sleep(100);
      } catch (Exception e) {}
      v = v - r;
    } else {
      System.out.println("Housefull " + Thread.currentThread().getName());
    }
  }
}

class Movie1 {

  public static void main(String z[]) {
    Movie m = new Movie(1);
    Thread t1 = new Thread(m);
    Thread t2 = new Thread(m);
    Thread t3 = new Thread(m);
    t1.setName("Thread1");
    t2.setName("Thread2");
    t3.setName("Thread3");
    t1.start();
    t2.start();
    t3.start();
  }
}
