---
layout: default
title: Setting Up Version Control
nav_order: 2
---

# Setting Up Version Control
{: .no_toc }


---

Introductory description here. 

---

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

---

## Configuring Git Version Control in IntelliJ IDEA
1. **Open** IntelliJ on your computer.<br> 
On Mac, you can do this by clicking the Launchpad icon on the Mac dock.<br>
This will open the "Main Window" of IntelliJ IDEA. You should see the Welcome Screen like the one displayed below.  
2. **Click** \[Create New Project\], which should direct you to a "New Window".<br> 
3. **Check** that Java 13 is added to the `Project SDK` field.
4. **Click** \[Next\] > \[Next\].
5. **Name** your new project in the `Project Name` field in the "New Project Window".
6. **Click** \[Finish\]. This should take you to the following "Main Window" with your new project open.
7. **Click** \[IntelliJ IDEA\] > \[Preferences\] in the toolbar on the top of your screen. <br>
The "Preferences Dialog Window" should appear.<br>
![Note icon](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/note-icon.png?raw=true "Note icon")  **Note**: If you have your "Main Window" in full screen mode, you may need to hover over the top of your computer screen to see the toolbar.<br>
8. **Click** the dropdown icon next to \[Version Control\] > \[Git\] in the left sidebar.
9. **Check** that the path to your Git executable is added. 
10. **Click** [GitHub] in the same dropdown menu > \[Add account\].<br>
A "Log In  to GitHub Dialog Window" will appear.
11. **Enter** your GitHub username and password in the `Login` and `Password` fields.
12. **Click** \[Login\].<br>
If your login is successful, the "Log In to GitHub Dialog Window" will disappear and return you to the "Preferences Window".
13. **Click** \[OK\]. You should now return to the "Main Window".
14. **Click** \[VCS\] in the toolbar located at the top of your screen > \[Import into Version Control\] > \[Create Git Repository\].<br>
A "Finder Dialog Window" will appear.
15. **Check** that your correct project folder is selected.
16. **Click** \[Open\].<br>
A tab called "Version Control" should appear at the bottom-left side of the "Main Window".<br>
Git button options should also appear at the top-right of the "Main Window".
17. **Click** \[VCS\] > \[Import into Version Control\] > \[Share Project on GitHub\].<br>
A "Share Project on GitHub Dialog Window" will display. You can check or uncheck the checkbox next to `Private` depending if you want your project repository to be private or public on GitHub.
18. **Click** \[Share\].<br>
An "Add Files for Initial Commit Dialog Window" will be displayed.
19. **Select** the files that you want initially added to your GitHub project repository.<br>
The .idea files do not need to be added.<br>
You can edit the message in the `Commit Message` field.
20. **Click \[Add\].<br>
At the bottom right of your screen, you will see a message similar to the following. 

---

## Committing and Pushing Changes of Your Work