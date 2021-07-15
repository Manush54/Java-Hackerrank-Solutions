import java.util.Scanner;

public class HackerRank_Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result = false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        StringBuilder Master = new StringBuilder(b);

        if (a.length() == b.length()) {
            for (int c = 0; c < a.length(); c++) {
                for (int d = 0; d < Master.length(); d++) {
                    if (a.charAt(c) == Master.charAt(d)) {
                        Master.deleteCharAt(d);
                        if (c == a.length() - 1 && Master.length() == 0) {
                            result = true;
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}