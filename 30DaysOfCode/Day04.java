import java.util.*;

class Person {
    private int age;    
  
    public Person(int initialAge) {
          // Add some more code to run some checks on initialAge
          if(initialAge < 0){
              System.out.println("Age is not valid, setting age to 0.");
              age = 0;
          }
          else{
              age = initialAge;
          }
    }

    public void amIOld() {
          // Write code determining if this person's age is old and print the correct statement:
        System.out.println(age < 13 ? "You are young." : age < 18 ? "You are a teenager." : "You are old.");
    }

    public void yearPasses() {
          age++;
    }
}

public class Day04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
