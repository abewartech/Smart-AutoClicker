# Understanding Thresholds

The **Threshold** is the "strictness" setting for image matching. It is a value between 0% and 100%.

## Default Value
The default is usually around **85-90%**. Use this as a starting point.

## Adjusting the Threshold

### When to Lower It (e.g., 70-80%)
-   **Slight Variations**: The game has dynamic lighting, or the button is slightly semi-transparent.
-   **Compression Artifacts**: The screenshot quality is set to "Low", causing pixel noise.
-   **False Negatives**: The image is on screen, but Klick'r ignores it.

### When to Raise It (e.g., 95-99%)
-   **False Positives**: Klick'r clicks on the wrong thing (e.g., it thinks a cloud looks like the "Start" button).
-   **Similar Icons**: You have two very similar buttons (e.g., "Buy 1" and "Buy 10") and need to distinguish them perfectly.

## Warning
-   **Too Low**: Klick'r will see matches everywhere (e.g., a dark patch of rocks might look like a dark button).
-   **Too High**: Klick'r might miss the button if the rendering is even slightly different (e.g., different anti-aliasing).
