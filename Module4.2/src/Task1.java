import java.util.ArrayList;

public class Task1 {
    static class Calculator {
        private final ArrayList<Integer> numarray = new ArrayList<>();

        public void addint(int a){
            if (a < 0) {throw new IllegalArgumentException();}
            this.numarray.add(a);
        }
        public void reset(){
            this.numarray.clear();
        }
        public int sum(){
            int sum = 0;
            for (int i : this.numarray) {
                sum += i;
            }
            return sum;
        }

    }
}
