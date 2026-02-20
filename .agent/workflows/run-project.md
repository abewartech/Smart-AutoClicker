---
description: How to build and run the Smart-AutoClicker (Klick'r) project
---

This project is a native Android application developed using Kotlin and Gradle.

### Prerequisites

1.  **Java Development Kit (JDK) 21**:
    -   Recommended: Use the JBR (JetBrains Runtime) included with Android Studio.
    -   Path on this system: `C:\Program Files\Android\Android Studio\jbr`
2.  **Android SDK**:
    -   Must be installed and `ANDROID_HOME` environment variable should be set.
    -   Default path: `C:\Users\rahma\AppData\Local\Android\Sdk`
3.  **ADB (Android Debug Bridge)**:
    -   Found in `$ANDROID_HOME\platform-tools\adb.exe`.
4.  **Connected Device/Emulator**:
    -   Verify with `adb devices`.

### Configuration

The project uses `org.gradle.java.home` in `gradle.properties` to locate the JDK. Ensure this path is correct for your environment.

Example in `gradle.properties`:
```properties
org.gradle.java.home=C:\\Program Files\\Android\\Android Studio\\jbr
```

### Build and Run Steps

1.  **Clean and Prepare**:
    ```powershell
    .\gradlew.bat clean
    ```

2.  **Build and Install to Device**:
    // turbo
    ```powershell
    .\gradlew.bat installFDroidDebug
    ```
    *Note: `FDroidDebug` is a common variant. You can also use `installDebug` if the flavor is not specified.*

3.  **Launch the App**:
    You can launch the main activity using ADB after installation:
    ```powershell
    $adb = "C:\Users\rahma\AppData\Local\Android\Sdk\platform-tools\adb.exe"
    & $adb shell am start -n com.buzbuz.smartautoclicker.debug/com.buzbuz.smartautoclicker.scenarios.ScenarioActivity
    ```
    *(Note: The package name might have a `.debug` suffix depending on the build variant).*

### Troubleshooting

-   **Invalid Java Home**: If Gradle complains about the Java home, verify the path in `gradle.properties` exists and points to a JDK (not just a JRE).
-   **Daemon Issues**: If the build hangs, try running with `--no-daemon`.
-   **Signing Errors**: The project uses custom signing configs. Ensure `gradle.properties` doesn't have required parameters missing if you're building a release version.
