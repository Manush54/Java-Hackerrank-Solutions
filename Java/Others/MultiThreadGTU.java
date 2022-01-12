class PrintFirst100 implements Runnable {
    // Thread t;
    // public PrintFirst100 () {
    //     t = new Thread(this);
    //     t.start();
    // }
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("T1: " + i);
        }
    }

}
class Print100_200 implements Runnable {
    // Thread t;
    // public Print100_200 () {
    //     t = new Thread(this);
    //     t.start();
    // }
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.println("T2: " + i);
        }
    }

}
public class MultiThreadGTU {
    public static void main(String[] args) {
        PrintFirst100 t1 = new PrintFirst100();
        Print100_200 t2 = new Print100_200();
        Thread first = new Thread(t1);
        Thread second = new Thread(t2);

        first.start();
        second.start();
    }
}