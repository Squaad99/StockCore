import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UiTests extends Application {


    public static void main(String [] args){

        launch();

    }

    public void start(Stage stage){

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 250);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Downloading");
        alert.setHeaderText("Downloading");
        alert.setContentText("Downloading");

        Stage staged = (Stage) alert.getDialogPane().getScene().getWindow();
        staged.setAlwaysOnTop(true);
        staged.toFront();

        alert.showAndWait();

    }
}
