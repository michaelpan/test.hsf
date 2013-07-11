TAOBAO HSF-Standalone DEMO
=====================================
#### Useage:
1. download all source code to any folder, called **source folder**
2. download hsf from [taobao hsf](http://hsf.taobao.net/hsfversion/hsf2.0.0.1/taobao-hsf.tgz), unzip *taobao-hsf.ar* to any folder called **hsf sar folder**
3. change working path to **source folder** and execute maven command: `mvn eclipse:eclipse package `
4. Start provider by `java com.mitch3.test.hsf.server.Bootstrap -DhsfSarDir= ....` in hsf.test/hsf.test.server
5. Run consumer by `java com.mitch3.test.hsf.client.Client -DhsfSarDir= ...` in hsf.test/hsf.test.client.
6. You can see the output 'Hello mic!'