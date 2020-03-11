package sample;

import javafx.beans.property.SimpleStringProperty;


public class Student {

    private SimpleStringProperty firstname;
    private SimpleStringProperty lastname;

    public Student () {
    }

    public Student (String s1, String s2) {

        firstname = new SimpleStringProperty(s1);
        lastname = new SimpleStringProperty(s2);
    }

    public String getFirstname() {

        return firstname.get();
    }
    public void setTitle(String s) {

        firstname.set(s);
    }

    public String getLastname() {

        return lastname.get();
    }
    public void setLastname(String s) {

        lastname.set(s);
    }

    @Override
    public String toString() {

        return (firstname.get()  + lastname.get());
    }
}