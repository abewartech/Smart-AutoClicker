# Contributing

We love contributions!

## How to add a new Action

1.  **Domain Layer**:
    -   Define the model in `:core:smart:domain` (sealed class `Action`).
    -   Update `ActionEntityMapper` and `ActionDomainMapper`.

2.  **Database Layer**:
    -   Update `ActionEntity` in `:core:smart:database`.
    -   Write a migration if you change the schema.

3.  **UI Layer**:
    -   Add the configuration UI in `:feature:smart-config`.

4.  **Processing Layer**:
    -   Implement the logic in `:core:smart:processing` (ActionExecutor).

## Pull Requests
-   Keep PRs focused on one feature or fix.
-   Include screenshots for UI changes.
-   Update documentation if you add new features.
