package UI.Components;

import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import model.importData.ImportData;

public class MenuUI {

    public MenuUI(Pane pane) {

        Button btn1 = new Button("Download");
        btn1.relocate(300, 50);
        pane.getChildren().add(btn1);

        btn1.setOnAction(e ->{


            try{
                ImportData importData = new ImportData();
                importData.deleteOld();
                importData.downloadAll();
            }
            catch(Exception i){
                System.out.println("Fail");
            }


        });





    }
}
