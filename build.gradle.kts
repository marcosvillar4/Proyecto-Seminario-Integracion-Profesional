// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false


    id("com.google.gms.google-services") version "4.4.2" apply false


}

buildscript {
    dependencies {
        classpath ("com.google.gms:google-services:4.4.0")
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.5")
    }
}