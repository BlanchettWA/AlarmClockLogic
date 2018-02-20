# Objects of the daLAWAlarmClock

## System (Class)

### Attributes
> Systime: Time
Alarm1: Alarm
Alarm2: Alarm
Radio: Radio

### Functions
> compareTime(t1: Time, t2: Time)
showTime()

---------------------
## Alarm (Class)

### Attributes
> triggerTime: Time
snoozeTime: Time
soundType: boolean (or enum)
isEnabled: boolean
isSnoozed: boolean

### Functions
> triggerAlarm()
quietAlarm()
snooze()
specifyTime(time: Time)
enableAlarm()
disableAlarm()
getTriggerTime()

---------------
## Radio (Class)

### Attributes

> frequency: float
volume : int


### Functions
> getFrequency()
adjustStation(dir: int)
adjustVolume(dir: int)

----------------
## Time (Class)

### Attributes

> hour: int
minute: int
dynamic: boolean

### Functions

> getHour()
getMinute()
setHour(h: int)
setMinute(m: int)
