/*
* Class used for form validation. can be used globally on any fields as long as you declare it.
* Remember to create boolean object in class, then call Validation class, then choose TextFieldNotEmpty
* Also created for DataPicker too
* */

package sample;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Validation {
    //TEXTFILE
    public static boolean textFieldNotEmpty(TextField i){
        boolean r = false;
        if (i.getText() != null && !i.getText().isEmpty()){
            r = true;
        }
        return r;
    }

    public static boolean textFieldNotEmpty(TextField i, Label l, String sValudationText){
        boolean r = true;
        String c = null;
        if(!textFieldNotEmpty(i)){
            r = false;
            c = sValudationText;
        }
        l.setText(c);
        return r;
    }

    //DATEPICKER
    public static boolean dataPickerNotEmpty(DatePicker i){
        boolean r = false;
        if (i.getValue() != null && !i.getValue().equals(null)){
            r = true;
        }
        return r;
    }
    public static boolean dataPickerNotEmpty(DatePicker i, Label l, String sValudationText){
        boolean r = true;
        String c = null;
        if(!dataPickerNotEmpty(i)){
            r = false;
            c = sValudationText;
        }
        l.setText(c);
        return r;
    }

    //COMBO BOX
    public static boolean comboBoxNotEmpty(ComboBox i){
        boolean r = false;
        if (i.getValue() != null && !i.getValue().equals(null)){
            r = true;
        }
        return r;
    }

    public static boolean comboBoxNotEmpty(ComboBox i, Label l, String sValudationText){
        boolean r = true;
        String c = null;
        if(!comboBoxNotEmpty(i)){
            r = false;
            c = sValudationText;
        }
        l.setText(c);
        return r;
    }
}
