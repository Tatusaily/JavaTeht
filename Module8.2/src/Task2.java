import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //List of ints:
        int[] numbers = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        double sum = Arrays.stream(numbers).filter(n -> n % 2 != 0).map(n -> n * 2).sum();
        System.out.println("Sum of odd numbers multiplied by 2: " + sum);
    }
}
