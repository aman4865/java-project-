# Java Design Patterns (Lab Project)

This project contains 4 programs, each in its own folder (package). Every file has numbered comments explaining why it exists.

| # | Folder | Pattern | Files | Run |
|---|--------|---------|-------|-----|
| 1 | `adapter` | Adapter | 6 | `java adapter.Main` |
| 2 | `Bridge` | Bridge | 6 | `java Bridge.Main` |
| 3 | `Singleton` | Singleton | 2 | `java Singleton.Main` |
| 4 | `Singleton/threadexample` | Singleton race condition | 2 | `java Singleton.threadexample.Stage4RaceDemo` |

## What each pattern does

- **Adapter:** PayPal and PhonePe have different method names, but both are used through one common `pay()` method.
- **Bridge:** Remotes (`Remote`, `AdvancedRemote`) are kept separate from devices (`TV`, `Radio`), so each can grow independently.
- **Singleton:** Only one object of the class is created, using double-checked locking and `volatile`.
- **Singleton race condition:** An unsafe Singleton without a lock, showing that two threads can create two objects.

## How to run (from the project root)

```
javac adapter/*.java
java adapter.Main

javac Bridge/*.java
java Bridge.Main

javac Singleton/*.java
java Singleton.Main

javac Singleton/threadexample/*.java
java Singleton.threadexample.Stage4RaceDemo
```

## Expected output

Adapter:
```
PayPal payment completed: 100
PhonePe payment completed for CLIENT123: 200
```

Bridge:
```
TV turned ON
TV volume set to 20
TV turned OFF
Radio turned ON
Radio turned OFF
```

Singleton:
```
Object created
true
```

Thread example (usually):
```
Objects created: 2
Same object? false
```
