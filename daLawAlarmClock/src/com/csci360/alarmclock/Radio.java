/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

//FM 88.00 to 108.00
//AM 540 to 1700

//AM frequencies are ints
//Round all FM frequencies to one decimal point

public class Radio 
{
    private int volume;
    private float fmFreq;
    private int amFreq;
    private boolean amBand;
    private boolean isPlaying;
 
    public Radio()
    {
        volume = 5;
        amBand = false;
        fmFreq = (float) 94.5;
        amFreq = 750;
        isPlaying = false;
        
    };
    
    public void adjustVolume(int dir)
    {
        if (dir < 0)
        {
            volume -= 1;
            
            if (volume < 0){volume = 0;}
            
        }
        else
        {
            volume += 1;
            
            if (volume > 10){volume = 10;}
        }
    };
    
    
    public int getVolume()
    {
        return volume;
    }
            
    public void toggleBand()
    {
        if (amBand){amBand = false;}
        else {amBand = true;}
    };
    
    public String getBand()
    {
        if (amBand){return "AM";}
        else {return "FM";}
    }
    
    public void adjustFrequency(int dir)
    {
        //Adjusting AM Frequency
        if (amBand)
        {
            if (dir < 0)
            {
                amFreq -= 10;
                
                if (amFreq < 540){amFreq = 540;}
            }
            else
            {
                amFreq += 10;
                
                if (amFreq > 1600){amFreq = 1600;}
            }
            
            
        }
        
        //Adjusting FM Frequency
        else
        {
            if (dir < 0)
            {
                fmFreq -= 0.10;
                
                if (fmFreq < 88){fmFreq = 88;}
            }
            else
            {
                fmFreq += 0.10;
                
                if (fmFreq > 108){fmFreq = 108;}
            }
            
            
        }
    };
    
    public float getFrequency()
    {
        if (amBand)
        {
            return (float) amFreq;
        }
        else
        {
            return fmFreq;
        }
    }
    
    public void startRadio()
    {
        System.out.println("Radio is playing");
        
        //Code to begin playing Radio here
        isPlaying = true;
    };
    
    public void stopRadio()
    {
        System.out.println("Radio is turned off");
        isPlaying = false;
    };
    
    public void togglePower()
    {
        if (isPlaying){stopRadio();}
        else {startRadio();}
    }
}
