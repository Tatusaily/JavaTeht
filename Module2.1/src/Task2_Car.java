public class Task2_Car {
    public class Car {
        private float speed;
        private float gasolineLevel;
        private String typeName;
        private float topSpeed;
        private float tankCap;
        public Car(String typeName) {
            speed = 0; gasolineLevel = 0;
            this.typeName = typeName;
        }
        public Car(float topSpeed, float tankCap){
            this.topSpeed = topSpeed;
            this.tankCap = tankCap;
        }
        public void accelerate() {
            if (gasolineLevel > 0)
                speed += 10;
            else
                speed = 0;
            if (speed > topSpeed){
                speed = topSpeed;
            }
        }
        void decelerate(int amount) {
            if (gasolineLevel > 0) {
                if (amount > 0)
                    speed = Math.max(0, speed - amount);
            } else
                speed = 0;
        }
        float getSpeed() {
            return speed;
        }
        String getTypeName() {
            return typeName;
        }
        void fillTank() {
            gasolineLevel = tankCap;
        }
        float getGasolineLevel() {
            return gasolineLevel;
        }
    }
    public static void main(String[] args) {

    }
}
