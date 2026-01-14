# Klick'r - Smart AutoClicker

## Overview
Klick'r is an open-source Android application designed to automate repetitive tasks. It offers image detection capabilities alongside traditional auto-clicking functionalities. Formerly known as Smart AutoClicker.

**Project Type:** Native Android Application (Kotlin)
**Build System:** Gradle 8.13 with Kotlin DSL
**Minimum JDK:** Java 21

## Important Note
This is a native Android mobile application that requires the Android SDK to build APK files. The Android SDK is not available in the Replit environment, so building the final APK must be done on a local machine with Android Studio.

## Project Structure
```
├── smartautoclicker/       # Main application module
├── core/                   # Core library modules
│   ├── common/            # Common utilities (actions, android, base, bitmaps, display, overlays, permissions, quality, settings, ui)
│   ├── dumb/              # Dumb/simple clicker functionality
│   └── smart/             # Smart clicker functionality (database, debugging, detection, domain, processing)
├── feature/               # Feature modules
│   ├── backup/            # Backup/restore functionality
│   ├── dumb-config/       # Configuration for dumb mode
│   ├── notifications/     # Notification handling
│   ├── quick-settings-tile/ # Quick settings integration
│   ├── revenue/           # Revenue/monetization
│   ├── review/            # App review prompts
│   ├── smart-config/      # Configuration for smart mode
│   ├── smart-debugging/   # Debugging tools
│   └── tutorial/          # Interactive tutorials
├── build-logic/           # Custom Gradle build plugins
├── gradle/                # Gradle wrapper files
└── documentation/         # Project documentation
```

## Building the App

### On Local Machine (Required for APK)
1. Clone the repository to a local machine
2. Install Android Studio with Android SDK
3. Open the project in Android Studio
4. Run: `./gradlew assembleDebug` or use Android Studio's build menu

### In Replit
The project cannot be fully built in Replit due to missing Android SDK. However:
- Java 21 is installed and available
- Gradle wrapper is functional
- Code browsing and editing works normally

## Key Features
- Click and Swipe automation with precision
- Image detection for sophisticated automation
- Advanced features: counters, Android Intents, flow control
- Triggers: image detection, timers, counters, broadcast receivers
- Regular Mode for simple auto-clicking
- Interactive tutorials

## License
GNU General Public License v3.0
