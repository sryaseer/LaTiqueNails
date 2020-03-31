/*
* Class used for form validation. can be used globally on any fields as long as you declare it.
* Remember to create boolean object in class, then call Validation class, then choose TextFieldNotEmpty
* Also created for DataPicker too
* */

package sample;

import com.sun.jdi.InvocationException;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import jdk.jfr.StackTrace;

public class Validation {
    //TEXTFILE------------------------------------------------------------------
    public static boolean textFieldNotEmpty(TextField i){
        boolean r = false;
        if (i.getText() != null && !i.getText().isEmpty()){
            r = true;
        }
        return r;
    }
    //Empty text Format
    public static boolean textFieldNotEmpty(TextField i, Label l, String sValidationText){
        boolean r = true;
        String c = null;
        if(!textFieldNotEmpty(i)){
            r = false;
            c = sValidationText;
        }
        l.setText(c);
        l.setOpacity(1);
        l.setTextFill(Color.valueOf("red"));
        return r;
    }
    // Number Format - USE FOR ALL NUMBER INPUT VALIDATION

    public static boolean numberFormat(TextField i, Label l, String sValidationText) {
        boolean r = true;
        String c = null;
        if (!i.getText().matches("[0-9]+")){
            r = false;
            c = sValidationText;
        }
        l.setText(c);
        l.setOpacity(1);
        l.setTextFill(Color.valueOf("Blue"));
        return r;
    }
    //Email Format Special characters ._- allowed
    public static boolean emailFormat(TextField i, Label l, String sValidationText){
        boolean r = true;
        String c = null;
        if(!i.getText().matches("[a-zA-z0-9._-]+@[a-zA-Z0-9]+\\.com")){
            r = false;
            c = sValidationText;
        }
        l.setText(c);
        l.setOpacity(1);
        l.setTextFill(Color.valueOf("Blue"));
        return r;
    }

    //DATEPICKER------------------------------------------------------------------
    public static boolean dataPickerNotEmpty(DatePicker i){
        boolean r = false;
        if (i.getValue() != null && !i.getValue().equals(null)){
            r = true;
        }
        return r;
    }
    public static boolean dataPickerNotEmpty(DatePicker i, Label l, String sValidationText){
        boolean r = true;
        String c = null;
        if(!dataPickerNotEmpty(i)){
            r = false;
            c = sValidationText;
        }
        l.setText(c);
        l.setOpacity(1);
        l.setTextFill(Color.valueOf("red"));
        return r;
    }

    //COMBO BOX------------------------------------------------------------------
    public static boolean comboBoxNotEmpty(ComboBox i){
        boolean r = false;
        if (i.getValue() != null && !i.getValue().equals(null)){
            r = true;
        }
        return r;
    }

    public static boolean comboBoxNotEmpty(ComboBox i, Label l, String sValidationText){
        boolean r = true;
        String c = null;
        if(!comboBoxNotEmpty(i)){
            r = false;
            c = sValidationText;
        }
        l.setText(c);
        l.setOpacity(1);
        l.setTextFill(Color.valueOf("red"));
        return r;
    }
    //RADIO BOX------------------------------------------------------------------
    public static boolean RadioBoxNotEmpty(RadioButton i){
        boolean r = false;
        if (!i.isSelected()){
            r = true;
        }
        return r;
    }

    public static boolean radioBoxNotEmpty(RadioButton i,RadioButton z, Label l, String sValidationText){
        boolean r = true;
        String c = null;
        if(!i.isSelected() && !z.isSelected()){
            r = false;
            c = sValidationText;
        }
        l.setText(c);
        l.setOpacity(1);
        l.setTextFill(Color.valueOf("red"));
        return r;
    }
}