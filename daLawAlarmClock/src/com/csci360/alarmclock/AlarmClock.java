/*
This is a controller for the rest of the application. 
 */
package com.csci360.alarmclock;



import java.util.Timer; 
import java.util.TimerTask;

 

public class AlarmClock {
    
   private final int minLng = 10;
   private  Timer runner;
   
   private  Time sysTime;
   
   private  Alarm alarm1;
   private  Alarm alarm2;
   
   private  Radio radio;
   private  int seconds = 0;
   
   private Alarm[] alarmArry;
   private boolean is1Alarming;
   private boolean is2Alarming;
   
   
   //Initialize alarms, start the timer running system clock. 
   //Create a radio and
   public AlarmClock()
   {

        runner = new Timer();
        sysTime = new Time(4,20);
        
        alarm1 = new Alarm();
        alarm2 = new Alarm();
        
        alarmArry = new Alarm[2];
        
        alarmArry[0] = alarm1;
        alarmArry[1] = alarm2;
        
        radio = new Radio();
        
        
        runner.scheduleAtFixedRate(new TimerTask() 
        {
            public void run() 
            {
                seconds++; 	//1 second = 1000 elapsed ms
                
                //Printing time
                int[] curTime = sysTime.getTime();
                
                if (seconds == minLng) 
                { 
                    runTime();
                    seconds = 0;    
                }
            }
        },0, 1000);  //period b/w incrementations = 1000 ms
   }
   
       public void toggleRadioPower()
    {
        radio.togglePower();
    }
       
       public void adjustRadioFreq(int direction)
       {
           radio.adjustFrequency(direction);
       }
       
       public void toggleRadioBand()
       {
           radio.toggleBand();
       }
       
       public String getRadioBand()
       {
           return radio.getBand();
       }
       
   
   public void setAlarm(int alm , int hr, int mn, boolean snd)
   {     
       alarmArry[alm].specifyTime(hr,mn);
       alarmArry[alm].specifySound(snd);
       alarmArry[alm].enableAlarm();
   }
   
   public void setClock(int h, int m)
   {
       sysTime.setHour(h);
       sysTime.setMinute(m);
   }
   
   public void enableAlarm(int alm)
   {
       alarmArry[alm].enableAlarm();
   }
   
   public void disableAlarm(int alm)
   {
       alarmArry[alm].disableAlarm();
   }
   
   public boolean getAlarmState(int alarm)
   {
       return alarmArry[alarm].getStatus();
       //small change
   }
   
   public int[] getTimeArray()
   {
       return sysTime.getTime();
   }
   
   private void runTime()
   {
       int[] ctime = sysTime.getTime();
       
       int newMin = ctime[1] + 1;
       int newHr = ctime[0];
       
       if (newMin == 60)
       {
           newMin = 0;
           newHr += 1;
           
           if (newHr == 24)
           {
               newHr = 0;
           }
           
       }
       
       sysTime.setHour(newHr);
       sysTime.setMinute(newMin);
       this.checkAlarm();
   } 
   
   public String getRadioFreq(){return Float.toString(radio.getFrequency());}
   
   private boolean compareTime(Time t1, Time t2)
   {
       if (t1.getHour() == t2.getHour())
       {
           if (t1.getMinute() == t2.getMinute())
           {
               return true;
           }
           else return false;   
       }
       else return false;
       
   }
   
   private void monitorAlarm()
   {
       if (alarmArry[0].getStatus())
       {
           Time trigTime = alarmArry[0].getTriggerTime();
           
           
           if (compareTime(trigTime,sysTime))
           {
               is1Alarming = true;
               this.triggerAlarm(alarmArry[0]);
           }
       }
       
       if (alarmArry[1].getStatus())
       {
           Time trigTime = alarmArry[1].getTriggerTime();
           
           if (compareTime(trigTime,sysTime))
           {
               is2Alarming = true;
               this.triggerAlarm(alarmArry[1]);
           }
       }
       
       
   }
   
      public boolean checkAlarm()
   {
       boolean result = false;
       if (alarmArry[0].getStatus())
       {
           Time trigTime = alarmArry[0].getTriggerTime();
           
           
           if (compareTime(trigTime,sysTime))
           {
               is1Alarming = true;
               result = true;
           }
       }
       
       if (alarmArry[1].getStatus())
       {
           Time trigTime = alarmArry[1].getTriggerTime();
           
           if (compareTime(trigTime,sysTime))
           {
               is2Alarming = true;
               result = true;
           }
       }
       
       return result;
   }
   
   
   private void triggerAlarm(Alarm a)
   {

      if (a.getSoundType())
      {
          System.out.println("BEEP BEEP BEEP BEEP");
            //Play built in sound, or equivalent alarm
      }
      else
      {
        System.out.println("INSERTBAD MUSIC HERE");
        //Use the radio for the alarm going off.          
      }
   }
   
   //Can only work if the alarm is currently going off. This is intended
   //for a graphical UI with buttons. Text interface is a bit....different. For now.
   //Will be re-enabled once sound streaming is working. 
   
   public void stopAlarm(int alm)
   {
       if ((alm == 0) && is1Alarming)
       {
           is1Alarming = false;
           alarmArry[alm].disableAlarm();
       }
       
       if ((alm == 1) && is2Alarming)
       {
           is2Alarming = false;
           alarmArry[alm].disableAlarm();
       }
   }
   
   
   public void stopAlarm()
   {
       if (is1Alarming)
       {
           is1Alarming = false;
           alarmArry[0].disableAlarm();
       }
       
       else if (is2Alarming)
       {
           is2Alarming = false;
           alarmArry[1].disableAlarm();
       }
   }
   
   public void snoozeAlarm()
   {
       //not gonna differentiate
       if (is1Alarming)
       {
           is1Alarming = false;
           //0
           alarmArry[0].snooze();
       }
       else
       //for now I'm going to have to change this
       if (is2Alarming)
       {
           is2Alarming = false;
           //1
           alarmArry[1].snooze();
       }
   }
   
   public String getCurrentTime()
   {
    return formatTime(sysTime);
  }
   
   public boolean checkIfAlarming()
   {
       return (is1Alarming || is2Alarming);
   }
   
   public String getAlarmInfo(int alm)
   {
       String almTime = formatTime(alarmArry[alm].getTriggerTime());
       
       String alabel;
       if (alm == 0){alabel = "Alarm 1: ";}
       else {alabel = "Alarm 2: ";}
       
       String almste;
       if (alarmArry[alm].getStatus()){almste = " | Enabled";}
       else {almste = " | Disabled";}
       
       String snd;
       if (alarmArry[alm].getSoundType()){snd = " | Beep";}
       else {snd = " | Radio";}
       
       return alabel + almTime + snd + almste;
   }
   
   public int[] getAlarmTimeArray(int alm)
   {
       Alarm selAm = alarmArry[alm];
       Time selTm = selAm.getTriggerTime();
       
       return selTm.getTime();
   }
   
   public String getAlarmTime(int alm)
   {
       Alarm selAm = alarmArry[alm];
       Time alTm = selAm.getTriggerTime();
       return formatTime(alTm);   
   }
   
   
   public String formatTime(Time t)
   {
    int [] timeArry = t.getTime();
    int fh = formatHour(timeArry[0]);
    int fm = timeArry[1];
    String meridan;

    if (timeArry[0] < 12) {
      meridan = " AM";
    } else {
      meridan = " PM";
    }
    
    String timeString;
    
    if (fm < 10){timeString = Integer.toString(fh) + ":0" + Integer.toString(fm) + meridan;}
    else{timeString = Integer.toString(fh) + ":" + Integer.toString(fm) + meridan;}
    
    return timeString;   
   }
   
  private int formatHour(int rawhr)
  {
    int formatted;
    if (rawhr == 0)
    {
      formatted = 12;
    }
    else
    {

      if (rawhr > 12) {
        formatted = rawhr % 12;
      } else {
        formatted = rawhr;
      }
    }
    return formatted;
  }
}


