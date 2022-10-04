package com.example.vbox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloApplication extends Application{

    @Override
    public void start(Stage primaryStage)
            throws Exception {

        primaryStage.setTitle("VBox Intento");

        Button boton1 = new Button("Primero");
        boton1.setMaxWidth(99999);
        Button boton2 = new Button("Segundo");

        VBox cajaV = new VBox(boton1, boton2);
        cajaV.setAlignment(Pos.BASELINE_CENTER);
        cajaV.setSpacing(50);
        cajaV.setFillWidth(true);



        Scene scene = new Scene(cajaV, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}