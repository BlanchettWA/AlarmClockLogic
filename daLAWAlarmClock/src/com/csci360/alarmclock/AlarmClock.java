/*
Beginning clas file for Alarm Clock. 

This is a controller for the rest of the application
 */
package com.csci360.alarmclock;

import java.util.Date; 
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
   
   public void AlarmClock()
   {
       System.out.println("Created");
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
                System.out.println(curTime[0] + ":" + curTime[1] + ":" + seconds);
                
                if (seconds == minLng) 
                {
                    
                    runTime();
                    seconds = 0;    
                }
            }
        },0, 1000);  //period b/w incrementations = 1000 ms
   }
       
   
   public void enableAlarmSet(int alm)
   {
       
   }
   
   public void specifyTime(int hr, int mn){}
   
   public void specifySound(boolean snd){}
   
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
   } 
   
   
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
   
   public void stopAlarm(int alm){}
   
   public void snoozeAlarm(int alm){}
   
   
}


