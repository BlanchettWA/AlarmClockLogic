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
                alarm1Light.setFill(Color.BLACK);
                alarm2Light.setFill(Color.BLACK);
            
            });
            
            syst = new Timer();
            syst.scheduleAtFixedRate(new TimerTask()
            {
                public void run()
                {
                    
                    Platform.runLater(() -> 
                    {timeLabel.setText(sys.getCurrentTime());
                    refreshLights();
                    
                    if (sys.checkIfAlarming())
                    {
                        showAlarming();
                    }
                    
                    });
                }
            }, 0, 1000);
            
           
                        
            
        };
    
    //Declare all elements of the GUI that will be used 
    @FXML
    private Label timeLabel;

    @FXML
    private Label bandLabel;

    @FXML
    private Label freqLabel;

    @FXML
    private Rectangle clockBackground;

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
        sys.adjustRadioVol(-10);

    }

    @FXML
    void volumeUp(ActionEvent event) 
    {
        sys.adjustRadioVol(10);

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
        
        Platform.runLater(()-> {alarm1Label.setText(sys.getAlarmTime(0));
        refreshLights();});
    }
    
    @FXML
    void setAlarmTwo(ActionEvent event)
    {
        Object[] rst = AlarmSetPopup.display("Set Alarm 2 Time",sys.getAlarmTimeArray(1));
        
        sys.setAlarm(1, (int) rst[0], (int) rst[1], (boolean) rst[2]);
        
        Platform.runLater(()-> {alarm2Label.setText(sys.getAlarmTime(1));
        refreshLights();});
    }
    
    
    
    
    @FXML
            //to set the alarm to go off or on
    void toggleAlarmOne(ActionEvent event){
        if (!sys.getAlarmState(0)){
            sys.enableAlarm(0);
            refreshLights();

        }
        else
        {
            sys.disableAlarm(0);
            
                  Platform.runLater(() -> 
        {
            clockBackground.setFill(Color.BLACK);
            refreshLights();
            adaptLightColors(Color.BLACK);
        
        });

        }
        
    }
    
    @FXML
            //misspelled but works
    void togleAlarmTwo(ActionEvent event){
        if (!sys.getAlarmState(1)){
            sys.enableAlarm(1);

        }
        
        else
        {
            sys.disableAlarm(1);
            
                  Platform.runLater(() -> 
        {
            clockBackground.setFill(Color.BLACK);
            refreshLights();
            adaptLightColors(Color.BLACK);
        
        });

        }
        
        refreshLights();

    }
    
    @FXML
    void silenceAlarm(ActionEvent event){
        sys.stopAlarm();

        
              Platform.runLater(() -> 
        {
            clockBackground.setFill(Color.BLACK);
            refreshLights();
            adaptLightColors(Color.BLACK);
        
        });

    }
    
    @FXML
    void snoozeAlarm(ActionEvent event){
        sys.snoozeAlarm();
        
              Platform.runLater(() -> 
        {
            clockBackground.setFill(Color.BLACK);
            refreshLights();
            adaptLightColors(Color.BLACK);
        
        });
    }
    
    
    void showAlarming()
    {
        Platform.runLater(() -> 
        {
            refreshLights();
            Paint curBg = clockBackground.getFill();
            
            if (curBg != Color.RED){clockBackground.setFill(Color.RED);
            adaptLightColors(Color.RED);
            }
                   
            else {clockBackground.setFill(Color.ORANGE);
            adaptLightColors(Color.ORANGE);}
        
        });
        
    }
    
    void adaptLightColors(Paint newColor)
    {
        Platform.runLater(() -> 
        {
           if (alarm1Light.getFill() != Color.GREEN){alarm1Light.setFill(newColor);}
           if (alarm2Light.getFill() != Color.GREEN){alarm2Light.setFill(newColor);}
           if (radioPowerLight.getFill() != Color.GREEN){radioPowerLight.setFill(newColor);}
          
        });
    }
    
    void refreshLights()
    {
         Platform.runLater(() -> 
        {
           
        if (sys.getRadioState()){radioPowerLight.setFill(Color.GREEN);}
        else {radioPowerLight.setFill(Color.BLACK);}
        
        if (sys.getAlarmState(0)){alarm1Light.setFill(Color.GREEN);}
        else {alarm1Light.setFill(Color.BLACK);}
        
        if (sys.getAlarmState(1)){alarm2Light.setFill(Color.GREEN);}
        else {alarm2Light.setFill(Color.BLACK);}
    });
          
    }
}