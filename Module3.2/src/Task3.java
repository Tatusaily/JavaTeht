import java.util.Objects;

public class Task3 {
    /*Differences from Task2:
    Added ElectricVehicle interface.
    Added Charge(); to Abstract. Charge checks if fuel type is Electric to charge.
     */
    static abstract class AbstractVehicle implements Vehicle, ElectricVehicle{
        protected String name;
        protected boolean isStarted;
        protected float fuelValue = 0;
        protected String fuelType;
        public AbstractVehicle(String name, String fuelType){
            this.name = name;
            this.fuelType = fuelType;
        }

        @Override
        public void Charge() {
            if(!Objects.equals(fuelType, "Electric")){
                System.out.println("Can't charge this vehicle!");
            }
        }

        public void start() {
            if (!isStarted) {
                isStarted = true;
            } else {
                System.out.println(name + " is already started!");
            }
        }
        public void stop(){
            if (isStarted) {
                isStarted = false;
            } else {
                System.out.println(name + " is already stopped!");
            }
        }
    }
    interface Vehicle {
        void start();
        void stop();
        String getInfo();
    }
    interface ElectricVehicle{
        void start();
        void stop();
        String getInfo();
        void Charge();
    }
    static class Car extends AbstractVehicle{
        public Car(String name){
            super(name, "Gasoline");
            isStarted = false;
        }

        @Override
        public String getInfo() {
            String string = name + " is a Car and it is ";
            if (isStarted)
            {string += "started.";}
            else{string += "stopped.";}
            return string;
        }
    }
    static class Bus extends AbstractVehicle{
        private int passengerNum = 0;
        public Bus(String name){
            super(name, "Gasoline");
            isStarted = false;
        }
        @Override
        public String getInfo() {
            String string = name + " is a Bus and it is ";
            if (isStarted)
            {string += "started.";}
            else{string += "stopped.";}
            string += "\n" + name + " has " + passengerNum + " passengers.";
            return string;
        }
    }
    static class Motorcycle extends AbstractVehicle{
        public Motorcycle(String name){
            super(name, "Gasoline");
            isStarted = false;
            fuelValue += 100;
        }
        @Override
        public String getInfo() {
            String string = name + " is a motorcycle, and it is ";
            if (isStarted){
                string += "started";
            }else string += "stopped";
            string += "\n" + name + " has " + fuelValue + " fuel!";
            return string;
        }
    }
    static class ElectricCar extends AbstractVehicle{

        public ElectricCar(String name) {
            super(name, "Electric");
        }

        @Override
        public String getInfo() {
            String string = name + " is an E-Car, and it is ";
            if (isStarted){
                string += "started";
            }else string += "stopped";
            return string;
        }
        @Override
        public void Charge(){
            System.out.println(name + " has been charged!");
            fuelValue = 100;
        }
    }

    public static void main(String[] args) { // VehicleDemo
        Car auto = new Car("Volkkaris");
        auto.start(); auto.stop();System.out.println(auto.getInfo());
        Bus bussi = new Bus("Bussikka");
        bussi.start(); System.out.println(bussi.getInfo());bussi.stop();
        Motorcycle moto = new Motorcycle("Harrikka");
        System.out.println(moto.getInfo()); moto.start(); moto.stop();
        ElectricCar tesla = new ElectricCar("Tesla");
        tesla.Charge();
        bussi.Charge();
    }

}
