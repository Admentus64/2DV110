------------------
--- Assignment ---
------------------

Assignment 1 is started.



---------------
--- Project ---
---------------

Project is based on: http://echobase.freeiz.com/sticks/.
Link found through https://coursepress.lnu.se/kurs/mjukvarutestning/labs/assignment-2-xunit-testing/
Source code is written myself, as no knowledge of existing code is found.
The project contains a small game wherein the user chooses to draw between 1 or 3 sticks.
Afterwards, a computer opponent draws between 1 or 3 sticks. Then this repeats until last stick is drawn.
For now, the project contains 30 sticks to draw. The player that must draw the last stick loses.



-------------
--- Notes ---
-------------

JUnit works smoothly without any conflicts, no further notes required.
Code Coverage works, however not in combination with JUNit. Therefore CodeCover is used separately with the main method.
The main method will be adjusted so it can run the program manual and perform extra tests without the use of JUNit.
Mocking is used for a few instances, mostly when trying to test the game without the need for user input.
The java class Main and the JUnit test GameTests make use of Mocking through the Mockito library.
GitHub is used for storage of the project.
Link found through: https://github.com/DevRobDev/2DV110/tree/master/Assignment%201



---- ---------------------
--- Source folder: src ---
--------------------------

This folder contains the java classes for the project itself.
The files are in order:
AI.java			An extended class of Player, used for having a computer controlled player.

-----------------------------
--- Current Progress Done ---
-----------------------------

Writing untested source code for project.
Testing JUnit with prototype example tests.
Restarting project.



------------
--- TODO ---
------------

Writings tests for each function.
Rewriting the program again, with one function a time to test.
More items will be listed here.