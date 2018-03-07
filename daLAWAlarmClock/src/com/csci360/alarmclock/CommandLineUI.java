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
                + "\n 2 for setting the system clock"
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
      case 0:{ 
        String cT = sys.currentTime();
        System.out.println("The current time is " + cT);
        System.out.println();
        break;}
      
      case 1:{ 
        System.out.println(helpMsg);
        break;}
      
      case 2: 
      {
          
          int inHr = 0;
          int inMr = 0;
          int inMn = 0;
          
          boolean validHr = false;
          boolean validMn = false;
          boolean validMr = false;
          
          while (!validHr)
          {
            System.out.print("Enter the current hour of the system clock:");
            inHr = keyboard.nextInt();
          
             if ((inHr > 0) && (inHr < 13))
            {
              validHr = true;
            }
             else {System.out.println("Please enter a valid hour.");}          
          }
          
          while (!validMn)
          {
              System.out.print("Enter the current minute of the system clock:");
              inMn = keyboard.nextInt();
              
              if ((inMn > -1) && (inMn < 60))
              {
                  validMn = true;
              }
              else {System.out.println("Please enter a valid minute.");}
          }
          
          while (!validMr)
          {
              System.out.print("0 for AM and 1 for PM:");
              inMr = keyboard.nextInt();
              
              if (inMr == 0)
              {
                  if (inHr == 12)
                  {
                      inHr = 0;
                  }
                  
                  validMr = true;
              }
              
              else if (inMr == 1)
              {
                  if (!(inHr == 12))
                  {
                      inHr += 12;
                  }
                  validMr = true;
              }
              else {System.out.println("Please enter a valid value");}
          }
          sys.clockSet(inHr, inMn);
          System.out.println("The time has been set.");
          System.out.println();
          break;
      }
      
      case 666:
      {
        run = false;
        System.exit(0);
      }
     }
    }
    }
        
    }
