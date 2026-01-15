plugins {
    alias(libs.plugins.buzbuz.androidLibrary)
    alias(libs.plugins.buzbuz.hilt)
}

android {
    namespace = "com.buzbuz.smartautoclicker.ai"
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.androidx.annotation)
    
    // Core Dependencies
    implementation(project(":core:common:base"))
    implementation(project(":core:smart:domain"))
    
    // ML Kit & Vision
    implementation(libs.google.mlkit.text.recognition)
    implementation(project(":core:smart:detection"))
}
