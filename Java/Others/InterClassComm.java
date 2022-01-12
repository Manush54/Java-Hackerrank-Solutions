class Buffer {
    int data;
    boolean empty = true;

    synchronized void put(int d) {
        data = d;
        System.out.println("Produced :" + data);
    }

    synchronized void get() {
        System.out.println("Consumed :" + data);
    }
}

class ProducerThread implements Runnable {
    Buffer buff;

    public ProducerThread(Buffer buff) {
        this.buff = buff;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            buff.put(i);
        }
    }
}

class ConsumerThread implements Runnable {
    Buffer buff;

    public ConsumerThread(Buffer buff) {
        this.buff = buff;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            buff.get();
        }
    }
}

public class InterClassComm {
    public static void main(String args[]) {
        Thread t1, t2;
        Buffer buff = new Buffer();
        ProducerThread pt = new ProducerThread(buff);
        ConsumerThread ct = new ConsumerThread(buff);
        t1 = new Thread(pt);
        t2 = new Thread(ct);
        t1.setName("Producer");
        t2.setName("Consumer");
        t1.start();
        t2.start();
    }
}