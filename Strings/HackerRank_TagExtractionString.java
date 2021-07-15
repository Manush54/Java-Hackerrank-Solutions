import java.util.*;
import java.util.regex.*;

public class HackerRank_TagExtractionString{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        while (testCases > 0) {
            String line = in.nextLine();
            
            boolean flag = false;
            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            // <(.+)>  -->  For matching the start tag
            // ([^<]+) -->  For matching the internal text but excluding the "<" sign
            // "excluding the "<" sign" --> This will take care of nested tag as it won't accept the outer tags and only extract the text from the internal tags.
            // </\\1>  -->  For matching the end tag. //1 matches the first tag only.
            Matcher m = p.matcher(line);
            
            while (m.find()) {
                System.out.println(m.group(2));
                flag = true;
            }
            if (! flag) {
                System.out.println("None");
            }

            testCases--;
        }
        in.close();
	}
}
