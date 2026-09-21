// NOTE: AGP 9.0 以降は Kotlin サポートが組み込みのため org.jetbrains.kotlin.android は不要。
//       組み込みのデフォルトKGPより新しいバージョンを使うため buildscript classpath で明示指定する。
//       https://developer.android.com/build/releases/agp-9-0-0-release-notes#android-gradle-plugin-built-in-kotlin
buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${libs.versions.kotlin.get()}")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
}
