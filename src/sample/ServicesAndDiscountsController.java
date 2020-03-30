package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ServicesAndDiscountsController extends DatabaseOperator implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void backButtonClicked(ActionEvent event) throws IOException {
        ChangeScene("dashboard.fxml",event);
    }
}
