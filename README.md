# Cellar Driver

This repository was made as part of my [wine cellar monitoring system](https://lengrand.fr/building-a-wine-cellar-monitoring-system-part-1-the-hardware/).

Because this setup uses hardware and requires compiling C code, I decided to make a separate repository for it and publish it separately.

__Disclaimer : This thing was made for personal usage and is linked to specific versions of Raspberry and Raspbian__  

## What this thing does

I'll most likely write more about it soon but in short this thing :

* Uses a driver that is coming from a Python Adafruit library to interact with the dht11
* Creates a simple JNI bridge for the library
* Compiles a native library for the pi using Github Actions
* Creates a jar file that embeds the native library and uses it in a temp folder when triggered to avoid needing custom installation
* Publishes the jar on Github.

This artifact will be used as part of the larger [Cellar](https://github.com/jlengrand/cellar) project.

## Notes

To use this package in cellar, follow [this doc](https://docs.github.com/en/packages/using-github-packages-with-your-projects-ecosystem/configuring-apache-maven-for-use-with-github-packages#authenticating-to-github-packages).

## Acknowledgments 

* [abhiTronix and its excellent cross compilers](https://github.com/abhiTronix/raspberry-pi-cross-compilers/wiki/Cross-Compiler:-Installation-Instructions#c-extracting-and-linking-binary)
* [Adam Heinrich](https://www.adamh.cz/blog/2012/12/how-to-load-native-jni-library-from-jar/) for his `NativeLoader` helper class
* [The helpful Github Actions docs](https://docs.github.com/en/actions/language-and-framework-guides/publishing-java-packages-with-maven#publishing-packages-to-github-packages)
