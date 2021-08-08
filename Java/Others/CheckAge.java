public class CheckAge{

	static String checkAge(int age){

    	if(age >= 18){
        	return "Access granted - You are old enough!";

        } else if (age >= 0 && age < 18) {
        	return "You are underage - Please grow up!";

        } else {
        	return "Invalid age!";

        }
    }

	public static void main(String[] args){
    System.out.println("Manush - " + checkAge(20));
    System.out.println("Khushali - " + checkAge(18));
    System.out.println("Hasti - " + checkAge(6));
    System.out.println("Mann - " + checkAge(-5));
    }
}