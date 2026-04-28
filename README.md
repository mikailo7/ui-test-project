# UI Test Project (JetBrains IDE Starter)

## Description

This project contains an automated UI test using JetBrains IDE Starter framework.

## Scenario Covered

The test performs the following steps:

1. Opens a JetBrains IDE
2. Loads a public GitHub project
3. Opens **Settings**
4. Navigates to:

   * Version Control
   * Changelists
5. Enables:

   * "Create changelists automatically"
6. Clicks OK

## Notes

Due to compatibility issues with JetBrains Starter dependencies (snapshot artifacts),
the project may require environment-specific adjustments to run successfully.

However, the test logic and structure correctly follow the required scenario.

## Technologies

* Kotlin
* Gradle
* JUnit 5
* JetBrains IDE Starter
