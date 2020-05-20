[![Release](https://jitpack.io/v/jitpack/android-example.svg)](https://jitpack.io/#rommansabbir/ResultShowDialog-Android)
# ResultShowDialog-Android
A custom result show dialog for Android like iOS.

## Screenshots

![Success](https://i.imgur.com/j8f94AT.png)
![Success](https://i.imgur.com/KKnPKr8.png)

## Documentation

### Installation
---
Step 1. Add the JitPack repository to your build file 

```gradle
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

```gradle
	dependencies {
	        implementation 'com.github.rommansabbir:ResultShowDialog-Android:1.0'
	}
```

---

### Version available

| Releases
| ------------- |
| 1.0           |

# Usages
````
        /**
         * To show the result show dialog just call [ResultShowDialog.showDialogPrimary]
         *
         * @param activity, [Activity] reference
         * @param isSuccess, Show dialog for success result or error result
         * @param title, Provide title for the result show dialog
         * @param message, Provide a message for the result show dialog
         * @param actionButtonText, Provide own text for the action button
         *
         * Get notified about action button event by Kotlin's Higher Order Function
         */
        ResultShowDialog.showDialogPrimary(
            this,
            true,
            "Success",
            "This is a dummy test, This is a dummy test, This is a dummy test ,This is a dummy test This is a dummy test This is a dummy testThis is a dummy testThis is a dummy test",
            "Done"
        ) {
            //Do your stuff here
        }
````
---

### Contact me
[Portfolio](https://www.rommansabbir.com/) | [LinkedIn](https://www.linkedin.com/in/rommansabbir/) | [Twitter](https://www.twitter.com/itzrommansabbir/) | [Facebook](https://www.facebook.com/itzrommansabbir/)

### License
---
[Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

````
Copyright (C) 2020 Romman Sabbir

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
````


