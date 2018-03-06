/*
A fill in for the UI that will run the clock through command line. 
 */
package com.csci360.alarmclock;

import java.util.Scanner;

public class CommandLineUI {
    
    
    public static void main(String[] args) 
    {
        String helpMsg = "Use numbers to navigate the clock: "
                + "\n 0 for current time "
                + "\n 1 for help (this message) "
                + "\n 666 for quit "
                + "\n ";
        
        boolean run = true;
        Scanner keyboard = new Scanner(System.in);
    
        AlarmClock sys = new AlarmClock();
        
    System.out.println(helpMsg);
    while (run == true)
    {
      int inp = keyboard.nextInt();
      switch (inp)
      {
      case 0: 
        String cT = sys.currentTime();
        System.out.println("The current time is " + cT);
        System.out.println();
        break;
      case 1: 
        System.out.println(helpMsg);
        break;
      case 666: 
        run = false;
        System.exit(0);
      }
    }
    }
        
    }
