plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.main"
    compileSdk = Config.compileSdk

    defaultConfig {
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk

        testInstrumentationRunner = Config.testInstrumentationRunner
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.jvmTarget
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(Dependencies.UI.coreKtx)
    implementation(Dependencies.UI.appCompat)
    implementation(Dependencies.UI.material)
    testImplementation(Dependencies.Test.jUnit)
    implementation(Dependencies.UI.constraint)
    androidTestImplementation(Dependencies.Test.androidJUnit)
    androidTestImplementation(Dependencies.Test.espresso)

    //Koin
    implementation(Dependencies.Koin.koinAndroid)

    //Paging
    implementation(Dependencies.Paging.paging_v3)
    implementation(Dependencies.Paging.pagingCommon)

    implementation(project(":features:main:data"))
    implementation(project(":core"))

    //ViewBinding Delegate
    // reflection-based flavor
    implementation("com.github.kirich1409:viewbindingpropertydelegate-full:1.5.8")
    // reflection-free flavor
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.8")
}