
# Theme Park Ticket Generator   

During this 21st century, the main purpose of every amusement park, theme park, water park, or family fun center is to have a good time. As we know, there are some popular theme parks in our country like LEGOLAND Malaysia, Sunway Lagoon, Berjaya Times Square Theme Park, ESCAPE Penang and many more that people visit to go to enjoy themselves whether with their friends or family members. Dealing with a ticketing system that is not up to par, on the other hand, can be problematic.   

Therefore, this project has been conducted to determine the needs to develop an efficient theme park ticket generator, to determine the most suitable method to be used to develop the theme park ticket generator and to briefly express the ideas on how the ticket generator can be used at any theme park intelligently.    




## Features

- Visitor can enter the name and the number of adult ticket and children ticket
- Visitor can see the price of the single ticket and the total amount of purchased ticket(s)
- Visitor can view the preview of the ticket before it can be printed
- The ticket can be printed once the visitor pay the ticket (pretend it can be printed, because the print feature is not our main purposes of the project)


## Installation

To install and use this system, kindly download the zip folder (themeparkticket.zip) and this system is ready to run and test.


## Run Locally

- Firstly, you need to have [JDK](https://www.oracle.com/java/technologies/downloads/) installed in your local machine. Preferred to use JDK with version 18 or above.
- You need to have MySQL database server. Please use MySQL that come with [XAMPP](https://www.apachefriends.org/download.html). Otherwise, please refer next section below if you want to use [standalone MySQL](https://www.mysql.com/downloads/).
- Please make sure that MySQL is started/opened. If not the system will not run correctly.
- Extract the themeparkticket.zip and open the Theme Park Ticket folder inside themeparkticket after extraction.
- Open the terminal or command line, make sure that the current directory is Theme Park Ticket folder.
- Inside the terminal, type `java --enable-preview -jar "Theme Park Ticket.jar"`
- Then, the system can be executed successsfully.

    
## Run with standalone MySQL database server

- MySQL database server would ask the user about the username and password. So it will be different from our original source code that use 'root' as the username and empty string or '' as the password. By default, this is the username and password for the MySQL in XAMPP.
- This system is fully developed in [Visual Studio Code](https://code.visualstudio.com/) as an IDE (Integrated Development Environment). Hence, you must have downloaded Visual Studio Code in your machine.
- Open the Visual Studio Code, in the left side bar, click extensions tab and find the 'Extension Pack for Java' provided by Microsoft. Download that extension for Java development purposes.
- After that, open the Visual Studio Code in the Theme Park Ticket folder. You can open it by click File > Open Folder at the top panel.
- Open the MySQL.java and change the username and password of your MySQL database.
- At the top panel, click View > Command Palette, type 'Java: Export Jar' and choose the correct one.
- Select 'Main' and Select all elements and click 'Ok'.
- The 'Theme Park Ticker.jar' successfully compiled. To run it, open the terminal or command line, make sure that the current directory is Theme Park Ticket folder.
- Inside the terminal, type `java --enable-preview -jar "Theme Park Ticket.jar"`
- Then, the system can be executed successsfully.
     
## Lessons Learned

Throughout this project, we have learn a lot more about the Object Oriented Features like object and classes and also about GUI components in Swing. When at the development process, we have faced a lot of problems and we decide to come out with communication and good discussion with all group members. 
