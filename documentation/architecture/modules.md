# Project Modules

The project is structured into multiple Gradle modules to enforce boundaries and improve build times.

## Core Modules (`:core`)
These modules contain the foundational logic and are reused across features.

-   **:core:common:base**: Data types, extensions, and utilities used everywhere.
-   **:core:common:android**: Android-specific helpers (Intent wrapping, Context extensions).
-   **:core:common:ui**: Reusable UI components (custom Views, Dialogs).
-   **:core:smart:domain**: Domain models (`Action`, `Trigger`, `Event`) and Use Cases for "Smart" mode.
-   **:core:smart:database**: Room database implementation for storing flows.
-   **:core:smart:detection**: Computer vision logic using OpenCV.
-   **:core:smart:processing**: The engine that runs the automation flows.
-   **:ai-assistant**: (New) AI capabilities for natural language processing and flow generation.

## Feature Modules (`:feature`)
These modules contain specific user-facing features (UI screens).

-   **:feature:smart-config**: UI for configuring Smart Mode triggers and actions.
-   **:feature:dumb-config**: UI for the simple (classic) auto-clicker mode.
-   **:feature:notifications**: Management of notification channels and alerts.
-   **:feature:tutorial**: Onboarding screens and guides.

## App Module (`:smartautoclicker`)
The entry point of the application. It ties all modules together and contains the main `Application` class and dependency injection setup.
