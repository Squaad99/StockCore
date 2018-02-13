package UI;

import UI.Components.MenuUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.importData.Data.Data;

public class Start extends Application {

    public static void main(String[] args){
            Data data = new Data();
            launch();
    }

    public void start(Stage stage){

        Pane pane = new Pane();
        Scene scene = new Scene(pane);
        stage.setMaximized(true);
        stage.setTitle("StockCore*");
        stage.setScene(scene);
        stage.show();

        loadUIObjects(pane);
    }

    public void loadUIObjects(Pane pane){

        MenuUI menuUI = new MenuUI(pane);
    }

}
