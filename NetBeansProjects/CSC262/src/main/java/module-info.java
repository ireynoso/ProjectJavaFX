module com.mycompany.csc262 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.csc262 to javafx.fxml;
    exports com.mycompany.csc262;
}
