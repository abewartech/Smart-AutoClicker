# Automation Examples

Here are some common patterns you can build.

## Example 1: Auto-Skip Ads
**Scenario**: An "X" button appears randomly to close an ad.

1.  **Capture**: Take a screenshot of the "X" button.
2.  **Condition**: Image "CloseButton" is visible.
3.  **Action**: Click on "CloseButton".
4.  **Priority**: High (so it interrupts other actions).

## Example 2: Retry Logic
**Scenario**: Click "Connect". If it fails (error popup), click "Retry". If success, stop.

**Event 1: Connect**
-   **Condition**: Image "ConnectButton" visible.
-   **Action**: Click "ConnectButton".

**Event 2: Handle Error**
-   **Condition**: Image "ErrorPopup" visible.
-   **Action**: Click "RetryButton".
-   **Action**: Increment "ErrorCount".

**Event 3: Give Up**
-   **Condition**: Counter "ErrorCount" > 5.
-   **Action**: Stop Automation.
