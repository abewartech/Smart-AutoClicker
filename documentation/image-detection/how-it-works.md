# How Image Detection Works

Klick'r uses Computer Vision (specifically OpenCV) to analyze your screen in real-time. This allows the app to react to visual cues rather than blindly clicking at fixed coordinates.

## The Process

1.  **Template Matching**: The core algorithm used is "Template Matching".
    -   You provide a "Template" (a small image crop).
    -   The app takes a "Source" (the full screen screenshot).
    -   The app slides the Template over the Source, pixel by pixel, calculating a similarity score at every position.

2.  **Score Calculation**: The result is a heatmap of similarity scores (from 0.0 to 1.0).
    -   1.0 means a perfect pixel-for-pixel match.
    -   0.0 means no similarity.

3.  **Thresholding**: We compare the highest score found against your "Threshold".
    -   If `MaxScore >= Threshold`, we consider the image **Found**.
    -   The location of the highest score is used as the **Detection Coordinates**.

## Advantages
-   **Resolution Independent**: If the game elements scale (and you use multi-resolution templates), it still works.
-   **Dynamic Positioning**: Buttons can move around the screen; Klick'r will find them.

## Limitations
-   **Scaling/Rotation**: Basic Template Matching is sensitive to size and rotation changes. If the button doubles in size, the template won't match.
    -   *Solution*: Klick'r allows you to create multiple templates for different resolutions if needed.
-   **Transparency**: Semi-transparent overlays can change the pixel values enough to lower the score.
    -   *Solution*: Lower the threshold slightly.
