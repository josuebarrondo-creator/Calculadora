module com.example.actividad1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.desktop;

    opens com.example.actividad1 to javafx.fxml;
    exports com.example.actividad1;
}