# android-monkey-test-with-login
Explore and demonstrate how to login to an Android app before running Android Monkey

```
adb shell am start -n com.example.julianharty.logindemo/.LoginActivity
adb shell input text 'foo@example.com'
adb shell input keyevent 61
adb shell input text 'hello'
adb shell input keyevent 61
adb shell input keyevent 66
```
That was the easy bit. Starting adb monkey restarts the default Activity which means the login was fruitless. 
```
adb shell monkey -p com.example.julianharty.loginDemo -v 10000 -s 100
```
