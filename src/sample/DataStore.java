package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;

public class DataStore {

   private String firstName;
   private String lastName;
   private String gender;
   private String email;
   private String phone;

   public DataStore(String firstName, String lastName, String phone, String email, String gender){
      this.firstName = new String(firstName);
      this.lastName = new String(lastName);
      this.phone = new String(phone);
      this.email = new String(email);
      this.gender = new String(gender);

   }

   public String getfirstName(){
      return firstName;
   }

   public void setfirstName(String firstName){
      this.firstName=firstName;
   }

   public String getlastName(){
      return lastName;
   }

   public void setlastName(String lastName){
      this.lastName=lastName;
   }

   public String getgender(){
      return gender;
   }

   public void setgender(String gender){
      this.gender=gender;
   }

   public String getemail(){
      return email;
   }

   public void  setemail(String email){
      this.email=email;
   }

   public String getphone(){
      return phone;
   }

   public void  setphone(String phone){
      this.phone=phone;
   }

}
