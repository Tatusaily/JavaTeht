public class Task1 {
    static interface Vehicle {
        public void start();
        public void stop();
        public String getInfo();
    }
    static class Car implements Vehicle{
        private final String name;
        private boolean isStarted;
        public Car(String name){
            this.name = name;
            isStarted = false;
        }
        @Override
        public void start() {
            System.out.printf("%s has started.\n", name);
            isStarted = true;
        }

        @Override
        public void stop() {
            System.out.printf("%s has stopped.\n", name);
            isStarted = false;
        }

        @Override
        public String getInfo() {
            String string = name + " is a car, and it is ";
            if (isStarted){
                string += "started";
            }else string += "stopped";
            return string;
        }
    }
    static class Bus implements Vehicle{
        private final String name;
        private boolean isStarted;
        public Bus(String name){
            this.name = name;
            isStarted = false;
        }
        @Override
        public void start() {
            System.out.printf("%s has started.\n", name);
            isStarted = true;
        }

        @Override
        public void stop() {
            System.out.printf("%s has stopped.\n", name);
            isStarted = false;
        }

        @Override
        public String getInfo() {
            String string = name + " is a car, and it is ";
            if (isStarted){
                string += "started. Beep Beep!";
            }else string += "stopped";
            return string;
        }
    }
    static class Motorcycle implements Vehicle{
        String name;
        boolean isStarted;
        public Motorcycle(String name){
            this.name = name;
            isStarted = false;
        }
        @Override
        public void start() {
            System.out.printf("%s has started.\n", name);
            isStarted = true;
        }

        @Override
        public void stop() {
            System.out.printf("%s has stopped.\n", name);
            isStarted = false;
        }

        @Override
        public String getInfo() {
            String string = name + " is a car, and it is ";
            if (isStarted){
                string += "started";
            }else string += "stopped";
            return string;
        }
    }

    public static void main(String[] args) { // VehicleDemo
        Car auto = new Car("Volkkaris");
        auto.start(); auto.stop();System.out.println(auto.getInfo());
        Bus bussi = new Bus("Bussikka");
        bussi.start(); System.out.println(bussi.getInfo());bussi.stop();
        Motorcycle moto = new Motorcycle("Harrikka");
        System.out.println(moto.getInfo()); moto.start(); moto.stop();
    }

}
