import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    protected String firstName;
    protected String lastName;
    protected int idNumber;


    /*    
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        testScores = scores;
    }

    /*    
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate() {
        char grade = 'O';
        int total = 0;
        for (int score : testScores) {
            total += score;
        }
        int avg = (int) total / testScores.length;
        if (avg <= 100 && avg >= 90) {
            grade = 'O';
        }
        else if (avg >= 80) {
            grade = 'E';
        }
        else if (avg >= 70) {
            grade = 'A';
        }
        else if (avg >= 55) {
            grade = 'P';
        }
        else if (avg >= 40) {
            grade = 'D';
        }
        else if (avg < 40) {
            grade = 'T';
        }
        return grade;
    }
}

class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}