# Mobile Appium QA

A small mobile test automation project for the [Sauce Labs My Demo App](https://github.com/saucelabs/my-demo-app-android), created as part of a Mobile QA Engineer technical assignment.

## Project Overview

The project demonstrates a basic automated UI test for an Android application using:

- Kotlin
- Appium
- Appium Java Client
- UiAutomator2
- Selenium WebDriver
- JUnit 5
- Gradle

The goal is to demonstrate a maintainable test setup, reliable UI interaction, and basic test assertions.

## Automated Test

### Product Catalog

**Test:** `productsShouldBeDisplayed`

**Scenario:**
1. Launch the My Demo App on an Android emulator.
2. Wait for the product catalog to become available.
3. Verify that the product **Sauce Labs Backpack** is displayed.

The test uses an explicit wait to reduce the risk of timing-related failures.

## Prerequisites

- Java 21 (JDK)
- Android Studio and Android SDK
- Android emulator or compatible Android device
- Node.js and npm
- Appium 2
- UiAutomator2 Appium driver

## Setup

### 1. Start the Android emulator

Start an Android emulator from Android Studio.

Verify that the device is connected:

```bash
adb devices
```

### 2. Start Appium

Start the Appium server:

```bash
appium
```

The test expects the server to be available at:

```text
http://127.0.0.1:4723
```

### 3. Run the test

From the project root, execute:

```bash
./gradlew test
```

On Windows:

```powershell
.\gradlew.bat test
```

## Test Configuration

The test currently targets the following Android application:

```text
Package: com.saucelabs.mydemoapp.android
Activity: com.saucelabs.mydemoapp.android.view.activities.MainActivity
```

The emulator UDID is currently configured as `emulator-5554`.

## Project Structure

```text
mobile-appium-qa/
├── src/
│   └── test/
│       └── kotlin/
│           └── ShoppingCatalogTest.kt
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
├── gradlew.bat
└── README.md
```

## Test Reports

After execution, Gradle generates test reports in:

```text
build/reports/tests/test/
```

Open `index.html` in a browser to view the test results.

## Approach and Design Decisions

- **Kotlin:** concise JVM language with Java interoperability.
- **Appium:** enables automated interaction with the native Android application.
- **UiAutomator2:** Android automation backend.
- **Explicit waits:** wait for UI conditions instead of relying on fixed delays.
- **JUnit 5:** provides test lifecycle management and assertions.
- **Gradle Wrapper:** allows the project to use a consistent Gradle version without requiring a separate Gradle installation.

## Scope and Limitations

This is an initial proof of concept containing one automated UI test.

The current test covers only the product catalog display. Additional scenarios, such as product details, cart functionality, and checkout, could be added in future iterations.

## Application Under Test

[Sauce Labs My Demo App – Android](https://github.com/saucelabs/my-demo-app-android)
