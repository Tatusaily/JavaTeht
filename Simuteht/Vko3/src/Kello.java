public class Kello{ // Task3
        private static Kello instance = null;
        private int time;
        private Kello(){    // private constructor
        }
       public static Kello getInstance(){ // singleton checker
            if (instance == null){
                instance = new Kello();
            }
            return instance;
        }
        public int getTime(){
            return time;
        }
        public void setTime(int num){
            time = num;
        }

    public static void main(String[] args) {
        Kello kello = Kello.getInstance();
        System.out.println(kello.getTime());
        kello.setTime(10);
        System.out.println(kello.getTime());
    }
    }