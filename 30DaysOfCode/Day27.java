public class Day27 {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray {

        public static int[] get_array() {
            return new int[0];
        }
    }

    static class TestDataUniqueValues {

        public static int[] get_array() {
            return new int[] { 10, 20, 30, 40 };
        }

        public static int get_expected_result() {
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {

        public static int[] get_array() {
            return new int[] { 10, 20, 10, 30, 40 };
        }

        public static int get_expected_result() {
            return 0;
        }
    }

}