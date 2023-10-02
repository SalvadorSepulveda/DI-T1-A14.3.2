package es.ieslosmontecillos.anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnonymousInnerClass extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Crear los botones
        Button nuevoButton = new Button("Nuevo");
        Button abrirButton = new Button("Abrir");
        Button guardarButton = new Button("Guardar");
        Button imprimirButton = new Button("Imprimir");

        // Crear un contenedor para los botones
        HBox buttonContainer = new HBox(nuevoButton, abrirButton, guardarButton, imprimirButton);
        buttonContainer.setAlignment(Pos.CENTER);
        buttonContainer.setSpacing(10);

        // Crear la escena y mostrarla en la ventana
        Scene scene = new Scene(buttonContainer, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Clases anonimas
        nuevoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo Proceso");
            }
        });

        abrirButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir proceso");
            }
        });

        guardarButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar proceso");
            }
        });

        imprimirButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprimir proceso");
            }
        });
    }
}