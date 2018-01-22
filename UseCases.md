# Use Cases

We have three use cases in total:
*UC1: Using Alarms
*UC2: Listening to Radio
*UC3: Setting Clock Time

Two of them are "fully dressed" below:

## Use Case 1: Using Alarms
### Scope:
  *Develop software to control a dual alarm AM/FM Radio Alarm Clock*
  
### Level:
  *User Goal*

### Actors:
  *User(s)*

**Stakeholders**:
  *User(s) - wants to set an alarm to go off at a desired time*

**Pre-Conditions**:
  *The clock time is correctly set*

**Success Guarantee**
  *The alarm goes off at the specified time*

**Main Conditional**
  1. The user specifies if setting alarm 1 or 2.
  2. The User Specifies a time for the alarm to sound.
  3. The user sets whether the alarm or radio will sound.
  4. The alarm or radio sounds at the time. 
  5. The user switches the alarm off.

**Extensions**

  4A. Both alarms are set for the same time
      
      1. The clock sounds an alarm only once
      
  5A. User does not turn off alarm
    
    1. Alarm sounds for 5 minutes
    2. After the first five minutes, alarm automatically snoozes for 5 minutes. 
    3. After 5 minute snooze, alarm goes off again
  
  5B. User activates snooze
    
    1. The alarm turns off.
    2. 5 minutes later, the alarm sounds again. 
    3. Return to Main Conditional Step 4 (Alarm or Radio sounds at the time)
    
