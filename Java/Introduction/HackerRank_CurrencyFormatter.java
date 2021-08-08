import java.util.*;
import java.text.*;

public class HackerRank_CurrencyFormatter {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.

        // Creating a Locale for India as there isn't one defined by defualt.
        Locale indianLocale = new Locale("en", "IN");
        
        // Initializing the variables.
        String us, india, china, france;

        // Get the number format from the getCurrencyInstance() method and then format "payment" variable according to that format.
        us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        india = NumberFormat.getCurrencyInstance(indianLocale).format(payment);
        china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}