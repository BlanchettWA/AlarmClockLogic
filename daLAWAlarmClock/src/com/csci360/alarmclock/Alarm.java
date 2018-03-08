
package com.csci360.alarmclock;


public class Alarm {
    
    private Time triggerTime;
    private Time snoozeTime;
    
    //If true, then use a built in sound and not the radio
    private boolean beepSound = true;
    
    private boolean enableState = false;
    
    private boolean snoozeState = false;
    
    public Alarm()
    {
        triggerTime = new Time(5,23);
        snoozeTime = new Time(5,28);   
    }
    
    public void specifyTime(int h, int m)
    {
        triggerTime.setHour(h);
        triggerTime.setMinute(m);
    }
    
    public void specifySound(boolean snd)
    {
        beepSound = snd;
    }
    
    public boolean getSoundType(){return beepSound;}
    
    public void enableAlarm()
    {enableState = true;
    snoozeState = false;}
    
    public void disableAlarm()
    {enableState = false;
    snoozeState = false;}
    
    public Time getTriggerTime()
    {
        if (snoozeState) { return snoozeTime; }
        else { return triggerTime; }
    }
    
    public boolean getStatus()
    {
        return enableState;
    }
   
    public void snooze()
    {
        //Add five minutes to triggerTime and copy it into SnoozeTime
        //Check if the alarm was previously snoozed. IF yes, then pull the time from snoozeTime
        //leave the alarm enabled. 
        
        //Make sure snoozeTime is set
        
        if (!snoozeState)
        {
            snoozeTime.setHour(triggerTime.getHour());
            snoozeTime.setMinute(triggerTime.getMinute());
        }
        
        if (snoozeTime.getMinute() >= 55){
            snoozeTime.setMinute(60 - (snoozeTime.getMinute() + 5));//handles near hour change
            
            snoozeTime.setHour(snoozeTime.getHour() + 1);
            if (snoozeTime.getHour() > 23){snoozeTime.setHour(0);}
        }
        else {
            snoozeTime.setMinute(snoozeTime.getMinute() + 5);
            
        }
        enableState = true;
        snoozeState = true;
                
    }
    
}

