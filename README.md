# Mobile Appium QA – Sauce Labs Demo App

A mobile UI test automation project created as part of a Mobile QA Engineer technical assignment.

The project demonstrates a basic automated test for the Android version of the [Sauce Labs My Demo App](https://github.com/saucelabs/my-demo-app-android).

## Project Overview

The project uses:

- **Kotlin**
- **Appium 2**
- **Appium Java Client**
- **UiAutomator2**
- **Selenium WebDriver**
- **JUnit 5**
- **Gradle**

The focus is on reliable UI interaction, readable test code, and a reproducible local test setup.

## Test Scenarios

### Manual Test Scenarios

Manual test scenarios are documented in [`test-cases.md`](test-cases.md).

The scenarios cover shopping cart functionality:

- Add a product to the cart
- Verify product details
- Add multiple products
- Remove a product
- Continue shopping

### Automated Test

| Test | Description |
|---|---|
| `productsShouldBeDisplayed` | Verifies that Sauce Labs Backpack is displayed in the product catalog. |

The test uses an explicit wait to wait for the product to become visible.

## Prerequisites

The following tools are required:

- Java JDK 21
- Android Studio
- Android SDK
- Android emulator or compatible Android device
- Node.js and npm
- Appium 2
- UiAutomator2 Appium driver

## Environment Setup

### 1. Clone the repository

```bash
git clone https://github.com/mcharvat-cen89008/test-QA-demoapp.git
cd test-QA-demoapp
```

### 2. Start an Android emulator

Start an Android emulator from Android Studio.

Verify that the emulator is connected:

```bash
adb devices
```

The test currently uses the device UDID:

```text
emulator-5554
```

If your emulator has a different UDID, update the test configuration accordingly.

### 3. Install the application

Install the Sauce Labs My Demo App on the emulator.

The application is available from the official repository:

[Sauce Labs My Demo App – Android](https://github.com/saucelabs/my-demo-app-android)

The test expects the application to be installed before execution.

### 4. Install Appium

Install Appium 2:

```bash
npm install -g appium
```

Install the UiAutomator2 driver:

```bash
appium driver install uiautomator2
```

### 5. Start the Appium server

Start Appium in a separate terminal:

```bash
appium
```

The test connects to:

```text
http://127.0.0.1:4723
```

## Running the Tests

Run the test suite from the project root.

### Windows

```powershell
.\gradlew.bat test
```

### macOS / Linux

```bash
./gradlew test
```

The Gradle Wrapper downloads and uses the configured Gradle version automatically.

## Test Reports

After execution, Gradle generates test reports in:

```text
build/reports/tests/test/
```

Open `index.html` in a browser to view the test results.

## Project Structure

```text
test-QA-demoapp/
├── gherkin/
│   └── test-cases.md
├── src/
│   └── test/
│       └── kotlin/
│           └── ShoppingCatalogTest.kt
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
├── gradlew.bat
├── gradle/
│   └── wrapper/
└── README.md
```

## Design Decisions

- **Kotlin:** concise JVM language with Java interoperability.
- **Appium:** enables native mobile UI automation.
- **UiAutomator2:** Android automation backend.
- **Explicit waits:** avoid relying on fixed sleep durations.
- **JUnit 5:** provides test lifecycle management and assertions.
- **Gradle Wrapper:** ensures consistent Gradle execution across environments.

## Current Scope and Limitations

This project currently contains one automated UI test and a set of manual Gherkin scenarios.

The automated test covers the initial product catalog only.

Potential future improvements:

- Page Object Model implementation
- Additional automated shopping cart tests
- Improved test configuration
- Screenshot capture on test failure
- CI execution using GitHub Actions
- Support for additional Android devices

## Application Under Test

[Sauce Labs My Demo App – Android](https://github.com/saucelabs/my-demo-app-android)
