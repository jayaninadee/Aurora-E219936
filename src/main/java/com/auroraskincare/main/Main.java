/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */
package com.auroraskincare.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException, ClassNotFoundException {

//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Parent root;
//        root = FXMLLoader.load(getClass().getResource("/com/auroraskincare/view/Login.fxml"));
//        Scene mainscene = new Scene(root);
//
//        primaryStage.setScene(mainscene);
//        primaryStage.setTitle("Log In");
//        primaryStage.show();
//    }
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("com/auroraskincare/view/Login.fxml"));
        fxmlLoader.setRoot(new AnchorPane());
        Parent root = fxmlLoader.load();
    }
    public static void main(String[] args) {
        launch(args);
    }

}