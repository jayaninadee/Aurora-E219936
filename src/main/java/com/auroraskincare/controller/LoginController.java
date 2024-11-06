/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */
package com.auroraskincare.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private AnchorPane paneLogin;
    @FXML
    private Button btnLogin;
    @FXML
    private Hyperlink hybrForgotPassword;
    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPswrd;
    @FXML
    private Label lblErrorMsg;
    @FXML
    private ImageView close;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void login(ActionEvent event) throws IOException {
//         if(txtUsername.getText().equals("") || txtPswrd.getText().equals("")){
//           lblErrorMsg.setText("Please Fill The Fields");
//
//       }else if(txtUsername.getText().equalsIgnoreCase("Admin") && !txtPswrd.getText().equals("1234")){
//           lblErrorMsg.setText("Password is Wrong");
//
//       }else if(!txtUsername.getText().equalsIgnoreCase("Admin") && txtPswrd.getText().equals("1234")){
//           lblErrorMsg.setText("Username is Wrong");
//
//       }else if(!txtUsername.getText().equalsIgnoreCase("Admin") && !txtPswrd.getText().equals("1234")){
//           lblErrorMsg.setText("Username or Password is Wrong");
//
//       }else if(txtUsername.getText().equalsIgnoreCase("Admin") && txtPswrd.getText().equals("1234")){
        Parent root= FXMLLoader.load(this.getClass().getResource("/lk/saninro/hr/view/Selection.fxml"));
        Scene temp=new Scene(root);
        Stage stage=(Stage) this.paneLogin.getScene().getWindow();
        stage.setScene(temp);
        stage.centerOnScreen();
        stage.setResizable(false);
        // }
    }

    @FXML
    private void forgotPassword(ActionEvent event) {
    }

    @FXML
    private void closeWindow(MouseEvent event) {
        System.exit(0);
    }

}