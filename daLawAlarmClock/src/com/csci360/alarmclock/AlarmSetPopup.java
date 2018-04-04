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
public class AlarmSetPopup 
{
    
     public static Object[] display(String msg,int[] defaultTime)
    {
        ObservableList<Integer> possibleHours = FXCollections.observableArrayList();
    
        ObservableList<Integer> possibleMinutes = FXCollections.observableArrayList();
    
        ObservableList<String> possibleMeridan = FXCollections.observableArrayList("AM", "PM");
        
        ObservableList<String> possibleSound = FXCollections.observableArrayList("Beep", "Radio Alarm");
        
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
ChoiceBox<String> selSnd = new ChoiceBox<>();

selHr.setItems(possibleHours);
selMn.setItems(possibleMinutes);
selMer.setItems(possibleMeridan);
selSnd.setItems(possibleSound);

      
     
Button cancelButton = new Button("Cancel");

Button confirmButton = new Button("Confirm");
     

     
cancelButton.setOnAction(e -> pW.close());

confirmButton.setOnAction(e -> pW.close());

selHr.setValue(hr);
selMn.setValue(mn);
selSnd.setValue("Beep");

if (defaultTime[0] > 12){selMer.setValue("PM");}
else{selMer.setValue("AM");}
     

VBox layout = new VBox(10);
     
      
layout.getChildren().addAll(label1,selHr,selMn,selMer,cancelButton,confirmButton);
      
layout.setAlignment(Pos.CENTER);
      
Scene scene1= new Scene(layout, 300, 250);

pW.setScene(scene1);

pW.showAndWait();

    
int[] tms = formatTime(selHr.getValue(),selMn.getValue(),selMer.getValue());

Object[] returnVal = {tms[0], tms[1], soundType(selSnd.getValue())};
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
    
    private static boolean soundType(String val)
    {
        if (val.equals("Beep"))
        {return true;}
        else {return false;}
    }
}
