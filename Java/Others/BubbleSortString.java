public class BubbleSortString {
    public static void main(String[] args) {
        String values[] = { "Manush", "Mann", "Hasti", "Khushali" };
        String temp;
        System.out.println("Strings in sorted order");
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                // Comparing two strings
                if (values[j].compareTo(values[i]) < 0) {
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
            System.out.println(values[i]);
        }
    }
}
