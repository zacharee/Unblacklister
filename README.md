[![](https://jitpack.io/v/zacharee/Unblacklister.svg)](https://jitpack.io/#zacharee/Unblacklister)

# Unblacklister
Super simple library to disable Android's hidden API blacklist

Add it to your project:

Project build.gradle:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Module build.gradle:
```
dependencies {
    implementation 'com.github.zacharee:Unblacklister:VERSION'
}
```

# Usage
Java:
```
UnblacklisterKt.disableApiBlacklist();
```

Kotlin:
```
disableApiBlacklist()
```

# More Information
https://www.xda-developers.com/android-development-bypass-hidden-api-restrictions/
http://weishu.me/2019/03/16/another-free-reflection-above-android-p/
https://stackoverflow.com/questions/55970137/bypass-androids-hidden-api-restrictions/55970138#55970138
https://github.com/tiann/FreeReflection
