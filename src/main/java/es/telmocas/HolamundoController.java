package es.telmocas;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import javax.swing.text.PlainDocument;

public class HolamundoController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnOk;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtNombre;

    @FXML
    private VBox vContenedorPrincipal;

    /**
     *  cierra la ventana JavaFX
     * @param event
     */
    @FXML
    void onCancel(ActionEvent event) {
        Platform.exit();
    }

    /**
     *  cambia el contenido de los textFields
     * @param event
     */
    @FXML
    void onOk(ActionEvent event) {
        txtNombre.setText("Telmo");
        txtApellido.setText("Castillo");
    }

}
