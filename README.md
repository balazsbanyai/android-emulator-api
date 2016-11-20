# android-emulator-api
Provides solution to control (eg. call, inject mock locations etc.) an android emulator from instrumentation tests.

# components
##### Gradle plugin
Provides the 'back end' for the Runtime, listens for commands on a port, and executes them.
Should be applied to the test subject project

##### Runtime
Provides a simple interface to access emulator console functionality as described [here](https://developer.android.com/studio/run/emulator-commandline.html#console)
Should be added to the test variant