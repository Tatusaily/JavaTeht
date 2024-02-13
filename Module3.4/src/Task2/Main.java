package Task2;
import java.io.*;
import java.util.Arrays;

public class Main implements Serializable {
    protected static long[] Fibonacci(){

        long last = 0;
        long lastest = 0;
        long[] numlist = new long[100];

        for (int i = 0; i < 100; i++) {

            long n = switch (i) {
                case 0 -> 0;
                case 1 -> 1;
                default -> last + lastest;
            };

            numlist[i] = n;
            lastest = last;
            last = n;
        }

        System.out.println("Got fibonacci");
        System.out.println(numlist[0]);
        return numlist;
    }
    public static void main(String[] args) {
        try (
                FileOutputStream outputstream = new FileOutputStream("Module3.4/Fibonacci.csv");
                ObjectOutputStream objects = new ObjectOutputStream(outputstream);
        ) {
            StringBuilder output = new StringBuilder();
            long[] fibo = Fibonacci();
            for (double v : fibo) {
                output.append(v).append(",");
            }
            objects.writeChars(output.toString());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
