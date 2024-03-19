import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        // Here we calculate mean of array in a functional way:
        // First make array:
        Integer[] numlist = {10, 5, 8, 20, 15, 3, 12, 18, 25, 30};
        // Then use stream to calculate mean:
        // Array to Stream -> indexes to int -> average of all ints. If empty, return 0.
        double mean = Arrays.stream(numlist).mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Mean of array of integers: " + mean);
    }
}
