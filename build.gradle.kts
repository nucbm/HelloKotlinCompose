// Fisierul de build al intregului proiect: doar declara plugin-urile,
// fara sa le aplice. Fiecare modul le aplica in propriul build.gradle.kts.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
}
