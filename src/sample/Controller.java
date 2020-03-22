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

import java.io.IOException;
import java.net.URL;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Controller extends DatabaseOperator implements Initializable {

    @FXML
    TextField UserNameTextField;

    @FXML
    PasswordField PasswordField;

    @FXML
    Button LoginButton;

    @FXML
    Label StatusLbl;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    public void loginClicked(ActionEvent event) throws IOException {
        String username = UserNameTextField.getText();
        String password = PasswordField.getText();
        if (username.equals("User") && password.equals("Pass")) {

            StatusLbl.setTextFill(Color.valueOf("black"));
            StatusLbl.setText("Login Success");

            // To change to a different scene use the code below for example
            // This only works with actionEvents
            // The number is the specific scene; will develop a list of what number is what later.
            SceneChanger sc = new SceneChanger();
            sc.ChangeScene(1,event);
            // -End example code-

        }
        else {
            StatusLbl.setTextAlignment(TextAlignment.RIGHT);
            StatusLbl.setTextFill(Color.valueOf("Red"));
            StatusLbl.setText("Login Failed");
        }
    }

    public void nextButton(ActionEvent event) throws IOException
    {
        {
            Parent ViewParent = FXMLLoader.load(getClass().getResource("Login Page.fxml"));
            Scene ViewScene = new Scene(ViewParent);

            Stage window = (Stage)((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(ViewScene);
            window.show();
        }

    }
}
