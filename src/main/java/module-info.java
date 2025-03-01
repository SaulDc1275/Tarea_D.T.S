module cr.ac.una.unaplanilla {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens cr.ac.una.unaplanilla to javafx.fxml;
    exports cr.ac.una.unaplanilla;
}
