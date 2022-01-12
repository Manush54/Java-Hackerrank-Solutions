/** Q7 Write a java program for to solve printer synchronization problem in which all the jobs
must be completed in order. */

class Printer
{
    public synchronized void Print(String msg)
    {
        System.out.println("[");
        try
        {
            Thread.sleep(1000);
            System.out.println(msg);
            Thread.sleep(1000);
        } catch(Exception e) {}
        System.out.println("]");
    }
}


class User extends Thread
{
    String msg;
    Printer p;
    public User(Printer p,String m)
    {
        this.p=p;
        msg=m;
    }
    public void run()
    {
        p.Print(msg);
    }

           public static void main(String arr[])
        {
            System.out.println("creating a pointer........");
            Printer p=new Printer();
            System.out.println("creating two user threads and giving them reference of the printer....");
            User u1=new User(p,"it is user one");
            User u2=new User(p,"it is user two");
            System.out.println("Starting user threads.....");
            u1.start(); 
            u2.start();
        }
}
