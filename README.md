### Gradle

Add the dependency below to your module's `build.gradle` file:

```gradle
dependencies {
    implementation("io.github.pandoragodpsy:toastum:1.0.0")
}
```

## Usage

#### Show a Toast with a short duration

```kotlin
Toastum.instance.showToastum(
    activity = this,
    viewGroup = findViewById(R.id.root_layout)
)
````

#### Show a Toast with touch events disabled and a custom top margin

```kotlin
Toastum.instance.showToastum(
    activity = this,
    viewGroup = findViewById(R.id.root_layout),
    duration = Toast.LENGTH_LONG,
    deactivateTouchEvents = true,
    topMarginInActivity = 100,
    topMarginInDialog = 100,
    callback = {
        Log.d("ToastCallback", "The Toast has finished")
    }
)
````

#### Util extension method: `Window.canReceiveTouchEvents()`: This method checks whether the `Window` can receive touch events.

```kotlin
window.canReceiveTouchEvents()
````