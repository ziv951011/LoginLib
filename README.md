Build starting...
Start: Mon Mar 25 10:53:42 UTC 2019 a0f43dd9a143
Git:
3.0.1-0-gbbeaa80
commit bbeaa8020d0056f3aa9e2661660da8084594a1cd
Author: ziv 
Date:   Mon Mar 25 18:45:11 2019 +0800

    移除flag值 增加按钮语句


Found Android manifest
Android SDK version: 23. Build tools: 23.0.2
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2
Warning: File /opt/android-sdk-linux/.android/repositories.cfg could not be loaded.

Installing Android platform 23
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2
Warning: File /opt/android-sdk-linux/.android/repositories.cfg could not be loaded.
Installing Build-tools 23.0.2 
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2
Warning: File /opt/android-sdk-linux/.android/repositories.cfg could not be loaded.
Found gradle
Gradle build script
Using gradle wrapper
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2
Downloading https://services.gradle.org/distributions/gradle-2.8-all.zip
.
Unzipping /home/jitpack/.gradle/wrapper/dists/gradle-2.8-all/ah86jmo43de9lfa8xg9ux3c4h/gradle-2.8-all.zip to /home/jitpack/.gradle/wrapper/dists/gradle-2.8-all/ah86jmo43de9lfa8xg9ux3c4h
Set executable permissions for: /home/jitpack/.gradle/wrapper/dists/gradle-2.8-all/ah86jmo43de9lfa8xg9ux3c4h/gradle-2.8/bin/gradle

------------------------------------------------------------
Gradle 2.8
------------------------------------------------------------

Build time:   2015-10-20 03:46:36 UTC
Build number: none
Revision:     b463d7980c40d44c4657dc80025275b84a29e31f

Groovy:       2.4.4
Ant:          Apache Ant(TM) version 1.9.3 compiled on December 23 2013
JVM:          1.8.0_191 (Oracle Corporation 25.191-b12)
OS:           Linux 4.14.63-xxxx-std-ipv6-64 amd64

0m2.983s
Getting tasks: ./gradlew tasks --all
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2

FAILURE: Build failed with an exception.

* What went wrong:
A problem occurred configuring root project 'build'.
> Could not resolve all dependencies for configuration ':classpath'.
   > Could not resolve org.bouncycastle:bcprov-jdk15on:1.48.
     Required by:
         :build:unspecified > com.android.tools.build:gradle:1.5.0 > com.android.tools.build:gradle-core:1.5.0 > com.android.tools.build:builder:1.5.0
         :build:unspecified > com.android.tools.build:gradle:1.5.0 > com.android.tools.build:gradle-core:1.5.0 > com.android.tools.build:builder:1.5.0 > org.bouncycastle:bcpkix-jdk15on:1.48
      > Could not resolve org.bouncycastle:bcprov-jdk15on:1.48.
         > Could not get resource 'https://jcenter.bintray.com/org/bouncycastle/bcprov-jdk15on/1.48/bcprov-jdk15on-1.48.pom'.
            > Could not GET 'https://jcenter.bintray.com/org/bouncycastle/bcprov-jdk15on/1.48/bcprov-jdk15on-1.48.pom'. Received status code 504 from server: Gateway Time-out

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.
Tasks: 

WARNING:
Gradle 'install' task not found. Please add the 'maven' or 'android-maven' plugin.
See the documentation and examples: https://jitpack.io/docs/

Adding maven plugin
Found android library build file in loginlib
Running: ./gradlew clean -Pgroup=com.github.ziv951011 -Pversion=3.0.2 install
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2
Download https://jcenter.bintray.com/com/github/dcendents/android-maven-gradle-plugin/1.3/android-maven-gradle-plugin-1.3.pom
Download https://jcenter.bintray.com/org/bouncycastle/bcprov-jdk15on/1.48/bcprov-jdk15on-1.48.pom
Download https://jcenter.bintray.com/com/android/tools/build/gradle/1.5.0/gradle-1.5.0.jar
Download https://jcenter.bintray.com/com/github/dcendents/android-maven-gradle-plugin/1.3/android-maven-gradle-plugin-1.3.jar
Download https://jcenter.bintray.com/com/android/tools/build/gradle-core/1.5.0/gradle-core-1.5.0.jar
Download https://jcenter.bintray.com/com/android/tools/build/builder/1.5.0/builder-1.5.0.jar
Download https://jcenter.bintray.com/com/android/tools/lint/lint/24.5.0/lint-24.5.0.jar
Download https://jcenter.bintray.com/com/android/tools/build/transform-api/1.5.0/transform-api-1.5.0.jar
Download https://jcenter.bintray.com/com/android/databinding/compilerCommon/1.0-rc5/compilerCommon-1.0-rc5.jar
Download https://jcenter.bintray.com/net/sf/proguard/proguard-gradle/5.2.1/proguard-gradle-5.2.1.jar
Download https://jcenter.bintray.com/org/jacoco/org.jacoco.core/0.7.4.201502262128/org.jacoco.core-0.7.4.201502262128.jar
Download https://jcenter.bintray.com/com/android/tools/build/builder-model/1.5.0/builder-model-1.5.0.jar
Download https://jcenter.bintray.com/com/android/tools/build/builder-test-api/1.5.0/builder-test-api-1.5.0.jar
Download https://jcenter.bintray.com/com/android/tools/sdklib/24.5.0/sdklib-24.5.0.jar
Download https://jcenter.bintray.com/com/android/tools/sdk-common/24.5.0/sdk-common-24.5.0.jar
Download https://jcenter.bintray.com/com/android/tools/common/24.5.0/common-24.5.0.jar
Download https://jcenter.bintray.com/com/android/tools/build/manifest-merger/24.5.0/manifest-merger-24.5.0.jar
Download https://jcenter.bintray.com/com/android/tools/ddms/ddmlib/24.5.0/ddmlib-24.5.0.jar
Download https://jcenter.bintray.com/com/android/tools/jack/jack-api/0.9.0/jack-api-0.9.0.jar
Download https://jcenter.bintray.com/com/android/tools/jill/jill-api/0.9.0/jill-api-0.9.0.jar
Download https://jcenter.bintray.com/com/squareup/javawriter/2.5.0/javawriter-2.5.0.jar
Download https://jcenter.bintray.com/org/bouncycastle/bcpkix-jdk15on/1.48/bcpkix-jdk15on-1.48.jar
Download https://jcenter.bintray.com/org/bouncycastle/bcprov-jdk15on/1.48/bcprov-jdk15on-1.48.jar
Download https://jcenter.bintray.com/org/ow2/asm/asm/5.0.3/asm-5.0.3.jar
Download https://jcenter.bintray.com/org/ow2/asm/asm-tree/5.0.3/asm-tree-5.0.3.jar
Download https://jcenter.bintray.com/org/antlr/antlr-runtime/3.5.2/antlr-runtime-3.5.2.jar
Download https://jcenter.bintray.com/org/antlr/antlr/3.5.2/antlr-3.5.2.jar
Download https://jcenter.bintray.com/com/android/tools/lint/lint-checks/24.5.0/lint-checks-24.5.0.jar
Download https://jcenter.bintray.com/org/eclipse/jdt/core/compiler/ecj/4.4.2/ecj-4.4.2.jar
Download https://jcenter.bintray.com/com/android/tools/annotations/24.5.0/annotations-24.5.0.jar
Download https://jcenter.bintray.com/com/google/guava/guava/17.0/guava-17.0.jar
Download https://jcenter.bintray.com/com/android/databinding/baseLibrary/1.0-rc5/baseLibrary-1.0-rc5.jar
Download https://jcenter.bintray.com/org/apache/commons/commons-lang3/3.3.2/commons-lang3-3.3.2.jar
Download https://jcenter.bintray.com/com/tunnelvisionlabs/antlr4/4.5/antlr4-4.5.jar
Download https://jcenter.bintray.com/commons-io/commons-io/2.4/commons-io-2.4.jar
Download https://jcenter.bintray.com/com/googlecode/juniversalchardet/juniversalchardet/1.0.3/juniversalchardet-1.0.3.jar
Download https://jcenter.bintray.com/net/sf/proguard/proguard-base/5.2.1/proguard-base-5.2.1.jar
Download https://jcenter.bintray.com/org/ow2/asm/asm-debug-all/5.0.1/asm-debug-all-5.0.1.jar
Download https://jcenter.bintray.com/com/android/tools/layoutlib/layoutlib-api/24.5.0/layoutlib-api-24.5.0.jar
Download https://jcenter.bintray.com/com/android/tools/dvlib/24.5.0/dvlib-24.5.0.jar
Download https://jcenter.bintray.com/com/google/code/gson/gson/2.2.4/gson-2.2.4.jar
Download https://jcenter.bintray.com/org/apache/commons/commons-compress/1.8.1/commons-compress-1.8.1.jar
Download https://jcenter.bintray.com/org/apache/httpcomponents/httpclient/4.1.1/httpclient-4.1.1.jar
Download https://jcenter.bintray.com/org/apache/httpcomponents/httpmime/4.1/httpmime-4.1.jar
Download https://jcenter.bintray.com/net/sf/kxml/kxml2/2.3.0/kxml2-2.3.0.jar
Download https://jcenter.bintray.com/org/antlr/ST4/4.0.8/ST4-4.0.8.jar
Download https://jcenter.bintray.com/com/android/tools/lint/lint-api/24.5.0/lint-api-24.5.0.jar
Download https://jcenter.bintray.com/org/ow2/asm/asm-analysis/5.0.3/asm-analysis-5.0.3.jar
Download https://jcenter.bintray.com/com/tunnelvisionlabs/antlr4-runtime/4.5/antlr4-runtime-4.5.jar
Download https://jcenter.bintray.com/com/tunnelvisionlabs/antlr4-annotations/4.5/antlr4-annotations-4.5.jar
Download https://jcenter.bintray.com/com/intellij/annotations/12.0/annotations-12.0.jar
Download https://jcenter.bintray.com/org/apache/httpcomponents/httpcore/4.1/httpcore-4.1.jar
Download https://jcenter.bintray.com/commons-logging/commons-logging/1.1.1/commons-logging-1.1.1.jar
Download https://jcenter.bintray.com/commons-codec/commons-codec/1.4/commons-codec-1.4.jar
Download https://jcenter.bintray.com/com/android/tools/external/lombok/lombok-ast/0.2.3/lombok-ast-0.2.3.jar
Download https://jcenter.bintray.com/org/abego/treelayout/org.abego.treelayout.core/1.0.1/org.abego.treelayout.core-1.0.1.jar
Gradle version Gradle 2.8
Download https://jcenter.bintray.com/junit/junit/4.12/junit-4.12.pom
Download https://jcenter.bintray.com/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.pom
Download https://jcenter.bintray.com/org/hamcrest/hamcrest-parent/1.3/hamcrest-parent-1.3.pom
Download https://jcenter.bintray.com/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
Download https://jcenter.bintray.com/junit/junit/4.12/junit-4.12.jar
:clean UP-TO-DATE
:app:clean UP-TO-DATE
:loginlib:clean UP-TO-DATE
:loginlib:preBuild UP-TO-DATE
:loginlib:preReleaseBuild UP-TO-DATE
:loginlib:compileReleaseNdk UP-TO-DATE
:loginlib:compileLint
:loginlib:copyReleaseLint UP-TO-DATE
:loginlib:checkReleaseManifest
:loginlib:preDebugAndroidTestBuild UP-TO-DATE
:loginlib:preDebugBuild UP-TO-DATE
:loginlib:preDebugUnitTestBuild UP-TO-DATE
:loginlib:preReleaseUnitTestBuild UP-TO-DATE
:loginlib:prepareComAndroidSupportAnimatedVectorDrawable2320Library
:loginlib:prepareComAndroidSupportAppcompatV72320Library
:loginlib:prepareComAndroidSupportSupportV42320Library
:loginlib:prepareComAndroidSupportSupportVectorDrawable2320Library
:loginlib:prepareReleaseDependencies
:loginlib:compileReleaseAidl
:loginlib:compileReleaseRenderscript
:loginlib:generateReleaseBuildConfig
:loginlib:generateReleaseAssets UP-TO-DATE
:loginlib:mergeReleaseAssets
:loginlib:generateReleaseResValues
:loginlib:generateReleaseResources
:loginlib:mergeReleaseResources
:loginlib:processReleaseManifest
:loginlib:processReleaseResources
:loginlib:generateReleaseSources
:loginlib:compileReleaseJavaWithJavac
:loginlib:extractReleaseAnnotations
:loginlib:mergeReleaseProguardFiles
:loginlib:packageReleaseRenderscript UP-TO-DATE
:loginlib:packageReleaseResources
:loginlib:processReleaseJavaRes UP-TO-DATE
:loginlib:transformResourcesWithMergeJavaResForRelease
:loginlib:transformClassesAndResourcesWithSyncLibJarsForRelease
:loginlib:mergeReleaseJniLibFolders
:loginlib:transformNative_libsWithMergeJniLibsForRelease
:loginlib:transformNative_libsWithSyncJniLibsForRelease
:loginlib:bundleRelease
:loginlib:install

BUILD SUCCESSFUL

Total time: 40.173 secs

This build could be faster, please consider using the Gradle Daemon: https://docs.gradle.org/2.8/userguide/gradle_daemon.html
Looking for artifacts...
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2
Looking for pom.xml in build directory and ~/.m2
Found artifact: com.github.ziv951011:loginlib:3.0.2
EXIT_CODE=0
2019-03-25T10:56:00.051887375Z
Exit code: 0

Build artifacts:
com.github.ziv951011:LoginLib:3.0.2

Files: 
com/github/ziv951011/LoginLib/3.0.2
com/github/ziv951011/LoginLib/3.0.2/LoginLib-3.0.2-sources.jar
com/github/ziv951011/LoginLib/3.0.2/LoginLib-3.0.2.aar
com/github/ziv951011/LoginLib/3.0.2/LoginLib-3.0.2.pom
com/github/ziv951011/LoginLib/3.0.2/LoginLib-3.0.2.pom.md5
com/github/ziv951011/LoginLib/3.0.2/LoginLib-3.0.2.pom.sha1
com/github/ziv951011/LoginLib/3.0.2/build.log
