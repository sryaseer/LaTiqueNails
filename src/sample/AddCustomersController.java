package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddCustomersController extends DatabaseOperator implements Initializable {

    @FXML
    public TextField emailBox, phoneNumberBox, lastNameBox, firstNameBox;

    @FXML
    public Label invalidFirstName, invalidLastName, invalidPhone, invalidEmail;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void backButtonClicked(ActionEvent event) throws IOException {
        ChangeScene("dashboard.fxml",event);
    }

    public void addClicked(ActionEvent event){
        Validation.textFieldNotEmpty(firstNameBox,invalidFirstName,"Invalid");
        Validation.textFieldNotEmpty(lastNameBox,invalidLastName,"Invalid");

        if(Validation.textFieldNotEmpty(phoneNumberBox,invalidPhone,"Invalid")) //empty validation
            Validation.numberFormat(phoneNumberBox,invalidPhone,"Invalid");     //has numbers validation

        if (Validation.textFieldNotEmpty(emailBox,invalidEmail,"Invalid"))      //empty validation
            Validation.emailFormat(emailBox,invalidEmail,"Invalid");            //is email validation


    }



}
