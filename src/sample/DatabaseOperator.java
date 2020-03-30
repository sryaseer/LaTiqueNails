package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseOperator {
    //Database connections made from this class, so no need to copy and paste this stuff into each new class.
    //please extend DatabaseOperator to your controller class if you create a new one.


    final String hostname = "";
    final String dbName = "";
    final String port = "3306";
    final String username = "";
    final String password = "";
    final String AWS_URL = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + username + "&password=" + password;
    final String DB_URL = "jdbc:derby:EmployeeDB;create=true";

    public void ChangeScene(String scene, ActionEvent event) throws IOException {
        Parent mainWindowParent = FXMLLoader.load(getClass().getResource(scene));
        Scene mainWindowScene = new Scene(mainWindowParent);
        Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        window.setScene(mainWindowScene);
        window.show();
    }

}
