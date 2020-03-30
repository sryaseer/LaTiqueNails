package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.shape.VertexFormat;
import javafx.scene.text.Font;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class AppointmentController extends DatabaseOperator implements Initializable {

    @FXML public Label VerifyLabel, FValidate, DateValidate, TimeValidate, ServValidate, LValidate, VPhoneNum, text_email, VPhoneNumFormat;
    @FXML public TextField FName, LName, PhoneNumBox, txt_Numeric;
    @FXML public DatePicker AppDate;
    // Combo Box
    @FXML
    public ComboBox<String> TypeOfService;
    ObservableList<String> Service = FXCollections.observableArrayList(null ,"Test1", "Test2"); //Options for the Combo Box
    @FXML
    public ComboBox<String> AppTime;
    ObservableList<String> Time = FXCollections.observableArrayList(
            "12:00", "12:30", "1:00", "1:30","2:00", "2:30","3:00", "3:30","4:00", "4:30","5:00", "5:30","6:00", "6:30"
            ,"7:00", "7:30","8:00", "8:30","9:00", "9:30","10:00", "10:30","11:00"
    ); //Options for the Combo Box

    String fname;
    String lname;
    String phoneNum;
    LocalDate servicedate;

    boolean Vfnamev;
    boolean Vlname;
    boolean Vservicedate;
    boolean Vservicetime;
    boolean Vservicetype;
    boolean VphoneNum;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TypeOfService.setItems(Service);
        AppTime.setItems(Time);
    }


    public void backButtonClicked(ActionEvent event) throws IOException {
        ChangeScene("dashboard.fxml",event);
    }

    public void grabInfo(ActionEvent event){
        fname = FName.getText(); //store the info of first name //Textfield
        lname = LName.getText(); //store the info of last name //Textfield
        phoneNum = PhoneNumBox.getText();
        servicedate = AppDate.getValue(); //Datepicker
        AppTime.getValue(); //combobox
        TypeOfService.getValue(); //Combobox
        String email = txt_Numeric.getText();

        Vfnamev = Validation.textFieldNotEmpty(FName, FValidate, "Required");
        Vlname = Validation.textFieldNotEmpty(LName, LValidate, "Required");
        Vservicedate = Validation.dataPickerNotEmpty(AppDate, DateValidate, "Required");
        Vservicetime = Validation.comboBoxNotEmpty(AppTime, TimeValidate, "Required");
        Vservicetype = Validation.comboBoxNotEmpty(TypeOfService, ServValidate, "Required");
        VphoneNum = Validation.textFieldNotEmpty(PhoneNumBox, VPhoneNum, "Required");

        boolean vEmail = Validation.emailFormat(txt_Numeric, text_email, "proper email");
     //   boolean number_format = Validation.numberFormat(PhoneNumBox, VPhoneNumFormat, "Number Format");

        //Validation that all fields are filled or prompt user to
        if (Vfnamev && Vlname && Vservicedate && Vservicetime && Vservicetype && VphoneNum && vEmail)
        {
            VerifyLabel.setText(fname + " " + lname + " Phone:" + phoneNum + " Date:" + servicedate.toString()
                    +"  Time:" + AppTime.getValue() + "  Service:" + TypeOfService.getValue());
        }


    }
    //Clears all the selection
    public void clearButton(ActionEvent event){
        VerifyLabel.setText("");
        FName.setText("");
        LName.setText("");
        PhoneNumBox.setText("");
        AppTime.setValue(null);
        AppDate.setValue(null);
        TypeOfService.setValue(null);
        txt_Numeric.setText("");
    }
}