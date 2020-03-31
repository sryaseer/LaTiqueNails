package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginButtonDashboardController extends DatabaseOperator implements Initializable {
    public void backButtonClicked(ActionEvent event) throws IOException {
        ChangeScene("dashboard.fxml",event);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
