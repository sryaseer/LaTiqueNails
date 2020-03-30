package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//main function of this class is to change scenes.

public class SceneChanger {
    public void ChangeScene(String scene, ActionEvent event) throws IOException {
        Parent mainWindowParent = FXMLLoader.load(getClass().getResource(scene));
        Scene mainWindowScene = new Scene(mainWindowParent);
        Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        window.setScene(mainWindowScene);
        window.show();

        /*
        if(sceneNumber == 1){ //transitions to dashboard.fxml
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);
            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }

        if(sceneNumber == 2){ //transition to reports.fxml
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("Reports.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);
            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }

        if(sceneNumber == 3){ //transitions to login page.fxml
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("Login Page.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);
            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }

        if(sceneNumber == 4){ //transition to AppointmentConfirmation.fxml
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("AppointmentConfirmation.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);
            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }

        if(sceneNumber == 5){ //transitions to Appointment page.fxml
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("Appointment.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);
            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }

        if(sceneNumber == 6){ //transitions to AddCustomers page.fxml
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("AddCustomers.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);
            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }

        if(sceneNumber == 7){ //transitions to AddEmployee page.fxml
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("AddEmployee.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);
            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }

        if(sceneNumber == 8){ //transitions to ServicesAndDiscounts.fxml
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("ServicesAndDiscounts.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);
            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }
        if(sceneNumber == 9){ //transitions to Invoice.fxml
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("Invoice.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);
            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }
        if(sceneNumber == 10){ //transitions to Report.fxml
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("Report.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);
            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }
        if(sceneNumber == 11){ //transitions to LoginButtonDashboard.fxml
            Parent mainWindowParent = FXMLLoader.load(getClass().getResource("LoginButtonDashboard.fxml"));
            Scene mainWindowScene = new Scene(mainWindowParent);
            Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            window.setScene(mainWindowScene);
            window.show();
        }

         */



    }
}
