/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Liam
 */
public class GraphicalUIController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

        private void volumeUp(ActionEvent event) {
        System.out.println("volume up");
        
        //label.setText("Hello World!");
    }
        
            public void volumeDown(ActionEvent event) {
        System.out.println("volume down");
        //label.setText("Hello World!");
    }
    
}
