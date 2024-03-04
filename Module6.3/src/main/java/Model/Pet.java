package Model;

public class Pet {
    public Pet(double[] size) {
        this.x = size[0] / 2;
        this.y = size[1] / 2;
        System.out.println("Pet created");
    }
    private double x;
    private double y;
    // getter for position
    public double[] getPosition() {
        return new double[]{x, y};
    }
    public void setPosition(double[] position) {
        x = position[0];
        y = position[1];
    }


}
