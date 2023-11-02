package com.example.cochesmongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnModificar;

    @FXML
    private Button btnNuevo;

    @FXML
    private ComboBox<?> cbTipo;

    @FXML
    private TableColumn<?, ?> colMarca;

    @FXML
    private TableColumn<?, ?> colMatricula;

    @FXML
    private TableColumn<?, ?> colModelo;

    @FXML
    private TableColumn<?, ?> colTipo;

    @FXML
    private TableView<?> tblCoches;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtModelo;

    MongoClient con;

    void conectar(){
        try {
            con = new MongoClient(new MongoClientURI("mongodb://root:password@localhost:27017/?authSource=admin"));
            System.out.println("Conectada correctamente a la BD");

        } catch (Exception e) {
            System.out.println("Conexion Fallida");
            System.out.println(e.getMessage());
            con = null;
        }
    }

    @FXML
    void cocheCancelar(ActionEvent event) {

    }

    @FXML
    void cocheEliminar(ActionEvent event) {

    }

    @FXML
    void cocheGuardar(ActionEvent event) {

    }

    @FXML
    void cocheModificar(ActionEvent event) {

    }

    @FXML
    void cocheNuevo(ActionEvent event) {

    }

}
