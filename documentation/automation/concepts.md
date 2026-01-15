# Automation Concepts

Automation in Klick'r is built around the concept of **Events**. An Event is a rule that says: "When **THIS** happens, do **THAT**."

## The Event Structure

```
IF (Trigger Conditions Met)
THEN (Execute Actions)
```

### Components

1.  **Conditions**: Checks that must be true for the event to fire.
    -   *Example*: "Image 'Accept' is visible on screen."
    -   *Example*: "Counter 'Attempts' is less than 3."

2.  **Actions**: The physical or logical operations performed.
    -   *Physical*: Click, Swipe.
    -   *Logical*: Wait, Change Counter, Stop Automation.

3.  **Priority**: If multiple events are triggered at the same time, the one with the higher priority executes first.

## Global vs. Local Configuration
-   **Global Settings**: Apply to the entire automation session (e.g., polling rate, screen capture quality).
-   **Event Settings**: Specific to one rule.

## The Automation Lifecycle
1.  **Start**: User taps the Play button.
2.  **Scan**: The app takes a screenshot.
3.  **Think**: The app checks all your conditions against the screenshot.
4.  **Act**: The app performs actions for matching events.
5.  **Repeat**: The cycle continues until the user stops it or a "Stop" action is executed.
