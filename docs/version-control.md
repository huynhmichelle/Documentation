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

## Configuring Git Version Control for a New Project in IntelliJ IDEA
This section will go through the steps for creating a new IntelliJ IDEA project folder and a Git repository for the new project. This section will also cover the steps for sharing the newly created project repository on GitHub.

1. **Open** IntelliJ on your computer.<br> 
On Mac, you can do this by clicking the Launchpad icon on the Mac dock.<br>
This will open the "Main Window" of IntelliJ IDEA. You should see the welcome screen like the one displayed below.<br>
![IntelliJ IDEA welcome screen](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc1.png?raw=true "IntelliJ IDEA welcome screen")
2. **Click** \[Create New Project\] which should direct you to a "New Window".<br> 
3. **Check** that Java 13 is added to the 'Project SDK' field.<br>
![Project SDK field](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc2.png?raw=true "Project SDK field")
4. **Click** \[Next\] > \[Next\].
5. **Name** your new project in the 'Project Name' field in the "New Project Window".<br>
![Project name field](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc3.png?raw=true "Project name field")
6. **Click** \[Finish\]. This should take you to the following "Main Window" with your new project open.
7. **Click** \[IntelliJ IDEA\] > \[Preferences\] in the toolbar on the top of your screen.<br>
![Toolbar 1](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc4.png?raw=true "Toolbar 1")<br>
The "Preferences Dialog Window" should appear.<br>
![Note icon](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/note-icon.png?raw=true "Note icon")  **Note**: If you have your "Main Window" in full screen mode, you may need to hover over the top of your computer screen to see the toolbar.<br>
8. **Click** the dropdown icon next to \[Version Control\] > \[Git\] in the left sidebar.
![Sidebar 1](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc5.png?raw=true "Sidebar 1")<br>
![Sidebar 2](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc6.png?raw=true "Sidebar 2")
9. **Check** that the path to your Git executable is added. 
![Git executable field](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc7.png?raw=true "Git executable field")
10. **Click** [GitHub] in the same dropdown menu > \[Add account\].<br>
![Add GitHub account](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc8.png?raw=true "Add GitHub account")<br>
A "Log In  to GitHub Dialog Window" will appear.
11. **Enter** your GitHub username and password in the 'Login' and 'Password' fields.
12. **Click** \[Login\].<br>
If your login is successful, the "Log In to GitHub Dialog Window" will disappear and return you to the "Preferences Window".
13. **Click** \[OK\]. You should now return to the "Main Window".
14. **Click** \[VCS\] in the toolbar located at the top of your screen > \[Import into Version Control\] > \[Create Git Repository\].<br>
![Toolbar 2](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc9.png?raw=true "Toolbar 2")<br>
A "Finder Dialog Window" will appear.
15. **Check** that your correct project folder is selected.<br>
![Finder window](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc10.png?raw=true "Finder window")
16. **Click** \[Open\].<br>
When your Git repository is successfully created, a tab called 'Version Control' should appear at the bottom-left side of the "Main Window".<br>
![Version control tab](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc11.png?raw=true "Version control tab")<br>
'Git' button options should also appear at the top-right of the "Main Window".<br>
![Git button options](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc12.png?raw=true "Git button options")
17. **Click** \[VCS\] > \[Import into Version Control\] > \[Share Project on GitHub\].<br>
A "Share Project on GitHub Dialog Window" will display. You can check or uncheck the checkbox next to 'Private' depending if you want your project repository to be private or public on GitHub.
![Share Project on GitHub](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc13.png?raw=true "Share Project on GitHub")
18. **Click** \[Share\].<br>
An "Add Files for Initial Commit Dialog Window" will be displayed.
19. **Select** the files that you want initially added to your GitHub project repository.<br>
The .idea files do not need to be added.<br>
![Add Files for Initial Commit Dialog Window](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc14.png?raw=true "Add Files for Initial Commit Dialog Window")<br>
You can edit the message in the 'Commit Message' field.<br>
![Add Files for Initial Commit Dialog Window 2](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc15.png?raw=true "Add Files for Initial Commit Dialog Window 2")
20. **Click** \[Add\].<br>
At the bottom right of your screen, you will see a message similar to the following image.
![Notification](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc16.png?raw=true "Notification")

Upon completion of these steps, you can now see your new repository on GitHub. You can now create files in your new project in the IDE and add them to your Git repository.

---

## Committing and Pushing Changes of Your Work
When you have a new Git project repository and some files that you are working on, there may be changes that you want to save. Each time you *commit* your work for a file through Git, there will be a new version of the file recorded in your version history. If you only commit changes through Git, they will only be recorded in your local machine. When you *push* your changes, the commits that you made through Git will be reflected on your online GitHub too.  

This section will present steps for making commits and pushing commits in your IntelliJ IDE.  

1. **Click** \[VCS\] > \[Commit\].<br>
![Toolbar 3](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc17.png?raw=true "Toolbar")<br>
A "Commit Changes Dialog Window" will display.
2. **Select** all the source files with changes that you want committed.<br>
![Commit Changes Dialog Window 1](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc18.png?raw=true "Commit Changes Dialog Window 1")
3. **Write** a commit message in the 'Commit Message' input field that describes the changes you have made to the selected files.<br>
![Commit Changes Dialog Window 2](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc19.png?raw=true "Commit Changes Dialog Window 2")
4. **Select** whether you want to commit or commit and push your changes.
    * **Click** \[Commit\] if you want your commits to be made only on your local computer.
    * **Select** the dropdown icon next to \[Commit\] and click \[Commit and Push\] > \[Push\] if you want your commits published to GitHub.<br>
    ![Commit and Push button](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/version-control/vc20.png?raw=true "Commit and Push button")<br>
    You can now visit your GitHub account and navigate to your project repository to see the commits that you have pushed.

Upon completion of these steps, you now have an understanding of how to regularly commit and push changes you make to your work.