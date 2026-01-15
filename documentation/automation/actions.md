# Actions

Actions are the "hands" of your automation. They determine *what* happens when a trigger fires.

## Interaction Actions
-   **Click**: Taps on the screen.
    -   *Coordinates*: Specific X,Y point.
    -   *On Detected*: Clicks exactly where the image was found (dynamic).
-   **Swipe**: Drags from point A to point B.
    -   *Duration*: How fast the swipe happens (fast = flick, slow = drag).

## Flow Control Actions
-   **Wait**: Pauses execution for a set time (e.g., to let a loading screen finish).
-   **Stop**: Ends the automation session completely.
-   **Toggle Group**: Enables or disables a group of other events. usage: "Switch to 'Battle Mode' logic."

## Variable Actions
-   **Set Counter**: Sets a counter to a specific value.
-   **Increment/Decrement Counter**: Adds or subtracts from a counter.
