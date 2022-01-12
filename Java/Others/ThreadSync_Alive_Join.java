class ThreadDemo1 extends Thread {
    public void run() {
        Thread t = new Thread();
        System.out.println("Thread 1");
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread 2");
        }
    }
}

public class ThreadSync_Alive_Join {
    public static void main(String args[]) {
        ThreadDemo1 t1 = new ThreadDemo1();
        ThreadDemo1 t2 = new ThreadDemo1();
        t1.start();
        t2.start();
        System.out.println("Thread 1 alive: "+ t1.isAlive());
        System.out.println("Thread 2 alive: "+ t2.isAlive());
        try{
            t1.join();
            System.out.println("Thread 1 alive: "+ t1.isAlive());
            System.out.println("Thread 2 alive: "+ t2.isAlive());
            t2.join();
        } catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
            System.out.println("Thread 1 alive: "+ t1.isAlive());
            System.out.println("Thread 2 alive: "+ t2.isAlive());
        }
    }
}
