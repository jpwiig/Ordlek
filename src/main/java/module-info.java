module com.example.fxapplikasjon {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.fxapplikasjon to javafx.fxml;
    exports com.example.fxapplikasjon;
}