// Creating thread by implementing runnable interface . If ur class is to be executed as a thread , u can achieve this by implementing runnable interface
// Follow 3 basic steps :
//  1. Need to implement run method provided by runnable interface
//  The run method provides entry point for the thread
//  You will put complete business login(code) in run method
//  2. Here u will instantiate a thread object using the following constructor : Thread(Runnable threadobj , String )
//  where thread obj is an instance of the class that implements runnable interface & threadname is the name given to new thread
//  3. Once the thread  obj is created , call start method



class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating "+ threadName);
    }

    public void run(){
        System.out.println("Running "+ threadName);
        try{ int i;
            for(i=4;i>0;i--){
                System.out.println("Thread: " +threadName+ ","+ i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println("Thread: " +threadName+ " interrupted");
        }
        System.out.println("Thread: " +threadName+ " exiting.");
    }
    
    public void start(){
        System.out.println("Starting: " +threadName );
        if (t==null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}

public class TestThread{
    public static void main(String args[]){
        
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();
        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();


    }
}
