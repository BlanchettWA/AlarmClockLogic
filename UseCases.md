# Use Cases

We have three use cases in total:
* UC1: Using Alarms
* UC2: Listening to Radio
* UC3: Setting Clock Time

## Use Case 1: Using Alarms
**Scope**:
  *Develop software to control a dual alarm AM/FM Radio Alarm Clock*
  
**Level**:
  *User Goal*

**Actors**:
  *User(s)*

**Stakeholders**:
  *User(s) - wants to set an alarm to go off at a desired time*

**Pre-Conditions**:
  *The clock time is correctly set*

**Success Guarantee**:
  *The alarm goes off at the specified time*

**Main Conditional**:
  1. The user specifies if setting alarm 1 or 2.
  2. The User Specifies a time for the alarm to sound.
  3. The user sets whether the alarm or radio will sound.
  4. The alarm or radio sounds at the time. 
  5. The user switches the alarm off.

**Extensions**:
 
  2A. Alarm time is already set for correct time
    
    1. Skip this step and continue with the main scenario 
   
  3A. Correct sounding method is already specified
    
    1. Skip this step and continue with the main scenario

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

**Special Requirements**
  * Speaker
  * User Interface
  * Clock uses standard time

**Technical Data**
  * User sets whether they want to hear the default alarm sound or the radio when the alarm goes off. If the radio is set to sound, the alarm plays the station the radio is currently set to

**Frequency of Occurence** 
  User-Triggered, could happen every day

**Miscellaneous Open Issues**
  * If the power goes out or the alarm is unplugged
  * If a time change occurs


## Use Case 2: Listening to Radio
**Scope**:
  *Develop software to control a dual alarm AM/FM radio alarm clock*

**Level**:
  *User Goal*

**Actors**:
  *User(s), Radio Station*

**Stakeholders**:
  *User - Wants to listen to the radio*
  *Radio Stations - Needs listeners*

**Pre-Conditions**:
  *Radio can recieve transmissions and respond to software*

**Success Guarantee**:
  *The station is playing and user controlled*

**Main Conditional**:
  1. The user turns the radio on
  2. The user specifies AM/FM Mode
  3. The Radio Station is played

**Extensions**:

  1A. The radio plays the last station played

  3A. The user adjusts the station
  
  3B. The user adjusts the volume
  
  3C. The user switches between AM/FM mode



**Special Requirements**:
  * User interface
  * Speaker
  * Radio maximum volume is lower than the alarm volume of the radio

**Frequency of Occurrence**:
  *User triggered, could be continuous*

**Miscellaneous Open Issues**
  * If there are no available stations
  
  
## Use Case 3: Setting Clock Time
**Scope:**
*Develop software to control a dual alarm AM/FM radio alarm clock*

**Level:**
*User Goal*

**Actors:**
*User*

**Stakeholders:**
*User - wants to set the clock time*

**Pre-Conditions:**
*There is already some time set*

**Success Guarantee**
*The clock time is changed*

**Main Conditional:**
 1. The user sets the clock to time setting mode
 2. The user sets the hours
 3. The user sets the minutes
 4. The user exits time setting mode. 
 
 **Extensions** 
 *None*
 
 **Special Requirements**
  * User Interface
  * User has hands
  * User is not blind
  
**Frequency of Occurrence**
 * User Triggered

**Open Issues**
*None*
  



