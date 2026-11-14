plugins {
    id("com.android.application")
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.photo_journal"
    defaultConfig {
        applicationId = "com.example.photo_journal"
        minSdk = 24
        targetSdk = 34
    }
}
