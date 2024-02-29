# MyApplicationSDK

## Installation

### Step 1. Add the JitPack repository to your build file

Add it in your root `build.gradle` at the end of repositories:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
###  Step 2. Add the dependency
```gradle
dependencies {
    implementation 'com.github.ZaidAli98:MyApplicationSDK:Tag'
}
```


