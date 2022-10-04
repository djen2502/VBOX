module com.example.vbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vbox to javafx.fxml;
    exports com.example.vbox;
}