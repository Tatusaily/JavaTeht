The calculator class takes integers from the user and performs calculations.
```
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
            // This method gets the average of the numbers in the array
            public double average(){
                if (this.numarray.size() == 0) {throw new IllegalArgumentException();}
                return (double) this.sum() / this.numarray.size();
            }
    }
```
the code takes integers from the user and performs calculations.
what is the purpose of the code?
the purpose of the code is to perform calculations on integers.
what are the features of the code?
the features of the code are:
- addint: adds an integer to the array
- reset: clears the array
- sum: gets the sum of the numbers in the array
- average: gets the average of the numbers in the array
- numarray: an array that holds the numbers

