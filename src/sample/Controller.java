package sample;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    final String hostname = "";
    final String dbName = "";
    final String port = "3306";
    final String username = "";
    final String password = "";
    final String AWS_URL = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + username + "&password=" + password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
