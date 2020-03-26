object Android {
    const val compileSdkVersion = 28
    const val applicationId = "com.example.android.myproject"
    const val minSdkVersion = 22
    const val targetSdkVersion = 28
    const val versionCode = 1
    const val versionName = "1.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

private object Version {
    const val kotlin = "1.3.61"
    const val viewModel = "2.2.0"
    const val koin = "2.0.1"
    const val appCompact = "1.1.0"
    const val core = "1.1.0"
    const val constraintLayout = "2.0.0-beta4"
    const val materialDesign = "1.1.0-beta02"
    const val supportDesign = "28.0.0"
    const val room = "2.2.3"
    const val retrofit = "2.6.0"
    const val junit = "4.12"
    const val junitExt = "1.1.1"
    const val espresso = "3.2.0"
}

object Libs {
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    const val koin = "org.koin:koin-android:${Version.koin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Version.koin}"
    const val koinScope = "org.koin:koin-androidx-scope:${Version.koin}"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Version.viewModel}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.viewModel}"
    const val appCompact = "androidx.appcompat:appcompat:${Version.appCompact}"
    const val core = "androidx.core:core-ktx:${Version.core}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    const val materialDesign = "com.google.android.material:material:${Version.materialDesign}"
    const val supportDesign = "com.android.support:design:${Version.supportDesign}"

    const val roomRuntime = "androidx.room:room-runtime:${Version.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Version.room}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"

    const val junit = "junit:junit:${Version.junit}"
    const val junitExt = "androidx.test.ext:junit:${Version.junitExt}"
    const val espresso = "androidx.test.espresso:espresso-core:${Version.espresso}"
}