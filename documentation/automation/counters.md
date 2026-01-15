# Counters (Variables)

Counters allow your automation to have "memory". They store numbers that can be checked in Triggers and changed by Actions.

## Common Use Cases

### 1. Limiting Repetitions
**Goal**: Click a button 10 times, then stop.
-   **Condition**: `Counter 'Clicks' < 10`
-   **Action 1**: Click Button
-   **Action 2**: Increment 'Clicks' by 1

### 2. State Machines
**Goal**: Do task A, then task B, then task A again.
-   **Event A**:
    -   Condition: `Counter 'State' == 0`
    -   Action: Do Task A, then Set 'State' to 1
-   **Event B**:
    -   Condition: `Counter 'State' == 1`
    -   Action: Do Task B, then Set 'State' to 0

## Best Practices
-   **Naming**: Give counters descriptive names like `RetryCount`, `CurrentPage`, `IsInventoryOpen` (using 0/1 for boolean).
-   **Resetting**: Remember to decide if counters should reset when you stop/start the automation.
