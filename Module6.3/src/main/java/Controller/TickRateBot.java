package Controller;

import View.VirtupetGUI;
import javafx.application.Platform;

public class TickRateBot{

    private Controller controller;
    public TickRateBot(Controller controller) {
        this.controller = controller;
    }
    public void begin() {
        // Start the ticks.
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(16);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Platform.runLater(() -> {
                    controller.tick();
                });
            }
        }).start();
    }
}
