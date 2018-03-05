/*
Beginning clas file for Alarm Clock. 

This is a controller for the rest of the application
 */
package com.csci360.alarmclock;

import java.util.Date; 
import java.util.Timer; 
import java.util.TimerTask;

 

public class AlarmClock {
   private Timer runner;
   
   private Time sysTime;
   
   private Alarm alarm1;
   private Alarm alarm2;
   
   private Radio radio;
   private static int seconds = 0;
    
   public static void main(String[] args) {
        
    Timer timer = new Timer();
    timer.scheduleAtFixedRate(new TimerTask() {
        public void run() {
            seconds++; 	//1 second = 1000 elapsed ms
            System.out.println(seconds);  //display time in seconds
            if (seconds == 20) {	  //example of stopping the timer at desired time
                timer.cancel();   //cancels the running timer, could be implemented for alarm use

            }
        }
    }, new Date(), 1000);  //period b/w incrementations = 1000 ms
        //new Date() is necessary for scheduleAtFixedRate Timer/TimerTask function
   }

}


