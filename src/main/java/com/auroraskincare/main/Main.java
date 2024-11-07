/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */
package com.auroraskincare.main;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.initStyle(StageStyle.UNDECORATED);
        Parent root=FXMLLoader.load(this.getClass().getResource("/com/auroraskincare/view/Login.fxml"));

        Scene temp=new Scene(root);
        primaryStage.setScene(temp);
        primaryStage.show();
        primaryStage.centerOnScreen();
        primaryStage.setResizable(false);

        FadeTransition trans=new FadeTransition(Duration.millis(2000),root);
        trans.setFromValue(0.1);
        trans.setToValue(1.0);
        trans.play();

    }
    public static void main(String[] args) {
        launch(args);
    }

}