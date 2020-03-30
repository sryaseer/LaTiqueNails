package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReportController extends DatabaseOperator implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void backButtonClicked(ActionEvent event) throws IOException {
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene(1,event);
    }
    public void ReportsClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene(2, event);
    }
}
