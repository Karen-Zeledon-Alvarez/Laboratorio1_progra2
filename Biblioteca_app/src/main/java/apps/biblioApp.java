/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps;

/**
 *
 * @author karen
 */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import Modelado.Autores_md;
import Modelado.Libros_md;
public class biblioApp extends Application {
    private ObservableList<Libros_md> libros = FXCollections.observableArrayList();

    @Override
    public void start(Stage stage) {
        Label lblTitulo = new Label("Gestor de Biblioteca");
        lblTitulo.getStyleClass().add("titulo");

        TextField txtCedula = new TextField();
        TextField txtNombreAutor = new TextField();
        TextField txtTelefono = new TextField();
        TextField txtCodigoLibro = new TextField();
        TextField txtNombreLibro = new TextField();
        TextField txtAño = new TextField();

        txtCedula.setPromptText("Ej. 000000000");
        txtNombreAutor.setPromptText("Nombre del profesor");
        txtTelefono.setPromptText("Ej. 00000000");
        txtCodigoLibro.setPromptText("Ej. AA0000");
        txtNombreLibro.setPromptText("Nombre del libro");
        txtAño.setPromptText("Ej. 0000");
        
        Button btnAgregar = new Button("Agregar Libro");

        ListView<Libros_md> lstLibros = new ListView<>(libros);

        GridPane formulario = new GridPane();
        formulario.setHgap(10);
        formulario.setVgap(10);
        formulario.setPadding(new Insets(15));

        formulario.add(new Label("Cedula del autor"), 0, 0);
        formulario.add(txtCedula, 1, 0);

        formulario.add(new Label("Nombre del autor"), 0, 1);
        formulario.add(txtNombreAutor, 1, 1);
        
        formulario.add(new Label("Telefono del autor"), 0, 2);
        formulario.add(txtTelefono, 1, 2);
        
        formulario.add(new Label("Codigo del libro"), 0, 3);
        formulario.add(txtCodigoLibro, 1, 3);

        formulario.add(new Label("Nombre del libro"), 0, 4);
        formulario.add(txtNombreLibro, 1, 4);

        formulario.add(new Label("Año de publicacion"), 0, 5);
        formulario.add(txtAño, 1, 5);

        formulario.add(btnAgregar, 1, 6);

        VBox panelDerecho = new VBox(10, new Label("Libros Registrados"), lstLibros);
        panelDerecho.setPadding(new Insets(15));

        BorderPane root = new BorderPane();
        root.setTop(lblTitulo);
        BorderPane.setMargin(lblTitulo, new Insets(15, 15, 0, 15));
        root.setCenter(formulario);
        root.setRight(panelDerecho);

        btnAgregar.setOnAction(e -> {
            String cedula = txtCedula.getText().trim();
            String nombreautor = txtNombreAutor.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String codigolibro = txtCodigoLibro.getText().trim();
            String nombrelibro = txtNombreLibro.getText().trim();
            String añolibro = txtAño.getText().trim();

            if (cedula.isEmpty() || nombreautor.isEmpty() || telefono.isEmpty() || codigolibro.isEmpty() || nombrelibro.isEmpty()|| añolibro.isEmpty()) {
                mostrarAlerta("Todos los campos son obligatorios.");
                return;
            }

            Autores_md autor = new Autores_md(cedula, nombreautor, telefono);
 

            Libros_md libro = new Libros_md(codigolibro, nombrelibro, añolibro, autor);
            libros.add(libro);

            txtCedula.clear();
            txtNombreAutor.clear();
            txtTelefono.clear();
            txtCodigoLibro.clear();
            txtNombreLibro.clear();
            txtAño.clear();
        });

        Scene scene = new Scene(root, 900, 600);
        scene.getStylesheets().add(getClass().getResource("/recurso/blibioteca_estilo.css").toExternalForm());

        stage.setTitle("Gestor de Biblioteca");
        stage.setScene(scene);
        stage.show();
    }


    private void mostrarAlerta(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setHeaderText("Validación");
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
    public static void main(String[] args) {
    launch(args);
}
}
