class SumDigits{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int addition = 0;
        while(n!=0){
            int remainder = n % 10;
            addition+= remainder;
            n/=10;
        }
        System.out.println("Addition = " + addition);
    }
}