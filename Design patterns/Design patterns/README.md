# Java Design Patterns

Lab project demonstrating three design patterns in Java.

| Package | Pattern | Description |
|---|---|---|
| `adapter` | Adapter | Adapts `PayPalService` and `PhonePeService` to a common `PaymentProcessor` interface |
| `Bridge` | Bridge | Separates remotes (`Remote`, `AdvancedRemote`) from devices (`TV`, `Radio`) |
| `Singleton` | Singleton | Thread-safe double-checked locking; `threadexample` shows a race in an unsafe version |

## Compile and run

From the project root:

```bash
mkdir out
javac -d out $(find . -name "*.java")

java -cp out adapter.Main
java -cp out Bridge.Main
java -cp out Singleton.Main
java -cp out Singleton.threadexample.Stage4RaceDemo
```

The race demo is non-deterministic: it usually prints `Objects created: 2` and `Same object? false`, showing why the unsafe lazy singleton is not thread-safe.
