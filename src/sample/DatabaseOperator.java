package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperator {
    //Database connections made from this class, so no need to copy and paste this stuff into each new class.
    //please extend DatabaseOperator to your controller class if you create a new one.



            String connectionUrl =
                    "jdbc:sqlserver://cot-cis3365-13.cougarnet.uh.edu:1433;"
                            + "database=AdventureWorks;"
                            + "user=;"
                            + "password=;"
                            + "encrypt=true;"
                            + "trustServerCertificate=false;"
                            + "loginTimeout=30;";

            public Connection ConnectToDatabase() {
                try (Connection connection = DriverManager.getConnection(connectionUrl);) {
                    return connection;
                }
                // Handle any errors that may have occurred.
                catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
                return null;
            }


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
