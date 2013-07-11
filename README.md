TAOBAO HSF-Standalone DEMO
=====================================
#### Useage:
1. download all source code to any folder, called **source folder**
2. download hsf from [taobao hsf](http://hsf.taobao.net/hsfversion/hsf2.0.0.1/taobao-hsf.tgz), unzip *taobao-hsf.ar* to any folder called **hsf sar folder**
3. change working path to **source folder** and execute maven command: `mvn eclipse:eclipse package `
4. download hsf-standalone from [taobao hsf](http://hsf.taobao.net/software/hsf-standalone.zip), unzip to any folder called **hsf server folder**.
5. copy */test.hsf.web/target/test.hsf.web-0.0.1-SNAPSHOT* folder in **source folder** to */deploy/* folder in **hsf server folder**
6. start hsf server by execute */bin/startup.bat* in **hsf server folder**
7. check service status from [AppOPS](http://ops.jm.taobao.net/service-manager/), you will see *com.mitch3.test.hsf.api.IHSFTestInterface:1.0.0.pangl* service
8. run main class _com.mitch3.test.hsf.client.Client_ in /test.hsf.client of **source folder** with jvm parameter '-DhsfSarDir', the parameter value is parent folder path of **hsf sar folder**