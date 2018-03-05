/*
This is a class for the simulation of time. It stores in military time. 
It also returns military time. 
 */
package com.csci360.alarmclock;
import java.util.Date; 
import java.util.Timer; 
import java.util.TimerTask;

public class Time {
    
    private int hour;
    private int minute;
    private static int seconds = 0; 

public int getHour()
{
    return hour;
}

public int getMinute()
{
    return minute;
}

public void setHour(int h)
{
    hour = h;
    
}

public void setMinute(int m)
{
    minute = m;
}

public int[] getTime()
{
    int[] sTime = new int[2];
    sTime[0] = hour;
    sTime[1] = minute;
    
    return sTime;
}
    
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
