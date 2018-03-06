/*
This is a class for the simulation of time. It stores in military time. 
It also returns military time. 
 */
package com.csci360.alarmclock;

public class Time {
    
    private int hour;
    private int minute; 
    
public Time(int h, int m)
{
    this.setHour(h);
    this.setMinute(m);
}

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

}
