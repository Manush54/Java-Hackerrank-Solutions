//Complete this code or write your own from scratch
import java.util.*;

class Day08{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Dictionary<String,Integer> diary = new Hashtable<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            diary.put(name,phone); 
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            Integer element = diary.get(s);
            if(element == null){
                System.out.println("Not found");
            }
            else{
                System.out.println(s+"="+element);
            }
        }
        in.close();
    }
}
