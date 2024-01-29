/*
A coffee maker has a selector for coffee type (normal/espresso) and a selector for coffee amount (10–80 ml).
It also has an of/off switch that behaves in the same way as TV of/off switch.
Coffee type and amount selectors behave like TV channel switch, i.e., they can only be changed when the device is on,
and the device remembers the selections even when it is switched off.
 */
public class Task3_Coffeemaker {
    public static class Coffeemaker{
        private String coffeetype; // tnormal, espresso
        private int amount; //10-80ml
        private boolean power;

        public void switchPower(){
            this.power = !this.power;
        }
        public boolean getPower(){
            return this.power;
        }

        public void setAmount(int amount){
            if (this.getPower()){
                this.amount = amount;
                if (this.amount > 80) {
                    this.amount = 80;
                }else if(this.amount < 10){
                    this.amount = 10;
                }
            }else System.out.println("Power is off.");
        }
        public int getAmount(){
            return this.amount;
        }
        public void setCoffeetype(String type){
            if (this.getPower()){
                type = type.toLowerCase();
                if (type.equals("normal") || (type.equals("espresso"))){
                    this.coffeetype = type;
                }
            }else System.out.println("Power is off.");
        }
        public String getCoffeetype(){
            return this.coffeetype;
        }

    }
}
