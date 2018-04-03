package com.csci360.alarmclock;

/**
 * ANYTHING THAT UPDATES UI NEEDS TO BE IN in Platform.runLater(() -> {//Do stuff here};
 * 
 * No buttons are working, but I'll add system prints for them all.
 * 
 * GUI needs to be fix to look prettier, will get on that. 
 * 
 * An alarming function needs to happen. 
 */

import java.util.Timer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.TimerTask;
import javafx.application.Platform;




public class GraphicalUIController {
    
        AlarmClock sys = new AlarmClock();
        Timer syst;
        int seconds = 0;
        
        public void initialize()
        {
            syst = new Timer();
            syst.scheduleAtFixedRate(new TimerTask()
            {
                public void run()
                {
                    
                    Platform.runLater(() -> {timeLabel.setText(sys.getCurrentTime());});
                }
            }, 0, 1000);
        };
    
    //Declare all elements of the GUI that will be used 
    @FXML
    private Label timeLabel;

    @FXML
    private Button volUpButton;

    @FXML
    private Button volDownButton;

    @FXML
    private Button snoozeButton;

    @FXML
    private Button alarmOffButton;

    @FXML
    private Label bandLabel;

    @FXML
    private Label freqLabel;

    @FXML
    private Button alarm1ToggleButton;

    @FXML
    private Button alarm2ToggleButton;

    @FXML
    private Button setAlarm1Button;

    @FXML
    private Button setAlarm2Button;

    @FXML
    private Button sysTimeSetButton;

    @FXML
    private Button toggleBandButton;

    @FXML
    private Button stationUpButton;

    @FXML
    private Button stationDownButton;

    @FXML
    private Label alarm1Label;

    @FXML
    private Label alarm2Label;

    @FXML
    void volumeDown(ActionEvent event) 
    {
        System.out.println("Pressed the vol down button");

    }

    @FXML
    void volumeUp(ActionEvent event) 
    {
        System.out.println("Pressed the vol up button");

    }
    
    @FXML
    void bandToggle(ActionEvent event)
    {
        System.out.println("Toggled the radio band");
    }
    
    @FXML
    void radioPower(ActionEvent event){System.out.println("Toggled the radio power");}
    
    @FXML
    void stationUp(ActionEvent event){System.out.println("Pressed the station up");}
    
    @FXML
    void stationDown(ActionEvent event){System.out.println("Pressed the station down");}
    
    @FXML
    void setSysTime(ActionEvent event){System.out.println("Asked to set the system time");}
    
    @FXML
    void setAlarmOne(ActionEvent event){System.out.println("Asked to set Alarm One Time");}
    
    @FXML
    void setAlarmTwo(ActionEvent event){System.out.println("Asked to set Alarm Two time");}
    
    @FXML
    void toggleAlarmOne(ActionEvent event){System.out.println("Toggled the alarm one setting");}
    
    @FXML
    void togleAlarmTwo(ActionEvent event){System.out.println("Toggled the alarm two setting");}
    
    @FXML
    void silenceAlarm(ActionEvent event){System.out.println("TOLD THE ALARM TO SHUT UP");}
    
    @FXML
    void snoozeAlarm(ActionEvent event){System.out.println("snoozed the alarm");}
    
    
  
   
    

}
