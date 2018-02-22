# Objects of the daLAWAlarmClock

## System (Class)

### Attributes
> Systime: Time

> Alarm1: Alarm

> Alarm2: Alarm

> Radio: Radio  

### Functions
> compareTime(t1: Time, t2: Time)

> showTime()

> enableAlarmSet(alarm: int)

> enableAlarm(alarm: int)

> disableAlarm(alarm: int)

---------------------
## Alarm (Class)

### Attributes
> triggerTime: Time

> snoozeTime: Time

> soundType: boolean (or enum)

> isSnoozed: boolean

> isEnabled: boolean

### Functions
> triggerAlarm()

> getStatus()

> enableAlarm()

> disableAlarm()

> quietAlarm()

> snooze()

> specifyTime(time: Time)

> specifySoundType(sound: boolean)

> getTriggerTime()

---------------
## Radio (Class)

### Attributes

> frequency: float

> volume : int


### Functions
> getFrequency()

> adjustStation(dir: int)

> adjustVolume(dir: int)

----------------
## Time (Class)

### Attributes

> hour: int

> minute: int

> dynamic: boolean

### Functions

> getHour()

> getMinute()

> setHour(h: int)

> setMinute(m: int)

> getTime()
