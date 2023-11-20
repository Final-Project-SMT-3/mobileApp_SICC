plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.sicc"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.sicc"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.github.AtifSayings:Animatoo:1.0.1")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation("io.github.chaosleung:pinview:1.4.4")
    implementation("com.android.volley:volley:1.2.1")
    implementation("com.airbnb.android:lottie:6.1.0")
    implementation("com.github.shuhart:stepview:1.5.1")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.2.0-alpha01")

    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    testImplementation("junit:junit:4.13.2")
}