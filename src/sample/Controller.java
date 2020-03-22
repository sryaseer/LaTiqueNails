package sample;

import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    TextField UserNameTextField;

    @FXML
    PasswordField PasswordField;

    @FXML
    Button LoginButton;

    @FXML
    Label StatusLbl;
    

    final String hostname = "";
    final String dbName = "";
    final String port = "3306";
    final String username = "";
    final String password = "";
    final String AWS_URL = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + username + "&password=" + password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    public void loginClicked(ActionEvent event) throws IOException {
        String username = UserNameTextField.getText();
        String password = PasswordField.getText();
        if (username.equals("User") && password.equals("Pass")) {

            StatusLbl.setTextFill(Color.valueOf("black"));
            StatusLbl.setText("Login Success");
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);

            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }
        else {
            StatusLbl.setTextAlignment(TextAlignment.RIGHT);
            StatusLbl.setTextFill(Color.valueOf("Red"));
            StatusLbl.setText("Login Failed");
        }
    }
}
