# Code Style

We follow the standard **Kotlin Coding Conventions** with a few project-specific preferences.

## Formatting
-   Use **ktlint**. The project is configured with a strict check.
-   Run `./gradlew lintKotlin` to verify.
-   Run `./gradlew formatKotlin` to auto-fix issues.

## Architecture Guidelines
-   **Clean Architecture** is strict.
-   `:domain` modules must NOT have android dependencies (except basic Log/Parcelable).
-   Use `internal` visibility for classes not exposed outside their module.

## Comments
-   Public functions in the `:domain` layer must have KDoc.
-   Explain *Trigger/Action* logic clearly, as end-users will rely on this behavior.
