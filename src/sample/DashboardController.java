package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController extends DatabaseOperator implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void appointmentClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene("Appointment.fxml", event);
    }

    public void customerInfoClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene("AddCustomers.fxml",event);
    }

    public void employeeInfoClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene("AddEmployee.fxml",event);
    }

    public void discountPromotionClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene("ServicesAndDiscounts.fxml",event);
    }

    public void invoiceClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene("Invoice.fxml",event);
    }

    public void reportClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene("Report.fxml",event);
    }

    public void accountAccessClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene("LoginButtonDashboard.fxml",event);
    }

    public void logOutClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene("Login Page.fxml",event);
    }

}
