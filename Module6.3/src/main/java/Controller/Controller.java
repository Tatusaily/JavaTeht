package Controller;

import Model.Pet;
import View.VirtupetGUI;

public class Controller {
    public Controller(VirtupetGUI gui, double[] size) {
        this.gui = gui;
        // Create a pet in the middle of the canvas.
        pet = new Pet(size);
        System.out.println("Controller created");
        // Start the tick rate bot.
        TickRateBot tickRateBot = new TickRateBot(this);
        tickRateBot.begin();

    }
    private int stepSize = 3;
    private Pet pet;
    private VirtupetGUI gui;
    private Boolean mouseOnCanvas = false;
    private double[] mousePosition;
    private double[] petPosition;

    public void handleMove() {
        // Move the pet to the new position.
        // Step Size and Tick rate affect the movement speed.
        // Update the canvas.
        petPosition = pet.getPosition();
        if (mouseOnCanvas) {
            // Move the pet towards the mouse.
            // Calculate the distance between the pet and the mouse.
            double dx = mousePosition[0] - petPosition[0];
            double dy = mousePosition[1] - petPosition[1];
            double distance = Math.sqrt(dx * dx + dy * dy);
            System.out.println("Distance: " + distance);

            if (distance > 10) {
                // Normalize the distance.
                dx = dx / distance;
                dy = dy / distance;
                // Move the pet towards the mouse.
                petPosition[0] += dx * stepSize;
                petPosition[1] += dy * stepSize;

                gui.drawPet(petPosition);
                pet.setPosition(petPosition);
            } else {System.out.println("Cat touches mouse");}
        }
    }
    public void mouseEntered() {
        // Start the pet moving.
        mouseOnCanvas = true;
        System.out.println("Mouse entered");
    }
    public void mouseExited() {
        // Stop the pet moving.
        mouseOnCanvas = false;
        System.out.println("Mouse exited");
    }
    public void mouseMoved(double[] position) {
        // Update the pet's target position.
        mousePosition = position;
    }
    public void tick() {
        // Set the tick ready flag.
        handleMove();
    }


}
