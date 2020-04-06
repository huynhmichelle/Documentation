---
layout: default
title: Unit Testing With JUnit
nav_order: 4
---

# Unit Testing
{: .no_toc }


---

*Unit testing* is a testing method where small units of source code (i.e. classes, methods) are verified for its expected behavior. Once a unit test is implemented for a specific test case, the same test can be reused over and over again. As a result, unit testing is essential for efficient software development.

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
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest01.png?raw=true){: style="width: 50%" }<br>
![Note Icon](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/note-icon.png?raw=true){: style="float:left; margin: 0px 5px; width: 32px;" }
**Note**: This option only installs JUnit to the current project. To install JUnit for all future projects, navigate to \[File\] > \[Other Settings\] > \[Structure for New Projects...\].<br>

2. **Click** on \[Modules\] > \[Dependencies\] to display dependencies installed in the current project.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest02.png?raw=true){: style="width: 90%" }<br>

3. **Click** on \[+\] > \[Library...\] > \[From Maven...\] at the bottom of the "Project Structure Window" to add a new dependency to the current project.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest03.png?raw=true){: style="width: 60%" }<br>

4. In the search box, **type** `junit:junit:4.13`, then **click** \[OK\].<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest04.png?raw=true){: style="width: 60%" }<br>
A new "Configure Library Window" should pop up. Enter a 'Name' for the library \(e.g. `JUnit (v4.13)`\) and **click** \[OK\] until you exit to the "Main Window".<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest05.png?raw=true){: style="width: 40%" }<br>

5. **Download** <a href="https://raw.githubusercontent.com/seungho0106/Documentation/gh-pages/assets/images/unittest/MyDivision.java" download>MyDivision.java</a> and <a href="https://raw.githubusercontent.com/seungho0106/Documentation/gh-pages/assets/images/unittest/MyDivisionTest.java" download>MyDivisionTest.java</a> and add the two files to your project folder. **Select** MyDivisionTest.java from the left pane and **check** for any errors. If the installation was successful, there should be no errors with the file.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest06.png?raw=true){: style="width: 90%" }<br>
![Caution Icon](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/caution-icon.png?raw=true){: style="float: left; margin: 0px 5px; width: 32px;" }
**Caution**: Make sure JUnit is correctly installed in your current project and that MyDivision.java and MyDivisionTest.java are added to your project folder. <br>

---

## Writing Unit Tests
Now we will analyze a simple unit test to help us understand the code structure of unit tests. Afterwards, we will modify the code to test another *test case*.<br>

<a href="https://raw.githubusercontent.com/seungho0106/Documentation/gh-pages/assets/images/unittest/MyDivision.java" download>MyDivision.java</a> is a basic class with a single method defined, called 'divide'. The method receives two parameters and returns the quotient of the given number.

<a href="https://raw.githubusercontent.com/seungho0106/Documentation/gh-pages/assets/images/unittest/MyDivisionTest.java" download>MyDivisionTest.java</a> is a test suite for MyDivision.java. Please refer to the diagram below.<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest07.png?raw=true){: style="width: 90%" }<br>
1. Import statements - we need to import at least '@Test' annotations and 'assert' statements to run any test\(`import org.junit.Test` and `import static org.junit.Assert.*;`, respectively\).
2. '@Test' annotation - these annotations signal to the *compiler* that the *method* defined below is a *test case* for unit testing.
3. Assert statements - tests whether given values fall under the provided condition (e.g. 'assertEquals' tests whether the given values are equal).

If we take a look inside the 'testDivideReturnsCorrectQuotient' method, it checks whether the result of 4 divided by 2 is equivalent to 2. Since 4 divided by 2 does indeed equal 2, the test should pass without failure when we run it. Go ahead and try running the test by **right-clicking** on \[MyDivisionTest.java\] and **clicking** on \[Run 'MyDivisionTest'\].<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest08.png?raw=true){: style="width: 60%" }<br>

The following result should display:<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest09.png?raw=true){: style="width: 90%" }<br>


We can add a new test case to the current test suite. Let's **copy** the 'testDivideReturnsCorrectQuotient' method \(highlighted in the image below\) and **rename** the method to 'testDivideByZero'. MyDivisionTest.java should look like below.<br>
<div class="code-example" markdown="1">
```java
    @Test
    public void testDivideByZero() {
        MyDivision myDivisionClass = new MyDivision();
        final int expected = 0;
        final int result = myDivisionClass.divide(4, 0);
        assertEquals(expected, result);
    }
```
</div>

If we change the second parameter of 'myDivisionClass.divide' to `0`, then what will our outcome be? Try **running** the test and see for yourself.

The test results should be as following:<br>
![](https://github.com/seungho0106/Documentation/blob/gh-pages/assets/images/unittest/unittest10.png?raw=true){: style="width: 90%" }<br>
We can see that the test we just defined failed due to an 'ArithmeticException'. In this case, a division by zero is undefined. Therefore, the program could not handle the situation, threw an *exception*, and crashed. Failed tests identify the problem in our code. In this case, an exception is thrown when the second parameter is `0`.

To ensure the test passes, we should modify our 'divide' method inside MyDivision.java for special cases when the divisor is `0`. Let's assume all division by `0` should return `0` and modify our method to the following:
<div class="code-example" markdown="1">
```java
	public int divide(int dividend, int divisor) {
		if (divisor == 0) {
			return 0;
		}
        return dividend / divisor;
    }
```
</div>
If we run the test again, both tests should pass without failure. Through failed tests, we were able to correct our code. Now you should have a better understanding of how to create unit tests.

