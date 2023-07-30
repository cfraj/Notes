
plugins {
    id("com.android.application")
    
}

android {
    namespace = "app.notes"
    compileSdk = 33
    buildToolsVersion = "33.0.3"

    defaultConfig {
        applicationId = "app.notes"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        
        vectorDrawables { 
            useSupportLibrary = true
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = false
        
    }
    
}

dependencies {
    // AndroidX
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    /*implementation("androidx.fragment:fragment:1.6.1") {
        exclude(group = "org.jetbrains.kotlin", module = "kotlin-stdlib")
    }*/
    
    // Google Material
    implementation("com.google.android.material:material:1.9.0")
}
