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
        sc.ChangeScene(5, event);
    }

    public void customerInfoClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene(6,event);
    }

    public void employeeInfoClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene(7,event);
    }

    public void discountPromotionClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene(8,event);
    }

    public void invoiceClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene(9,event);
    }

    public void reportClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene(10,event);
    }

    public void serviceClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene(11,event);
    }

    public void accountAccessClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene(12,event);
    }

    public void logOutClicked(ActionEvent event) throws IOException{
        SceneChanger sc = new SceneChanger();
        sc.ChangeScene(3,event);
    }
}
