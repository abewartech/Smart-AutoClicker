# Triggers

Triggers are the "eyes" of your automation. They determine *when* an action should happen.

## Image Triggers
The most powerful type of trigger. It fires when a specific image is detected on the screen.
-   **Template Matching**: You crop a small part of the screen (e.g., a button, an icon) to use as a template.
-   **Search Area**: You can limit where Klick'r looks for this image to speed up detection and avoid false positives.
-   **Threshold**: A % score of how closely the screen must match the image.

## Counter Triggers
Fires based on the value of a variable (Counter).
-   *Usage*: "Run this action only 5 times."
-   *Setup*: Add a condition `Counter 'Runs' < 5`.

## Text Triggers (AI)
*Note: Requires AI Assistant module.*
Fires when specific text is read on the screen using OCR.
-   *Usage*: "Click when you see 'Game Over'."

## Timer Triggers
Fires after a certain amount of time has passed since the automation started or since the last execution.
