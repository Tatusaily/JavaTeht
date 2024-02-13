package Task1;

public class Counter implements Runnable {
    private final boolean even;
    private final int max;
    private final int min;
    private int n;

    public Counter(int min, int max, boolean even){
        this.min = min;
        this.max = max;
        this.even = even;
    }
    @Override
    public void run() {
        // determine if Thread is even or not
        // then determine if starting number is even or not
        // add to startign number if necessary
        if (even){
            if(min % 2 != 0){n++;}
            for (int i = n; i <= max; i+=2) {
                String string = "Even Thread: " + i;
                System.out.println(string);
            }
        }
        else{
            if(min % 2 == 0){n++;}
            for (int i = n; i <= max; i+=2) {
                String string = "Odd Thread: " + i;
                System.out.println(string);
            }
        }
    }
}
