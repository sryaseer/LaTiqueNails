package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddEmployeeController extends DatabaseOperator implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void backButtonClicked(ActionEvent event) throws IOException {
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene("dashboard.fxml",event);
    }
}
