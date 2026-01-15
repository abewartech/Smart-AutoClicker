# Build Variants

The project uses build variants to handle different environments, primarily for OpenCV integration context (Play Store vs F-Droid).

## Flavors

1.  **playStore**:
    -   Contains Google Mobile Services (AdMob, Billing).
    -   Uses standard OpenCV integration.

2.  **fDroid**:
    -   **FOSS only**. No proprietary Google libraries.
    -   Removes AdMob and Billing Client.
    -   Optimized for F-Droid compliance.

## Building via Command Line

```bash
# Debug APK
./gradlew assembleDebug

# Release Bundle (Play Store)
./gradlew bundlePlayStoreRelease
```
