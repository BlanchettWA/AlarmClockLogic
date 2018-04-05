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

//TODO: Fix frequency refresh on band toggle
//TODO: truncate extra float on freq display


import java.util.Timer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;





public class GraphicalUIController {
    
        AlarmClock sys = new AlarmClock();
        Timer syst;
        int seconds = 0;
        

        
        public void initialize() throws Exception
        {
            //Initialize the display labels
            Platform.runLater(() -> 
            {
                freqLabel.setText(sys.getRadioFreq());
                timeLabel.setText(sys.getCurrentTime());
                radioPowerLight.setFill(Color.BLACK);
                alarm1Label.setText(sys.getAlarmTime(0));
                alarm2Label.setText(sys.getAlarmTime(1));
            
            
            });
            
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
    private Rectangle alarm1Light;

    @FXML
    private Rectangle alarm2Light;

    @FXML
    private Rectangle radioPowerLight;

    
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
        sys.toggleRadioBand();
        Platform.runLater(() -> {
            bandLabel.setText(sys.getRadioBand());
        freqLabel.setText(sys.getRadioFreq());});
    }
    
    @FXML
    void radioPower(ActionEvent event){
        sys.toggleRadioPower();
        
        Platform.runLater(() -> 
        {
            Paint curColor = radioPowerLight.getFill();
            
            if (curColor == Color.BLACK){radioPowerLight.setFill(Color.GREEN);}
                else{radioPowerLight.setFill(Color.BLACK);}
        
        });
        //Adjust display to signal the radio is on
    }
    
    @FXML
    void stationUp(ActionEvent event){
        sys.adjustRadioFreq(10);
        Platform.runLater(() -> {freqLabel.setText(sys.getRadioFreq());});

    }
    
    
    @FXML
    void stationDown(ActionEvent event){
        sys.adjustRadioFreq(-10);
        Platform.runLater(() -> {freqLabel.setText(sys.getRadioFreq());});
    }
    
    @FXML
    void setSysTime(ActionEvent event)
    {
       int[] rst = TimePopup.display("Set the System Time",sys.getTimeArray());
            
            sys.setClock(rst[0], rst[1]);
            
            Platform.runLater(()-> {timeLabel.setText(sys.getCurrentTime());});
        

    }
    
    @FXML
    void setAlarmOne(ActionEvent event){
        Object[] rst = AlarmSetPopup.display("Set Alarm 1 Time",sys.getAlarmTimeArray(0));
        
        sys.setAlarm(0, (int) rst[0], (int) rst[1], (boolean) rst[2]);
        
        Platform.runLater(()-> {alarm1Label.setText(sys.getAlarmTime(0));});
    }
    
    @FXML
    void setAlarmTwo(ActionEvent event)
    {
        Object[] rst = AlarmSetPopup.display("Set Alarm 2 Time",sys.getAlarmTimeArray(1));
        
        sys.setAlarm(1, (int) rst[0], (int) rst[1], (boolean) rst[2]);
        
        Platform.runLater(()-> {alarm2Label.setText(sys.getAlarmTime(1));});
    }
    
    @FXML
            //to set the alarm to go off or on
            //cant tell if alarm is enabled or not
    void toggleAlarmOne(ActionEvent event){
        if (!sys.getAlarmState(0)){
            sys.enableAlarm(0);
            //view action here
        }
        else{
            sys.disableAlarm(0);
            //view action here
        }
        //System.out.println("Toggled the alarm one setting");
    }
    
    @FXML
            //misspelled but works
    void togleAlarmTwo(ActionEvent event){
        if (!sys.getAlarmState(1)){
            sys.enableAlarm(1);
            //view action here
        }
        else{
            sys.disableAlarm(1);
            //view action here
        }
        //System.out.println("Toggled the alarm two setting");
    }
    
    @FXML
    void silenceAlarm(ActionEvent event){
        sys.stopAlarm();
        //view action here
        //System.out.println("TOLD THE ALARM TO SHUT UP");
    }
    
    @FXML
    void snoozeAlarm(ActionEvent event){
        sys.snoozeAlarm();
        //view action here.
        //System.out.println("snoozed the alarm");
    }
    
   
        
    }