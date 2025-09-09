module es.telmocas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens es.telmocas to javafx.fxml;
    exports es.telmocas;
}
