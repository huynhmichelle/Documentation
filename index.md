---
layout: default
title: Introduction
nav_order: 1
description: "Just the Docs is a responsive Jekyll theme with built-in search that is easily customizable and hosted on GitHub Pages."
permalink: /
---

# Introduction
{: .no_toc }

---

The objective of this documentation is to help you get started with using IntelliJ IDEA, an *integrated development environment (IDE)* provided by JetBrains.  

IntelliJ IDEA is an IDE for users to write *code* and develop software in the Java programming language. IntelliJ IDEA has features that can assist users in their development experience.  

In this guide, there will be walkthroughs for setting up three useful features in IntelliJ IDEA: *version control*, the Checkstyle *plugin*, and *unit tests*. 

---

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

---

## Is This Guide for You?
This guide is intended for users with basic computer skills and users that are interested in or starting to learn Java. This guide is also intended for users that are interested in or just starting out with using IntelliJ IDEA.  

This guide will provide you with step-by-step instructions to set up three key tools in IntelliJ IDEA. These tools can improve your coding experience with using the IDE.

By the end of this guide, you will learn how to use IntelliJ IDEA to
- set up version control to help you track changes to your Java code
- set up a plugin called Checkstyle to help ensure that your code adheres to common rules 
- set up unit tests to help you examine the function of particular parts of your code.

---

## Software Versions
This guide uses IntelliJ IDEA version 2019.3 and Java 13, specifically for desktop computers or laptops with a Mac operating system.  

If your computer does not have IntelliJ IDEA, you can download the latest version [here](https://www.jetbrains.com/idea/download/). 

You can also install Java 13 [here](https://www.oracle.com/java/technologies/javase-jdk13-downloads.html).

---

## Prerequisites
Before proceeding to the instructions in this guide, there are requirements that need to be met. Other than IntelliJ IDEA and Java 13, you will need
-	a computer with the Mac operating system installed
-	a mouse or trackpad and a keyboard connected to your computer
-	a connection to the Internet
-	a web browser installed on your computer (e.g. Google Chrome, Firefox)
-	an email account
- a [JetBrains](https://account.jetbrains.com/login) account.

If you are interested in setting up version control through IntelliJ IDEA, you will also need
- a [Github](https://github.com/) account
- an installation of [Git](https://git-scm.com/downloads).

---

## Mouse Conventions
The use of **click** throughout this documentation will refer to the action that you will perform to execute a computer event such as selecting a button.

Any uses of **click** in the instructions will refer to a left click of a computer mouse or a tap of a track pad with a single finger. **Right-clicks**, done through clicking the right button of the mouse or a tap of the track pad with two fingers, will be explicitly indicated. 

---

## Typographic Conventions
The instructions in this document use the following typographic conventions:<br>

| Convention Description  | Example |
| :------------- | :------------- |
| Commands:<br><br>Bolded words found in the body of the documentation represent an action that you will need to carry out.  | **Save**, **Return**, **Click**, **Press**, **Type**, **Exit**  |
| Text field:<br><br>Text field prompts that require input will be presented in a *monospace font*. | `Enter your name`, `Commit message`  |
| Key terms:<br><br>Important terms will be italicized. These terms are also defined in the Glossary. | *Integrated development environment*, *Dialog window* |
| Button sequence:<br><br>Buttons that you will need to click will have its name enclosed with opening and closing square brackets. For a sequence of button clicks, there will be a > symbol found between the two buttons. This symbol represents the successive order of the flow of buttons.<br><br>The flow of buttons will be starting from the left and will move sequentially to the right. | \[Start\] > \[File\] > \[Settings\]  | 
| Main and *dialog windows*:<br><br>Window names will be enclosed in opening and closing quotation marks. The final word before the closing quotation marks is “Window”.<br><br>Note that the word “Window” may not actually appear in the window’s title bar but is just a marker in the documentation for windows. | "New Dialog Window" |

<img src="assets/images/exclamation-icon.png" alt= "Note of exclamation icon" width="50" style="float:left; margin: 0px 5px;"/>

**Note**: This is a note icon. When this icon appears in the documentation, it indicates that you should pay close attention to the information that follows.

---

## Conclusion
With IntelliJ IDEA's tools for code analysis, various plug-ins, and support for numerous other languages and frameworks outside of Java, users can customize their IDE to fit their distinct programming needs.  

This documentation will go through steps to set-up your IDE with features that can help you begin your experience working with IntelliJ IDEA.

We recommend that you start with [Setting Up Version Control](https://seungho0106.github.io/Documentation/docs/version-control).