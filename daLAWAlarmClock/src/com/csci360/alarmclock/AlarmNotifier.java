/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import java.util.Observer;

/**
 *
 * @author Liam
 */
public class AlarmNotifier implements Observer 
{
    private AlarmClock system;
    
    public AlarmNotifier(AlarmClock watched)
    {
        system = watched;
    }
    
    public void update()
    {
        system.
    }
    
}
