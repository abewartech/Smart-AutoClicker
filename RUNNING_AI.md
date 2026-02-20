# Running Smart-AutoClicker (Klick'r) - AI Agent Guide

This document is intended for AI Agents to quickly understand how to build and run this Android project.

## 🛠 Prerequisites

- **JDK**: Version 21 is required.
    - Path on this machine: `C:\Program Files\Android\Android Studio\jbr`
- **Android SDK**: `ANDROID_HOME` should point to your SDK location.
    - Path on this machine: `C:\Users\rahma\AppData\Local\Android\Sdk`
- **ADB**: Located at `$ANDROID_HOME\platform-tools\adb.exe`

## ⚙️ Configuration

The project is sensitive to the `org.gradle.java.home` property in `gradle.properties`. 

**Critical Step**: Ensure `gradle.properties` has the following line (using escaped backslashes for Windows):
```properties
org.gradle.java.home=C:\\Program Files\\Android\\Android Studio\\jbr
```

## 🚀 Build Commands

Run these from the project root:

| Task | Command |
| :--- | :--- |
| **Check Config** | `.\gradlew.bat help` |
| **Build APK** | `.\gradlew.bat assembleFDroidDebug` |
| **Install** | `.\gradlew.bat installFDroidDebug` |
| **Clean** | `.\gradlew.bat clean` |

## 📱 Launching

After installing, launch the app using ADB:

```powershell
$adb = "C:\Users\rahma\AppData\Local\Android\Sdk\platform-tools\adb.exe"
& $adb shell am start -n com.buzbuz.smartautoclicker.debug/com.buzbuz.smartautoclicker.scenarios.ScenarioActivity
```

## 🔍 Investigation Tips

- If the build fail with exit code 1, check the output for task failures. Common issues involve missing dependencies or invalid JDK paths.
- Variants available: `fDroid`, `playStore`.
- Build types: `debug`, `release`.
- Default debug variant for local dev is often `fDroidDebug`.
