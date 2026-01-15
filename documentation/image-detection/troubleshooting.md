# Troubleshooting Image Detection

If your automation isn't working, image detection is the most likelihood culprit.

## Diagnosis Steps

1.  **Check the Debug Overlay**
    -   Enable "Debug Mode" in Settings.
    -   This will draw boxes around detected images on your screen in real-time.
    -   **Green Box**: Match found above threshold.
    -   **Red Box**: Best match found, but below threshold (rejected).

2.  **Verify Screenshot Permission**
    -   Android sometimes revokes the "Screen Capture" permission. Restart the service or the app.

3.  **Check Orientation**
    -   If you created the template in Landscape but are now running in Portrait, it won't match. Templates are orientation-specific.

4.  **Lighting/Night Mode**
    -   "Night Light" or "Blue Light Filter" apps change screen colors. Ensure these are OFF when creating templates and running automation.

## Common Issues

### "It works sometimes, but misses others."
-   **Cause**: Dynamic background or transparency.
-   **Fix**: Lower the threshold slightly (e.g., from 90% to 85%).
-   **Fix**: Re-crop the template to exclude the background.

### "It detects the wrong button."
-   **Cause**: The template is too generic.
-   **Fix**: Raise the threshold (e.g., to 95%).
-   **Fix**: Restrict the **Search Area** to only the corner where the correct button appears.
