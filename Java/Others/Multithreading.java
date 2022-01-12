class MultiThread extends Thread {
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                Thread.sleep(300);
            }
        } catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

public class Multithreading {
    public static void main(String[] args){
        MultiThread t1 = new MultiThread();
        MultiThread t2 = new MultiThread();
        MultiThread t3 = new MultiThread();
        t1.start();
        t2.start();
        t3.start();
        try
        {
            t1.join();
            t2.join();
            t3.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Good Bye...");
    }
}
