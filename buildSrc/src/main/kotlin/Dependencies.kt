object Dependencies {

    object UI {
        const val coreKtx = "androidx.core:core-ktx:1.7.0"
        const val appCompat = "androidx.appcompat:appcompat:1.6.0"
        const val material = "com.google.android.material:material:1.8.0"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.1.4"
    }

    object Test {
        const val jUnit = "junit:junit:4.13.2"
        const val androidJUnit = "androidx.test.ext:junit:1.1.5"
        const val espresso = "androidx.test.espresso:espresso-core:3.5.1"
    }

    object Koin {
        const val koinAndroid = "io.insert-koin:koin-android:3.3.3"
        const val koinCore = "io.insert-koin:koin-core:3.3.3"
    }

    object Retrofit {
        private const val retrofit_version = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofit_version"
        const val gsonAnnotation = "com.google.code.gson:gson:2.10.1"
    }

    object OkHttp {
        const val okhttp_bom = "com.squareup.okhttp3:okhttp-bom:4.10.0"
        const val okhttp = "com.squareup.okhttp3:okhttp"
        const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor"
    }

    object Paging {
        const val paging_v3 = "androidx.paging:paging-runtime-ktx:3.1.1"
        const val pagingCommon = "androidx.paging:paging-common-ktx:3.1.1"
    }

    object Coroutines {
        const val coreCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4"
    }

    object Lifecycle {
        private const val lifecycle_version = "2.5.1"
        const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"
        const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    }
}