# Architecture Overview

Smart AutoClicker follows the **Clean Architecture** principles to ensure separation of concerns, testability, and maintainability. The project is modularized to keep dependencies clear and logic isolated.

## Architectural Layers

The application is divided into three main layers:

1.  **Presentation Layer** (`:feature:`, `:smartautoclicker`)
    -   Contains UI components (Activities, Fragments, Views).
    -   Uses ViewModels to hold UI state and interact with the Domain layer.
    -   Dependent on the Android framework.

2.  **Domain Layer** (`:core:smart:domain`, `:core:dumb:domain`)
    -   The core business logic of the application.
    -   Platform-independent (pure Kotlin where possible).
    -   Contains Use Cases, Models, and Repository interfaces.
    -   **No dependencies** on the Data or Presentation layers.

3.  **Data Layer** (`:core:smart:database`, `:core:smart:processing`, `:core:smart:detection`)
    -   Implements the Repository interfaces defined in the Domain layer.
    -   Handles data sources: Room Database, SharedPreferences, File System.
    -   Handles external services: OpenCV (Image Detection), Android System (Accessibility Service).

## Key Components

### Accessibility Service
The heart of the automation is the `AutoClickerService`. This Android Accessibility Service runs in the background and:
-   Listens for accessibility events.
-   Captures the screen content (for image detection).
-   Injects gestures (clicks, swipes) into the system.

### Detectors
Classes responsible for analyzing the screen content. They use OpenCV to match template images against the current screenshot.

### Executors
Classes that execute the defined Actions (Click, Swipe) when Triggers function.

## Dependency Injection
The project uses **Hilt** (Dagger) for dependency injection. This simplifies testing and decouples class construction.
