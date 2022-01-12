import java.util.*;
public class Bank {

	static int count = 0;
	double balance = 5000;
	Scanner scr = new Scanner(System.in);
	static int flag = 0;
	String email,email1,pass,pass1;

	void signup() {
		System.out.println("Enter your email address:");
		email = scr.next();
		System.out.println("Enter your password :");
		pass = scr.next();

	}

	void login() {
    //  int flag1 =0;
        while(true) {
            System.out.println("Enter your registered email address");
            email1 = scr.next();
            System.out.println("Enter your registered password (Case-Sensitive) :");
            pass1 = scr.next();
            if(email.equalsIgnoreCase(email1) && pass.equals(pass1)) {
                System.out.println("Login Successful........");
                System.out.println("ACCOUNT BALANCE : 5000 RS");
                flag = 1;
                break;
            }
            else {
                System.out.println("Invalid email address or password....try again");
            }
        }
    }

	 void deposit() {
		double balance1;
		System.out.println("Enter the amount you want to enter:");
		balance1 = scr.nextInt();
		balance = balance + balance1;
//		return balance;
	}

	 void withdraw() {
		 double balance2  ;
		 System.out.println("Enter the amount you want to deduct:");
		 balance2 = scr.nextInt();
		 if(balance-balance2<5000) {
			 System.out.println("Minimum amount of 5000rs is required....Deduction failed");
		 }
		 else if(balance2>15000){
			 System.out.println("You can not withdarw amount more than 15000 rs per transaction");
		 }
		 else {
			 balance = balance - balance2;
		 }
//		 return balance;
	 }

	 void checkBalance() {
		 System.out.println("Your available balance is:  RS  "+balance);
	 }

	 void count() {

		 	count++;
			if(count>5) {
				System.out.println("Your limit of 5 transactions exceeded....Fixed bank charge of Rs 50 + 18% GST is deducted from your account");
				balance = (balance - 59);
				System.out.println("Your Remaining balance is:"+balance);

			}
	 }
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int choice,choice1;
		Bank b = new Bank();
		while(true) {
		System.out.println("\n1.Signup\n2. Login \n3.Exit");
		System.out.println("Enter your choice:");
		choice = scr.nextInt();
		switch (choice) {

		case 1:
			b.signup();
			break;

		case 2:
			// int i;
			b.login();
			if(flag == 1) {
				while(true) {
				System.out.println(" \n1. Deposit\n 2. Withdrawal\n 3. Check Balance\n 4. Logout\n");
				System.out.println("Enter the task you want to perform");
				choice1 = scr.nextInt();
				switch (choice1) {

				case 1:
					 b.deposit();
					 b.count();
					 break;

				case 2:
					b.withdraw();
					b.count();
					break;

				case 3:
					b.checkBalance();
					break;

				case 4:
					System.out.println("Logged out......");
					System.out.println("Your total transactions are :"+count);
					System.exit(0);
				default:System.out.println("Invalid choice");
					break;
				}//switch2
			}//while
        } //flag
            break;
        case 3:
            scr.close();
            System.exit(0);

		default:System.out.println("Invalid choice");
			break;
		}//switch1
    } //while
}//main

}// bank