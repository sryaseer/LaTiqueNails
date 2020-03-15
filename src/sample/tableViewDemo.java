package sample;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class tableViewDemo extends Application {

    private TableView<Student> table;
    private ObservableList<Student> data;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {

        stage.setTitle("JOKER DATA");
        stage.setWidth(1000);
        stage.setHeight(500);

        // Table view, data, columns and properties
        table = new TableView<>();
        data = getInitialTableData();
        table.setItems(data);
        table.setEditable(true);

        //Table columns
        TableColumn firstNameCol = new TableColumn("First Name");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Student,String>("firstname"));

        TableColumn lastNameCol = new TableColumn("Last Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(new PropertyValueFactory<Student,String>("lastname"));

        TableColumn idCol = new TableColumn("ID");
        idCol.setMinWidth(10);

        TableColumn mailCol = new TableColumn("Email");
        mailCol.setMinWidth(100);

        TableColumn addL1 = new TableColumn("Street");
        addL1.setMinWidth(100);

        TableColumn addL2 = new TableColumn("City");
        addL2.setMinWidth(100);

        table.getColumns().setAll(firstNameCol, lastNameCol, idCol, mailCol, addL1, addL2);

        //Right side
        final Label label = new Label("Students Data");
        label.setFont(new Font("Arial", 20));
        VBox vbox1 = new VBox();
        vbox1.setSpacing(5);
        vbox1.setPadding(new Insets(10, 0, 0, 10));
        vbox1.getChildren().addAll(label, table);

        //LeftSide of the Scene
        Label lfn = new Label("First Name");
        Label lln = new Label("Last Name");
        Label lid = new Label("ID");
        Label lem = new Label("Email");
        Label ladd1 = new Label("Address1");
        Label ladd2 = new Label("Address2");
        TextField tfn = new TextField();
        TextField tln = new TextField();
        TextField tid = new TextField();
        TextField tem = new TextField();
        TextField tad1 = new TextField();
        TextField tad2 = new TextField();
        Button b1 = new Button("add");
        GridPane g = new GridPane();
        g.setVgap(10);
        g.setHgap(5);
        g.add(lfn, 0, 0);
        g.add(tfn, 1, 0);
        g.add(lln, 0, 1);
        g.add(tln, 1, 1);
        g.add(lid, 0, 2);
        g.add(tid, 1, 2);
        g.add(lem, 0, 3);
        g.add(tem, 1, 3);
        g.add(ladd1, 0, 4);
        g.add(tad1, 1, 4);
        g.add(ladd2, 0, 5);
        g.add(tad2, 1, 5);
        VBox vbox2 = new VBox();
        vbox2.setSpacing(5);
        vbox2.setPadding(new Insets(30, 5, 5, 5));
        vbox2.getChildren().addAll(g, b1);

        HBox hbox = new HBox();
        hbox.getChildren().addAll(vbox2, vbox1);

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {  // String fn=tfn.getText();
                //  String ln=tln.getText();
                //  int id= Integer.parseInt(tid.getText());
                // String em= tem.getText();
                // String ad1=tad1.getText();
                // String ad2=tad2.getText();
                // Student s = new Student(fn, ln, id, em, ad1, ad2);
                // data.add(new Student(tfn.getText(), tln.getText(), Integer.parseInt(tid.getText()), tem.getText(), tad1.getText(), tad2.getText()));
                data.add(new Student(tfn.getText(), tln.getText()));
                //table.setItems(data);
                // s.display();

                tfn.setText(" ");
                tln.setText(" ");
                tid.setText(" ");
                tem.setText(" ");
                tad1.setText(" ");
                tad2.setText(" ");
            }
        };

        b1.setOnAction(event);

        // Scene
        Scene scene = new Scene(hbox); // w x h
        stage.setScene(scene);
        stage.show();

    }


    private ObservableList getInitialTableData() {

        List list = new ArrayList();

        list.add(new Student("Jacob", "Smith"));

        ObservableList data = FXCollections.observableList(list);

        return data;
    }


} //end  of Demotableview class





//class Student {
//    private String fName;
//    private String lName;
//    private int id;
//    private String email;
//    private String add1;
//    private String add2;
//
//    public Student(String fName, String lName, int id, String email, String add1, String add2) {
//        this.fName = fName;
//        this.lName = lName;
//        this.id = id;
//        this.email = email;
//        this.add1 = add1;
//        this.add2 = add2;
//    }
//
//    public void setfName(String fname) {
//        fName = fname;
//    }
//
//    public void setlName(String lname) {
//        lName = lname;
//    }
//
//    public void setId(int a) {
//        id = a;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setAdd1(String add1) {
//        this.add1 = add1;
//    }
//
//    public void setAdd2(String add2) {
//        this.add2 = add2;
//    }
//
//    public void display() {
//        System.out.println("Name" + fName);
//        System.out.println("id" + id);
//
//    }
//
//}