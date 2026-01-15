# Creating Good Templates

A "Template" is the reference image Klick'r searches for. The quality of your templates directly affects the reliability of your automation.

## Do's
-   **Crop Tight**: Include *only* the unique part of the element.
    -   *Good*: The icon inside a button.
    -   *Bad*: The button plus the background grass behind it.
-   **Unique Features**: Choose something that appears *only* where you want to click.
    -   *Avoid*: A generic "Close X" if there are 5 different X buttons on screen (unless you restrict the Search Area).
-   **High Contrast**: Elements with sharp edges and distinct colors are easier to detect.

## Search Area
You can define a specific rectangular region of the screen to search in.
-   **Performance**: Searching a small box is much faster than searching the whole 1080p screen.
-   **Accuracy**: Prevents finding false positives in other parts of the UI.

## Multiple Templates
You can assign multiple templates to a single condition. This is useful for:
-   **Animations**: If a button glows or changes color, add templates for both states.
-   **Resolutions**: If you play on both Phone and Tablet, add templates cropped from both devices.
-   **Logic**: "Click if you see the 'Accept' button OR the 'Claim' button" (Logical OR).
