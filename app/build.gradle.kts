plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
    id("com.google.gms.google-services")
    id ("androidx.navigation.safeargs.kotlin")
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

    implementation(libs.play.services.ads)

    //Firebase
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.auth)
    implementation(libs.firebase.auth.ktx)
    implementation(libs.firebase.analytics)
    implementation(libs.firebase.messaging)
    implementation(libs.firebase.firestore.ktx.v2440)
    implementation(libs.firebase.firestore.ktx)



    implementation ("com.github.mmoamenn:LuckyWheel_Android:0.3.0")

    implementation ("com.github.caneryilmaz52:LuckyWheelView:1.1.3")



    implementation ("com.google.android.material:material:1.12.0") // Use the latest version
    // ... other dependencies



    implementation (libs.play.services.auth.v2101)

    // Google Sign-In
    implementation (libs.play.services.auth)

    // Jetpack Navigation
    implementation(libs.androidx.navigation.fragment.ktx.v277)
    implementation(libs.androidx.navigation.ui.ktx.v277)

    // Glide
    implementation(libs.glide)
    implementation(libs.play.services.ads.api)
    implementation(libs.androidx.media3.common.ktx)
    implementation(libs.room)
    implementation(libs.swiperefreshlayout)
    kapt(libs.compiler)

    //AndroidX y Material
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.flexbox)
    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
