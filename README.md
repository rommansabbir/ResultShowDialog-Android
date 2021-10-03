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
	        implementation 'com.github.rommansabbir:ResultShowDialog-Android:{TAG}'
	}
```

---

### Version available

| Releases
| ------------- |
| 1.0           |
| 1.0.1         |
| 1.2.0         |

# Usages
````
        /**
         * It's easy to show the dialog. It follows The Builder Pattern
         */
        val result = ResultShowDialog.Companion.Builder()
            //Default: True
            .setIsSuccess(false)
            //Default: Successful
            .setTitle("Test Successful")
            //Default: Your task was completed successfully
            .setMessage("This is just a custom message")
            //Default: OK
            .setActionButtonText("Okay")
            //Default: false
            .setCancelable(true)
            //return an instance of ResultShowDialog by providing the activity context
            .build(this/context)

        result.show {
            /*
            This callback is invoked when user press the action button.
            Do your stuff here.
             */
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


