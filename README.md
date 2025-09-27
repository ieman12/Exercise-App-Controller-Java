# Exercise App with Controller (Java)

This Java project models an exercise app that tracks downloads and the highest step count.  
It also includes a `Controller` class that links a manager to each app.

This was part of my Programming 1 coursework and helped me practise **accessor/mutator methods**, **object interaction**, and **basic class design** in Java.

## Features
- Store app title, objective, and download cost
- Track total number of downloads
- Record highest step count and player name
- Calculate total earnings based on downloads
- Associate each app with a Controller (manager)
- Print a detailed report including all app stats

## Technologies
- Java
- BlueJ IDE

## How to Run
1. Open this project in **BlueJ**
2. Create a `Controller` object (e.g. `new Controller("Jones", "CTRL1")`)
3. Create an `App` object and pass in title, objective, cost, and controller
4. Call methods such as:
```java
app.download();
app.checkStepCount(15000, "Laura M");
app.printReport();

