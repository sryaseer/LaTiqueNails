package sample;

import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

    @FXML
    void makeLogin(ActionEvent event) {
        String username = UserNameTextField.getText();
        String password = PasswordField.getText();
        if (username.equals("User") && password.equals("Pass")) {
            System.out.print("WORKS");
        } else {
            System.out.println("DOESNT");
        }
    }

    final String hostname = "";
    final String dbName = "";
    final String port = "3306";
    final String username = "";
    final String password = "";
    final String AWS_URL = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + username + "&password=" + password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

       LoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                /*
               String username = UserNameTextField.getText();
               if (username.equals("User") && password.equals("Pass")) {
                   System.out.print("WORKS");

                        StatusLbl.setText("Login Success");
                        Stage primaryStage = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("Reports.fxml"));
                        primaryStage.setTitle("LaTiqueNails");
                        Scene scene = new Scene(root, 700, 450);
                        primaryStage.setScene(scene);
                        primaryStage.show();

                } else {
                   System.out.println("DOESNT");
                    //StatusLbl.setText("Login Failed");
               }*/
            }
        });
    }
}
