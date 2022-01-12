class Thread1 implements Runnable {
    String str = " ";
    Thread t;
    Thread1(String s) {
        t = new Thread(this);
        str = s;
        t.start();
    }
    public void run() {
        System.out.println("Thread1 started.." + str);
        System.out.println("Thread1 started.." + t.getName());

    }
}

public class ThreadDemo {
    public static void main(String args[]) {
        Thread1 t = new Thread1("Manush");
        Thread1 m = new Thread1("Mann");
        Thread1 h_m = new Thread1("Hasti");
        System.out.println("Thread Name: " + h_m);
    }
}
