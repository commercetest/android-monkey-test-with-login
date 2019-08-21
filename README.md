# android-monkey-test-with-login
Explore and demonstrate how to login to an Android app before running Android Monkey

```
adb shell am start -n com.example.julianharty.logindemo/.LoginActivity &&
adb shell input text 'foo@example.com' &&
adb shell input keyevent 61 &&
adb shell input text 'hello' &&
adb shell input keyevent 61 &&
adb shell input keyevent 66 &&
adb shell monkey -p com.example.julianharty.logindemo -v --pct-majornav 0 --pct-nav 0  --pct-trackball 0 --pct-anyevent 0 --pct-syskeys 0 --pct-appswitch 0 --pct-touch 75 --pct-motion 25 10000
```
