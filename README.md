# Android Calculator

A simple yet functional calculator application for Android, built with Kotlin and following Material Design principles.

## Features

- **Basic Arithmetic Operations**
  - Addition (+)
  - Subtraction (-)
  - Multiplication (×)
  - Division (÷)
  - Percentage (%)

- **Advanced Functions**
  - Square root (√)
  - Decimal point support
  - Backspace functionality
  - Clear (C) button

- **User Interface**
  - Clean, modern design with circular buttons
  - Large display for easy readability
  - Color-coded operators (orange) for better visibility
  - Responsive layout using ConstraintLayout

## Technical Specifications

### Requirements

- **Minimum SDK**: Android 5.0 (API Level 21)
- **Target SDK**: Android 11 (API Level 30)
- **Language**: Kotlin 1.5.0
- **Build System**: Gradle 4.2.1

### Dependencies

```gradle
- Kotlin Standard Library
- AndroidX Core KTX 1.5.0
- AndroidX AppCompat 1.3.0
- Material Components 1.3.0
- ConstraintLayout 2.0.4
```

## Project Structure

```
Calculator/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/calculator/
│   │   │   │   ├── MainActivity.kt          # Main activity handling UI
│   │   │   │   └── CalcClass.kt             # Calculator logic
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml    # UI layout
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   └── themes.xml
│   │   │   │   └── drawable/
│   │   │   │       └── circle.xml           # Button background
│   │   │   └── AndroidManifest.xml
│   │   ├── androidTest/                     # Instrumented tests
│   │   └── test/                            # Unit tests
│   └── build.gradle
├── gradle/
├── build.gradle
└── settings.gradle
```

## Architecture

### MainActivity.kt
The main activity class that:
- Implements `View.OnClickListener` for handling button clicks
- Initializes all UI components (buttons and display)
- Delegates calculation logic to `CalcClass`
- Manages user interactions

### CalcClass.kt
The calculator logic class that:
- Maintains state (first number, second number, operator)
- Performs arithmetic operations
- Handles decimal point input
- Manages display updates
- Implements square root functionality

## Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd Calculator
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an Existing Project"
   - Navigate to the Calculator directory

3. **Build the project**
   - Let Gradle sync and download dependencies
   - Build → Make Project (or Ctrl+F9)

4. **Run the application**
   - Connect an Android device or start an emulator
   - Run → Run 'app' (or Shift+F10)

## Usage

### Basic Operations
1. Enter the first number by tapping digit buttons (0-9)
2. Tap an operator button (+, -, ×, ÷, %)
3. Enter the second number
4. Tap the equals button (=) to see the result

### Square Root
- Enter a number and tap the √ button for immediate square root
- Or perform an operation and tap √ to get the square root of the result

### Other Functions
- **C (Clear)**: Clears all input and resets the calculator
- **⌫ (Backspace)**: Removes the last entered character
- **.** (Decimal Point): Adds a decimal point to the current number

### State Management
- Tracks calculation state (whether a result was just calculated)
- Properly handles operator changes
- Maintains first number, second number, and operator separately

## Testing

The project includes test directories for:
- **Unit Tests** (`app/src/test/`): Test calculator logic
- **Instrumented Tests** (`app/src/androidTest/`): Test UI interactions

Run tests using:
```bash
./gradlew test          
./gradlew connectedAndroidTest 
```

## Building for Release

1. Generate a signed APK:
   - Build → Generate Signed Bundle / APK
   - Follow the wizard to create or use an existing keystore

2. Or build from command line:
   ```bash
   ./gradlew assembleRelease
   ```

## License

This project is available for educational purposes.