# Operation Contracts 

## Operation 1: setAlarmMode

**Operation:** setAlarmMode()

**Cross References:** Use Cases: Using Alarm

**PreConditions:** 
	
	* The system is in a neutral or "radio" state

**PostConditions:**
	
	* "Set alarm" state was enabled

## Operation 2: specifyAlarm

**Operation:** specifyAlarm (al: enum)

**Cross References:** Use Cases: Using Alarm

**PreConditions:**
	
	* System is in "set alarm" state

**PostConditions:**
	
	* The alarm to be set (alarm 1 or alarm 2) was specified
	


## Operation 3: specifyTime

**Operation:** specifyTime(hour: int, minute: int)

**Cross References:** Use Cases: Using Alarm, Setting Time

**PreConditions:**
	
	* System is in "set alarm" or "set clock" state

**PostConditions:**
	
	* The time has been set for the proper state (alarm or system time)
	* The system has exited "set clock" state if applicable.


## Operation 4: specifySound

**Operation:** specifySound( opt: enum)

**Cross References:**  Use Cases: Using Alarm

**PreConditions:**
	
	* The system is in "set alarm" state

**PostConditions:**
	
	* The sound for the alarm (radio or sound) has been specified
	* The system exited "set alarm" state and enabled the alarm


## Operation 5: disableAlarm

**Operation:** disableAlarm()

**Cross References:** Use Cases: Using Alarm   

**PreConditions:**
	
	* The alarm is going off

**PostConditions:**
	
	* The alarm has stopped going off
	* Ther alarm has been disabled (will not go off again until re-enabled)


## Operation 6: startRadio

**Operation:** startRadio()

**Cross References:** Use Cases: Listening to radio

**PreConditions:**
	
	* The system is in a neutral state

**PostConditions:**
	
	* The system has entered "radio" state


## Operation 7: changeRadioBand

**Operation:** changeRadioBand()

**Cross References:** Use Cases: Listening to Radio

**PreConditions:**
	
	* N/A

**PostConditions:**
	
	* The radio band has been changed (toggle between AM and FM)


## Operation 8: adjVolume

**Operation:** adjVolume (direction :int)

**Cross References:** Use Cases: Listening to Radio

**PreConditions:**
	
	* The system is in "radio" state

**PostConditions:**
	
	* The volume was adjusted


## Operation 9: adjStation

**Operation:** adjStation (freq: float)

**Cross References:**  Use Cases: Listening to Radio

**PreConditions:** 
	
	* N/A

**PostConditions:**
	
	* The frequency of the radio has been adjusted


## Operation 10: enableClocksetMode

**Operation:** enableClocksetMode()

**Cross References:** Use Cases: Setting Time

**PreConditions:**
	
	* The system is in a neutral or "radio" state

**PostConditions:**
	
	* The system has entered "set clock" state


