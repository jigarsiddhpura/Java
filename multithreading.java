import java.util.*;
public class multithreading {
    public static void main(String args[]){
        // Thread t = Thread.currentThread();
        // System.out.println(t);
        Odd o = new Odd();
        // Thread t = new Thread(o);
        // t.start();
        o.start();

        Even e = new Even();
        // Thread z = new Thread(e);
        // z.start();
        e.start();
    }
}

// Runnable is an interface

// class Odd implements Runnable
class Odd extends Thread
{
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println(i);
            try{
                Thread.sleep(100);
            }
            catch(Exception e){
                System.out.println("inside catch of odd");
            }
        }
    }
}
// class Even implements Runnable
class Even extends Thread
{
    public void run(){
        for(int i=11;i<20;i++){
            System.out.println(i);
            try{
                Thread.sleep(100);
            }
            catch(Exception e){
                System.out.println("inside catch of even");
            }
        }
    }
}