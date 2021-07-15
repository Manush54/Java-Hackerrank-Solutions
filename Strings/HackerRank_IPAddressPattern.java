import java.util.Scanner;

class HackerRank_IPAddressPattern{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        System.out.println(new MyRegex().pattern);
        in.close();

    }
}

//Write your code here
class MyRegex {
    String zeroTo199 = "[01]?\\d{1,2}";
    String twoHundredTo249 = "2[0-4]\\d";
    String twoFiftyTo255 = "25[0-5]";
    String concatinated = zeroTo199 + "|" + twoHundredTo249 + "|" + twoFiftyTo255;
    public String pattern = "(" + concatinated + ")\\.(" + concatinated + ")\\.(" + concatinated + ")\\.(" + concatinated + ")";
}   