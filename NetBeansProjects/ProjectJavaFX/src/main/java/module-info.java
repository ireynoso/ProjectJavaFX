module com.mycompany.projectjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.projectjavafx to javafx.fxml;
    exports com.mycompany.projectjavafx;
}
