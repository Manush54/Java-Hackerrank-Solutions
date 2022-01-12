import java.util.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class JavaPriorityQueue {

  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student> list =
                new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getCgpa() != o2.getCgpa())
                    return o1.getCgpa() < o2.getCgpa() ? 1 : -1;
                else{
                    if(!o1.getFname().equals(o2.getFname()))
                        return o1.getFname().compareTo(o2.getFname());
                    else
                        return o1.getToken() < o2.getToken() ? 1 : -1;
                }
            }
        });

        while (totalEvents > 0) {
            String event = in.next();

            if (event.equals("ENTER")) {
                String name = in.next();
                double gpa = in.nextDouble();
                int id = in.nextInt();
                list.add(new Student(id, name, gpa));
            } else if (list.size() > 0 && event.equals("SERVED")) {
                list.remove();
            }

            totalEvents--;
        }
        in.close();

        if(list.size() == 0) {
            System.out.println("EMPTY");
            return;
        }

        while(list.size() > 0){
            System.out.println(list.poll().getFname());
        }
    }
}