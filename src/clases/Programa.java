package clases;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Programa implements Initializable {
    //    Version
    Double numVersion = 0.1;
    @FXML
    private AnchorPane panelContenido;
    @FXML
    private MenuItem versionPrograma;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        versionPrograma.setText(versionPrograma.getText() + " " + numVersion.toString());
    }

    public void ventanaClientesAltas(ActionEvent event) throws Exception {
        AnchorPane ventanaHija = FXMLLoader.load(getClass().getResource("/clientes/clientesAltas.fxml"));
        panelContenido.getChildren().setAll(ventanaHija);
        System.out.println("entro");
    }

    public void ventanaClientesBajas(ActionEvent event) throws Exception {
        AnchorPane ventanaHija = FXMLLoader.load(getClass().getResource("/clientes/clientesBajas.fxml"));
        panelContenido.getChildren().setAll(ventanaHija);
    }
}