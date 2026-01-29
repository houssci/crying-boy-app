# Crying Boy Android App

A simple Android app that shows a boy who cries when tapped.

## Project Structure

```
android-crying-boy-app/
├── app/
│   └── src/main/
│       ├── java/com/example/cryingboy/
│       │   └── MainActivity.kt
│       ├── res/
│       │   ├── drawable/
│       │   │   ├── boy_normal.xml    (happy boy face)
│       │   │   └── boy_crying.xml    (crying boy face)
│       │   ├── layout/
│       │   │   └── activity_main.xml
│       │   ├── raw/
│       │   │   └── crying_sound.mp3  (YOU NEED TO ADD THIS)
│       │   └── values/
│       │       ├── colors.xml
│       │       ├── strings.xml
│       │       └── themes.xml
│       └── AndroidManifest.xml
├── build.gradle.kts
├── settings.gradle.kts
└── gradle.properties
```

## Setup Instructions

### 1. Add Crying Sound
You need to add a crying sound file:
- Download or create a `.mp3` or `.wav` file of a crying sound
- Rename it to `crying_sound.mp3`
- Place it in `app/src/main/res/raw/crying_sound.mp3`

Free sound sources:
- https://freesound.org (search for "baby crying" or "child crying")
- https://pixabay.com/sound-effects/

### 2. Open in Android Studio
1. Open Android Studio
2. Select "Open an existing project"
3. Navigate to and select the `android-crying-boy-app` folder
4. Wait for Gradle sync to complete

### 3. Build and Run
1. Connect an Android device or start an emulator
2. Click the "Run" button (green play icon)
3. The app will install and launch

## How It Works

- The app displays a cartoon boy face (vector drawable)
- When you tap the boy, it:
  1. Changes to the crying face image
  2. Plays the crying sound
  3. Returns to normal face when the sound finishes

## Customization

### Replace Images
Replace the vector drawables in `res/drawable/` with your own images:
- `boy_normal.xml` or `boy_normal.png` - The happy/default state
- `boy_crying.xml` or `boy_crying.png` - The crying state

### Change Sound
Replace `res/raw/crying_sound.mp3` with any audio file.

## Requirements

- Android Studio Hedgehog (2023.1) or newer
- Android SDK 34
- Minimum Android version: 7.0 (API 24)
