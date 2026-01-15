# Data Flow & Execution Pipeline

This document explains how an automation flow is executed from detection to action.

## The Execution Loop

When an automation flow is running, the **Processing Engine** (`:core:smart:processing`) enters a loop:

```mermaid
graph TD
    Start[Start Loop] --> Capture[Capture Screenshot]
    Capture --> Detection[Run Image Detection]
    Detection --> Evaluate[Evaluate Triggers]
    Evaluate -- Match Found --> Execute[Execute Actions]
    Evaluate -- No Match --> CheckFail[Check Failure Conditions]
    Execute --> UpdateStats[Update Counters/Variables]
    UpdateStats --> Sleep[Wait (Polling Interval)]
    CheckFail --> Sleep
    Sleep --> Start
```

## detailed Steps

### 1. Screen Capture
The `AccessibilityService` requests a screenshot of the current display. This bitmap is passed to the Detection engine.

### 2. Detection
The system iterates through all active **Conditions** (e.g., "Find Image 'OK Button'").
-   The screenshot is converted to an OpenCV matrix.
-   Template matching is performed for each configured image.
-   If the match confidence exceeds the user-defined threshold, the condition is marked as `TRUE`.

### 3. Evaluation
The engine checks the **Triggers**. A trigger fires if its conditions are met.
-   Example: `IF (Image A is Visible) AND (Counter < 5)`

### 4. Execution
If a trigger fires, its associated **Actions** are executed sequentially.
-   **Click Action**: The service dispatches a gesture to the specific X,Y coordinates (often relative to the detected image).
-   **Swipe Action**: A swipe gesture is injected.
-   **Wait Action**: The thread sleeps for the specified duration.

### 5. State Update
Counters are incremented/decremented. Variables are updated. The loop then pauses for the configured "Update Rate" before restarting.
