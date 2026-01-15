# Developer Setup

Welcome, contributor! Here is how to get Klick'r running on your machine.

## Prerequisites
-   Android Studio Koala or newer.
-   JDK 21.
-   Android SDK API 35+.

## Getting Started

1.  **Clone the Repo**:
    ```bash
    git clone https://github.com/your-repo/smart-autoclicker.git
    cd smart-autoclicker
    ```

2.  **Sync Gradle**:
    Open the project in Android Studio and let Gradle sync. This might take a while as it downloads dependencies (including the NDK for OpenCV).

3.  **Build**:
    Run the `app` configuration.

## Dependencies
-   **OpenCV**: Used for image processing. It is downloaded automatically via the `sourceDownload` plugin in `build-logic`.
-   **Hilt**: Used for dependency injection.
-   **Room**: Used for database storage.

## Troubleshooting
-   **NDK Errors**: Ensure you have the NDK version specified in `libs.versions.toml` installed in your SDK Manager.
