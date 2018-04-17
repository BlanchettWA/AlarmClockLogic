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
import java.text.DecimalFormat;

import java.io.File;
import java.util.Random;
import javafx.scene.media.Media;  
import javafx.scene.media.MediaPlayer; 



public class Radio 
{
    private double volume;
    private float fmFreq;
    private int amFreq;
    private boolean amBand;
    private boolean isPlaying;
    
    private Random gen;
    boolean audioCreated = false;
    
    private MediaPlayer audio;
    
    private Media[] songList = new Media[8];
 
    public Radio()
    {
        volume = .50;
        amBand = false;
        fmFreq = (float) 94.5;
        amFreq = 750;
        isPlaying = false;
        
        gen = new Random();
        
        songList[0] = new Media(new File("media/am1.mp3").toURI().toString());
        songList[1] = new Media(new File("media/am2.mp3").toURI().toString());
        songList[2] = new Media(new File("media/am3.mp3").toURI().toString());
        songList[3] = new Media(new File("media/am4.mp3").toURI().toString());
        songList[4] = new Media(new File("media/fm1.mp3").toURI().toString());
        songList[5] = new Media(new File("media/fm2.mp3").toURI().toString());
        songList[6] = new Media(new File("media/fm3.mp3").toURI().toString());
        songList[7] = new Media(new File("media/fm4.mp3").toURI().toString());
        
        
    };
    
    public void adjustVolume(int dir)
    {
        if (dir < 0)
        {
            volume -= .05;
            
            if (volume < 0){volume = 0;}
            
        }
        else
        {
            volume += .05;
            
            if (volume > 1.0){volume = 1.0;}
        }
        audio.setVolume(volume);
    };
    
    
    public int getVolume()
    {
        return (int)(volume * 10);
    }
            
    public void toggleBand()
    {
        if (amBand){amBand = false;}
        else {amBand = true;}
        playMedia();   
    }
    
    public String getBand()
    {
        if (amBand){return "AM";}
        else {return "FM";}
    }
    
    public void adjustFrequency(int dir)
    {
        playMedia();
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
            return roundTwoDecimals((float) amFreq);
        }
        else
        {
            return roundTwoDecimals(fmFreq);
        }
    }
    
    public void startRadio()
    {
        isPlaying = true;
        playMedia();
    }
    
    public void stopRadio()
    {
        isPlaying = false;
        
        audio.stop();
    };
    
    public void togglePower()
    {
        if (isPlaying){stopRadio();}
        else {startRadio();}
    }
    
    public boolean getRadioState()
    {
        return isPlaying;
    }
    
    public void triggerRadioAlarm()
    {
        volume = 1.0;
        startRadio();        
    }
    
    private void playMedia()
    {

        int song = gen.nextInt(8);
        
                if ((amBand) && (song > 3))
                {
                    song = gen.nextInt(4);
                }
                
                if ((!amBand) && (song < 4))
                {
                    while (song < 4)
                    {
                        song = gen.nextInt(8);
                    }
                }
                
                if (audioCreated)
                {
                    audio.stop();
                    audio.dispose();
                }
            
            audio = new MediaPlayer(songList[song]);
            audioCreated = true;
            
            
            audio.setVolume(volume);
                        
            audio.setOnEndOfMedia(new Runnable() {public void run() {playMedia();}});   
            audio.play();
    }
    
    
    //Code borrowed from https://www.quora.com/How-do-I-truncate-float-up-to-two-decimal-points-in-Java 
    //For rounding the frequency decimals
    
    float roundTwoDecimals(float d)
 {
    DecimalFormat twoDForm = new DecimalFormat("#.##");
 
    return Float.valueOf(twoDForm.format(d)); 
}
}
