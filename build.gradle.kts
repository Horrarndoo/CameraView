
buildscript {

    extra["minSdkVersion"] = 15
    extra["compileSdkVersion"] = 31
    extra["targetSdkVersion"] = 31

    repositories {
        google()
        mavenCentral()
        maven("https://maven.aliyun.com/repository/central")
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/jcenter")
        maven("https://jitpack.io")
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.0.3")
        classpath("io.deepmedia.tools:publisher:0.6.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")

    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.aliyun.com/repository/central")
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/jcenter")
        maven("https://jitpack.io")
    }
}

tasks.register("clean", Delete::class) {
    delete(buildDir)
}