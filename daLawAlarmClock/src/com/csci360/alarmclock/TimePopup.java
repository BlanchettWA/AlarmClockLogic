/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Liam
 */
public class TimePopup {
    
    public static int[] display(String msg,int[] defaultTime)
    {
        boolean timeset = false;
        
        ObservableList<Integer> possibleHours = FXCollections.observableArrayList();
    
        ObservableList<Integer> possibleMinutes = FXCollections.observableArrayList();
    
        ObservableList<String> possibleMeridan = FXCollections.observableArrayList("AM", "PM");
        
        int hr = normalizeHour(defaultTime[0]);
        int mn = defaultTime[1];
        
        //Populate the proper lists 
                //Populate the hour list
        for (int h = 1; h < 13; h++)
    {
        Integer opt = h;
        possibleHours.add(opt);
    }
        
        //Populate the minute list
        for (int m = 0; m < 61; m++)
        {
            Integer opt = m;
            possibleMinutes.add(opt);
        }
        
        
        
        
    Stage pW = new Stage();
    pW.initModality(Modality.APPLICATION_MODAL);
    pW.setTitle("Set the time");
  
Label label1= new Label(msg);

ChoiceBox<Integer> selHr = new ChoiceBox<>();
ChoiceBox<Integer> selMn = new ChoiceBox<>();
ChoiceBox<String> selMer = new ChoiceBox<>();

selHr.setItems(possibleHours);
selMn.setItems(possibleMinutes);
selMer.setItems(possibleMeridan);

      
     
Button closeButton = new Button("Done");

closeButton.setOnAction(e -> pW.close());

selHr.setValue(hr);
selMn.setValue(mn);

if (defaultTime[0] > 12){selMer.setValue("PM");}
else{selMer.setValue("AM");}
     

VBox layout = new VBox(10);
     
      
layout.getChildren().addAll(label1,selHr,selMn,selMer,closeButton);
      
layout.setAlignment(Pos.CENTER);
      
Scene scene1= new Scene(layout, 300, 250);

pW.setScene(scene1);

pW.showAndWait();

    
int[] returnVal = formatTime(selHr.getValue(),selMn.getValue(),selMer.getValue());
return returnVal;
    }
    
    private static int normalizeHour(int rhr)
    {
        if (rhr > 12)
        {
            rhr = rhr - 12;
        }
        
        return rhr;
    }
    
    private static int[] formatTime(int rhr, int mn, String md)
    {
        if (md.equals("PM"))
        {
            rhr += 12;
        }
        
        int [] rst = {rhr, mn};
        
        return rst;
    }
    
    
}
