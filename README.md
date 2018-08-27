Unit File Support for systemd
-----------------------------

## Introduction

This plugin adds support for [systemd unit files](https://www.freedesktop.org/software/systemd/man/systemd.unit.html#) to IntelliJ. 

## Features🤞
 * Syntax highlighting for unit files
 * Auto-completion for:
   * Option names in a section
   * Boolean options
   * Octal options
   * Some other common options (**KillMode=**, **Type=**, **Restart=**)
 * Inspections
   * Invalid values for boolean options
   * Unknown option in section (ignoring those starting with **X-**)
 * Built-in documentation for options or section name (available when hitting <kbd>CTRL+Q</kbd> or <kbd>F1</kbd> on Mac)   

      
## Usage
To create a file simply right click on a folder and <kbd>New</kbd> > <kbd>File</kbd>, and enter a file name ending any of:
 * `.automount`
 * `.device`
 * `.mount`
 * `.path`
 * `.service`
 * `.slice`
 * `.socket`
 * `.swap`
 * `.target` 
 * `.timer` 
 
The file should then be associated with this plugin and the above features should work.

## Installation

At some point, this plugin should be available at the [JetBrains Plugin Repository](https://plugins.jetbrains.com/),
 in the next release we will update this.

Changelog
--------- 

### [v0.1.0](https://github.com/SJrX/systemdUnitFilePlugin/releases/tag/v0.1.0)

* Initial release


Acknowledgements
----------------
* The documentation is extracted from the systemd source code.
* A number of users of the [IntelliJ Plugin Developers Gitter Room](https://gitter.im/IntelliJ-Plugin-Developers/Lobby) provided a lot of useful advice.
 
## Development Notes

### System Requirements

On top of Java 8, you will need the [m4 macro processor](https://www.gnu.org/software/m4/m4.html) installed on your system and available on the path. 

### Manual Installation

Simply clone the repository, and run 

```bash
./gradlew buildPlugin 
```

Then in IntelliJ navigate to 
```bash
Plugins > Install Plugins From Disk > build/distributions/systemdUnitFilePlugin-X.X-SNAPSHOT.zip
```

### Problems

#### Weird Fonts In Linux

When starting the development IDE if the fonts are poor add the following **ENVIRONMENT VARIABLE** to the run configuration

```bash
_JAVA_OPTIONS=-Dawt.useSystemAAFontSettings\=lcd -Dsun.java2d.renderer\=sun.java2d.marlin.MarlinRenderingEngine
```

Note: If you are using the Gradle *runIde* task it must be passed as an environment variable and not a VM option, because it gets executed in a different VM.

#### SLF4J Errors when running tests

If you see errors related to duplicate SLF4J class bindings available switch the JRE in use from the Default which references IntelliJ, to a native one.  

