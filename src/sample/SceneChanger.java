package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//main function of this class is to change scenes.

public class SceneChanger {
    public void ChangeScene(int sceneNumber, ActionEvent event) throws IOException {
        if(sceneNumber == 1){
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("Reports.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);
            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }
    }
}
