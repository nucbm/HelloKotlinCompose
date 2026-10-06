# Hello World: Kotlin + Jetpack Compose

Varianta moderna: nu exista fisier XML de layout. Interfata este descrisa
in Kotlin, prin functii `@Composable`, iar ecranul urmeaza starea.

## Fisierele care conteaza

| Fisier | Rol |
|---|---|
| `app/src/main/java/ro/calculmobil/hellocompose/MainActivity.kt` | Activity-ul si toata interfata |
| `app/src/main/AndroidManifest.xml` | Declara aplicatia si Activity-ul de pornire |
| `app/build.gradle.kts` | Versiunile de SDK, Compose si dependentele |
| `gradle/libs.versions.toml` | Catalogul de versiuni |

## Cum se deschide

1. Dezarhiveaza proiectul.
2. In Android Studio: File > Open si alege folderul `HelloKotlinCompose`.
3. Asteapta sincronizarea Gradle (la prima deschidere descarca Gradle si bibliotecile).
4. Apasa Run pe un emulator sau pe un telefon.

## De incercat

1. Deschide `MainActivity.kt` in modul Split: functia `EcranSalutPreview`
   arata ecranul fara sa rulezi aplicatia.
2. Apasa butonul de cateva ori, apoi roteste ecranul: contorul revine la zero,
   pentru ca `remember` nu supravietuieste recrearii Activity-ului.
3. Inlocuieste `remember` cu `rememberSaveable` (import
   `androidx.compose.runtime.saveable.rememberSaveable`) si roteste din nou.

## Comparatie cu varianta Java + XML

| | Java + XML | Kotlin + Compose |
|---|---|---|
| Interfata | `activity_main.xml` | functii `@Composable` |
| Legatura cu codul | `findViewById` | parametri si stare |
| La apasare | `setText(...)` pe element | `contor++`, ecranul se reface |

## Versiuni

Android Gradle Plugin 9.4.0, Gradle 9.6.0, Kotlin 2.4.10, Compose BOM 2026.09.00,
compileSdk 37, minSdk 26. Daca Android Studio propune actualizarea lor, accepta.
