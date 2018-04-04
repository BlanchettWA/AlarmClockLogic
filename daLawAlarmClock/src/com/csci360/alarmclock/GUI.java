/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Timer;


/**
 *
 * @author Liam
 */
public class GUI extends Application {
    
    Timer timeRunner;

    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        //Initialize the display
        Parent root = FXMLLoader.load(getClass().getResource("GraphicalUIDesign.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        
  
        
        
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
