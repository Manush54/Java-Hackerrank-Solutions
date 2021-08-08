import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRank_RegEx2 {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
                System.out.println(m.group());
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}

/*

. --> Can be any character
d --> Represents digits
D --> Represents non-digits
s --> Represents any white spaces
S --> Represents Non white space character
w --> It can be a  word character
W --> It can be word character
b --> Represents a word boundary
B --> It Represents a non  word boundary


*/