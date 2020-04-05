---
layout: default
title: Unit Testing With JUnit
nav_order: 4
---

# Unit Testing
{: .no_toc }


---

Unit testing is a testing method where small units of source code (i.e. classes, methods) are verified for its expected behavior. Once a unit test is implemented for a specific test case, the same test can be reused over and over again. As a result, unit testing is essential for efficient software development.

For Java, JUnit is the golden standard testing framework. As such, we will use JUnit \(v4.13\) to implement our unit tests.

This section will examine how to install JUnit \(v4.13\) into the current project and write simple unit tests using JUnit.

---

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

---

## Installing JUnit Into The Current Project
This instruction set will install the JUnit \(v4.13\) *dependency* needed to write unit tests in IntelliJ IDEA.

1. **Navigate** to \[File\] > \[Project Structure...\]. A new "Project Structure Window" should appear.<br>
![Note Icon](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/note-icon.png?raw=true){: style="float:left; margin: 0px 5px; width: 32px;" }
**Note**: This option only installs JUnit to the current project. To install JUnit for all future projects, navigate to \[File\] > \[Other Settings\] > \[Structure for New Projects...\].<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest01.png?raw=true){: style="width: 50%" }<br>

2. **Click** on \[Modules\] > \[Dependencies\] to display dependencies installed in the current project.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest02.png?raw=true){: style="width: 90%" }<br>

3. **Click** on \[+\] > \[Library...\] > \[From Maven...\] at the bottom of the "Project Structure Window" to add a new dependency to the current project.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest03.png?raw=true){: style="width: 50%" }<br>

4. In the search box, **type** `junit:junit:4.13`, then **click** \[OK\].<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest04.png?raw=true){: style="width: 50%" }<br>
A new "Configure Library Window" should pop up. Enter a 'Name' for the library \(e.g. `JUnit (v4.13)`\) and **click** \[OK\] until you exit to the "Main Window".<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest05.png?raw=true){: style="width: 30%" }<br>

5. **Download** <a href="https://raw.githubusercontent.com/seungho0106/Documentation/gh-pages/assets/images/unittest/MyDivision.java" download>MyDivision.java</a> and <a href="https://raw.githubusercontent.com/seungho0106/Documentation/gh-pages/assets/images/unittest/MyDivisionTest.java" download>MyDivisionTest.java</a> and add the two files to your project folder. **Select** MyDivisionTest.java from the left pane and **check** for any errors. If the installation was successful, there should be no errors with the file.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest06.png?raw=true){: style="width: 60%" }<br>
![Caution Icon](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/caution-icon.png?raw=true){: style="float: left; margin: 0px 5px; width: 32px;" }
**Caution**: Make sure JUnit is correctly installed in your current project and MyDivision.java and MyDivisionTest.java are added to your project folder. <br>

---

## Analyzing Unit Tests
Now we will analyze a simple unit test to help us understand the code structure of unit tests.<br>

Please refer to the following diagram:
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest07.png?raw=true){: style="width: 60%" }<br>

1. Import statements - these two statements are the bare minimum we need in order to run any kind of un


We have seen both passed and failed test cases. Now it's time to write more unit tests!

