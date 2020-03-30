package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginButtonDashboardController extends DatabaseOperator implements Initializable {
    public void backButtonClicked(ActionEvent event) throws IOException {
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene(1,event);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
