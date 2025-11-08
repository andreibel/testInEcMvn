module com.andreibel.frontend {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.andreibel.frontend to javafx.fxml;
    exports com.andreibel.frontend;
}