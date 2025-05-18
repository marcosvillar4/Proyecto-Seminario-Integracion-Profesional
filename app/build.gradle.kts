plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.gms.google-services")

}

android {
    namespace = "tpo.seminario.breakbuddy"
    compileSdk = 35

    defaultConfig {
        applicationId = "tpo.seminario.breakbuddy"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // Import the Firebase BoM

    implementation(platform(libs.firebase.bom))


    // TODO: Add the dependencies for Firebase products you want to use

    // Añade la dependencia de Firebase Authentication
    // Cuando uses la BoM, no necesitas especificar la versión de Authentication
    implementation(libs.firebase.auth)

    // Si quieres usar Kotlin extensions (recomendado para Kotlin)
    implementation(libs.firebase.auth.ktx)

    // When using the BoM, don't specify versions in Firebase dependencies

    implementation(libs.firebase.analytics)


    // Add the dependencies for any other desired Firebase products





    // https://firebase.google.com/docs/android/setup#available-libraries


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}