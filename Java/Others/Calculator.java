import java.util.Scanner;

class Calculator
{
  static int add (int a, int b)
  {
    return a + b;
  }
  static int subtract (int a, int b)
  {
    return a - b;
  }
  static int multiply (int a, int b)
  {
    return a * b;
  }
  static int divide (int a, int b)
  {
    return (int)Math.floor(a/b);
  }
  static int modulo (int a, int b)
  {
    return a%b;
  }
  public static void main (String[]args)
  {
	Scanner input = new Scanner (System.in);
    int choice,first,second = 0;
    do
      {
	int result = 0;
	System.out.println("--------  Welcome to Calculator Program ---------\n");
	System.out.println("1. Add \n2. Subtract \n3. Multiply \n4. Divide \n5. Modulo \n6. Exit\n");
	System.out.println ("Your choice : ");
	choice = input.nextInt ();
	if (choice == 6) {
		System.out.println("Thank You!\nExiting Calculator...");
		input.close();
		return;
	}
	System.out.println ("Please enter value 1: ");
    first = input.nextInt ();
    System.out.println ("Please enter value 2: ");
	second = input.nextInt();
	switch (choice)
	  {
	  case 1:
	    result = add (first, second);
	    break;
	  case 2:
	    result = subtract (first, second);
	    break;
	  case 3:
	    result = multiply (first, second);
	    break;
	  case 4:
	    result = divide (first, second);
	    break;
	  case 5:
	    result = modulo (first, second);
	    break;
	  case 6:
	    break;
	  default:
	    System.out.println ("Invalid Choice..");
	    break;
	  }
	System.out.println ("Ans : " + result);
      }
		while (choice != 6);
	input.close();
  }
}