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
import javafx.scene.paint.Color;
import javafx.stage.Stage;

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


        /*
       LoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {

                    String username = UserNameTextField.getText();
                    String password = PasswordField.getText();
                    if (username.equals("User") && password.equals("Pass")) {

                        StatusLbl.setTextFill(Color.valueOf("black"));
                        StatusLbl.setText("Login Success");


                        Parent mainWindowParent = FXMLLoader.load(getClass().getResource("Reports.fxml"));
                        Scene mainWindowScene = new Scene(mainWindowParent);

                        Stage window = (Stage)((javafx.scene.Node)actionEvent.getSource()).getScene().getWindow();
                        window.setScene(mainWindowScene);
                        window.show();



                        Stage primaryStage = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("Reports.fxml"));
                        primaryStage.setTitle("LaTiqueNails");
                        Scene scene = new Scene(root, 700, 450);
                        primaryStage.setScene(scene);
                        primaryStage.show();


                    } else {
                        StatusLbl.setTextFill(Color.valueOf("red"));
                        StatusLbl.setText("Login Failed");

                    }
                }
                catch (Exception ex) {
                    System.out.println(ex.getMessage());

                }

        });

         */
    }

    public void loginClicked(ActionEvent event) throws IOException {
        String username = UserNameTextField.getText();
        String password = PasswordField.getText();
        if (username.equals("User") && password.equals("Pass")) {

            StatusLbl.setTextFill(Color.valueOf("black"));
            StatusLbl.setText("Login Success");
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("Reports.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);

            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }
        else {
            StatusLbl.setTextFill(Color.valueOf("red"));
            StatusLbl.setText("Login Failed");

        }
    }
}
