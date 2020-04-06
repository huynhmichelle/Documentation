---
layout: default
title: Configuring CheckStyle
nav_order: 3
---

# Configuring CheckStyle
{: .no_toc }


---

[CheckStyle](https://checkstyle.sourceforge.io/) is a tool to help developers write Java code that adheres to a particular coding convention. CheckStyle analyzes the code to check for certain rules, such as formatting and code layout, and alerts any issues to the developer. As a result, projects that utilize CheckStyle have easily-readable and well-formatted code.

Each CheckStyle configuration file (.xml) has their own unique rulesets defined. Developers can choose to use the bundled configuration files or customized configuration files.

This section will examine how to integrate CheckStyle into your IntelliJ IDEA and run CheckStyle tests against your code.

---

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

---

## Installing CheckStyle-IDEA Plugin
This instruction set contains steps to install the CheckStyle-IDEA plugin needed to run CheckStyle on IntelliJ IDEA.

1. **Open** IntelliJ IDEA to a new project.

2. **Click** on \[IntelliJ IDEA\] > \[Preferences\] from the toolbar at the top of your screen. A new "Preferences Window" should appear.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc4.png?raw=true)

3. In the "Preferences Window", **click** on \[Plugins\] on the left side. **Check** \[Marketplace\] is highlighted at the top of the "Preferences Window", and **type** `CheckStyle-IDEA` in the search bar.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/checkstyle/checkstyle01.png?raw=true){: style="width: 90%" }

4. **Click** on \[Install\] and **wait** for the download to finish.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/checkstyle/checkstyle02.png?raw=true){: style="width: 50%" }

5. **Restart** the IntelliJ IDEA by **clicking** on \[Restart IDE\].<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/checkstyle/checkstyle03.png?raw=true){: style="width: 50%" }

6. After the IntelliJ IDEA has reloaded, **navigate** to \[Preferences\] > \[Plugins\] and **click** on \[Installed\].<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/checkstyle/checkstyle04.png?raw=true)

7. **Ensure** CheckStyle-IDEA is enabled with a check mark. You should also see \[CheckStyle\] near the bottom-left corner of the "Main Window".<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/checkstyle/checkstyle05.png?raw=true){: style="width: 50%" }<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/checkstyle/checkstyle06.png?raw=true){: style="width: 50%" }

![Caution Icon](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/caution-icon.png?raw=true){: style="float:left; margin: 0px 5px; width: 32px;" }
**Caution**: Make sure CheckStyle-IDEA is enabled before you proceed to the next section.<br>

Now you have successfully installed CheckStyle-IDEA to your IntelliJ IDEA.

---

## Running CheckStyle Tests
 Let's try running a few CheckStyle tests to determine how clean our code is. We will first configure which CheckStyle rules to enforce for the current project. 

1. **Navigate** to \[IntelliJ IDEA\] > \[Preferences\] > \[Other Settings\] > \[Checkstyle\].<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/checkstyle/checkstyle07.png?raw=true){: style="width: 90%" }<br>

2. Under 'Configuration File', **click** the checkbox next to the desired CheckStyle configuration file. For now, **check** 'Sun Checks' and **click** on \[Apply\] > \[OK\] to **save** the settings and **close** the "Preferences Window".<br>
![Note Icon](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/note-icon.png?raw=true){: style="float: left; margin: 0px 5px; width: 32px" }
**Note**: If you wish to add a customized CheckStyle configuration file, click on \[+\] under 'Configuration File'.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/checkstyle/checkstyle08.png?raw=true){: style="width: 90%" }<br>

3. **Download** the <a href="https://raw.githubusercontent.com/seungho0106/Documentation/gh-pages/assets/images/checkstyle/CheckStyle.java" download>CheckStyle.java</a> file and add it to your project directory. The file should appear on the left side of the IntelliJ IDEA.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/checkstyle/checkstyle09.png?raw=true){: style="width: 40%" }<br>
![Note Icon](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/note-icon.png?raw=true){: style="float: left; margin: 0px 5px; width: 32px" }
**Note**: If the project navigation bar is hidden, try clicking on \[1: Project\] on the left side.<br>

4. **Open** the CheckStyleTest.java file by double-clicking on the file name. Once you select the file to test, **run** the tests by clicking on \[CheckStyle\] at the bottom, then the green play button.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/checkstyle/checkstyle10.png?raw=true)<br>
CheckStyle will now begin to analyze the selected file.

5. After analysis is complete, CheckStyle will inform you of all the violated standard checks. For CheckStyleTest.java, there should be a few standard check errors including 'LocalVariableName' and 'MagicNumber'.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/checkstyle/checkstyle11.png?raw=true)<br>
![Note Icon](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/note-icon.png?raw=true){: style="float: left; margin: 0px 5px; width: 32px" }
**Note**: For more information on standard check errors, the official documentation can be found [here](https://checkstyle.sourceforge.io/checks.html).

Now you can use CheckStyle to detect any stylistic errors and write consistent code throughout your project.

Another commonly used feature of IntelliJ is [unit testing](https://seungho0106.github.io/Documentation/docs/unittest/).
