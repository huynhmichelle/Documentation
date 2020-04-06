---
layout: default
title: Troubleshooting
nav_order: 98
---

# Troubleshooting 

---

| Symptom  | Probable Cause | Action |
| :------------- | :------------- | :--------- |
| Cannot run Git, getting an error message for an invalid active developer path | X-Code Command Line Developer Tools in Mac needs to be installed or updated | **Click** \[Fix path\] in the error message and follow its prompts
| Cannot resolve symbol 'junit' | JUnit is not configured for current project | **Follow** [Installing JUnit Into The Current Project](https://seungho0106.github.io/Documentation/docs/unittest/#installing-junit-into-the-current-project) |
| Package name does not correspond to the file path | Test files are not in the correct directory. | **Ensure** the downloaded test files are directly under the 'src' folder. |
| The CheckStyle rules file could not be parsed. | CheckStyle version does not match the version of the Checkstyle configuration file. | **Navigate** to \[Preferences\] > \[Other Settings\] > \[Checkstyle\] and try changing your CheckStyle version to 8.0 or lower. |
