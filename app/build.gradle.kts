plugins {
    alias(libs.plugins.android.application)
    // Compilatorul Compose. Suportul pentru Kotlin este inclus in
    // Android Gradle Plugin 9, deci nu mai trebuie un plugin separat.
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "ro.calculmobil.hellocompose"
    compileSdk = 37

    defaultConfig {
        applicationId = "ro.calculmobil.hellocompose"
        minSdk = 26
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.activity.compose)

    // BOM-ul stabileste versiunile tuturor bibliotecilor Compose.
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui.tooling.preview)
    debugImplementation(libs.androidx.compose.ui.tooling)
}
