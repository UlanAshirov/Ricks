plugins {
    id("com.android.library")
    id(Config.Plugins.jetKotlin)
}

android {
    namespace = "com.example.data"
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
}

dependencies {

    implementation(Dependencies.UI.coreKtx)
    implementation(Dependencies.UI.appCompat)
    implementation(Dependencies.UI.material)
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.androidJUnit)
    androidTestImplementation(Dependencies.Test.espresso)

    //Retrofit
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.gsonAnnotation)

    //OkHttp
    implementation(Dependencies.OkHttp.okhttp)
    implementation(Dependencies.OkHttp.logging_interceptor)
    implementation(Dependencies.OkHttp.okhttp_bom)

    //Paging
    implementation(Dependencies.Paging.paging_v3)

    //Coroutines
    implementation(Dependencies.Coroutines.coreCoroutines)

    //Koin
    implementation(Dependencies.Koin.koinAndroid)

    api(project(":features:main:domain"))
    implementation(project(":core"))
}