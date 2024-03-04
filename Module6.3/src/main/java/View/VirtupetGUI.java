package View;

import Controller.Controller;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;

public class VirtupetGUI extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Initialize the GUI.
        stage.setTitle("Virtupet");
        double[] size = new double[]{900, 700};
        this.controller = new Controller(this, size);
        this.canvas = new Canvas(size[0], size[1]);
        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, size[0], size[1]);
        stage.setScene(scene);
        canvas.getGraphicsContext2D().setFill(Color.BLACK);
        canvas.getGraphicsContext2D().fillRect(0, 0, size[0], size[1]);
        stage.show();
        // Set up canvas mouse tracking.
        // Mouse entered.
        canvas.setOnMouseEntered(e -> {
            controller.mouseEntered();
        });
        // Mouse exited.
        canvas.setOnMouseExited(e -> {
            controller.mouseExited();
        });
        // Mouse moved.
        canvas.setOnMouseMoved(e -> {
            controller.mouseMoved(new double[]{e.getX(), e.getY()});
        });
    }
    private Canvas canvas;
    private double[] size = new double[]{900, 700};
    private Image petImage = new Image("pet-face.png", 100, 100, false, false);
    private Controller controller;

    public void drawPet(double[] position) {
        // Draw the pet on the canvas.
        canvas.getGraphicsContext2D().setFill(Color.BLACK);
        canvas.getGraphicsContext2D().fillRect(0, 0, size[0], size[1]);
        canvas.getGraphicsContext2D().drawImage(petImage, position[0] - petImage.getWidth() / 2, position[1] - petImage.getHeight() / 2);
    }

}
