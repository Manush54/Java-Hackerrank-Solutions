public class ThreadFunctionsDemo {
    public static void main(String[] args) {
        Thread mt =  Thread.currentThread();
        System.out.println("Main Thread: " + mt.getName());
        System.out.println("Main Thread Priority: " + mt.getPriority());
        mt.setName("Manush");
        System.out.println("Main Thread Now: " + mt.getName());
        mt.setPriority(Thread.MAX_PRIORITY - 6);
        System.out.println("Main Thread Priority Now: " + mt.getPriority());
        System.out.println("Main Thread: " + mt);
    }
}
