# BIT2203-AdvancedProgramming-CAT
cat 1 take away 
SAMUEL OBUNGA - SCT221-0555/2024
**// 1. URLParser.java**

// Purpose
This program demonstrates how to use Java's URL class to extract different
parts of a URL.

// What the program does
The program extracts:

- Protocol
- Host
- Port
- Path
- Query parameters
- Fragment

//Main Java class used
The program uses the `java.net.URL` class.

## 2. UniversityDatabase.java

// Purpose
This program demonstrates how Java can connect to a MySQL database using JDBC.

// What the program does

The program:

1. Connects to the `university_db` database.
2. Creates the `courses` table if it does not already exist.
3. Inserts three sample courses.
4. Searches for courses belonging to the Computer Science department.
5. Displays the results.

// Technologies used

- Java
- JDBC
- MySQL
- PreparedStatement

// Database configuration

Database: `university_db`

Username: `admin`

Password: `secure123`

// Important note

The MySQL server must be running before the program is executed.
MySQL Connector/J is also required.

## 3. ShoppingCartServlet.java

// Purpose
This Servlet demonstrates how session management can be used to keep
shopping cart information while a customer moves between different pages.

// How it works

The Servlet uses `HttpSession` to store the shopping cart.

When a customer adds an item, the item is stored in the session. When the
customer opens the cart page, the Servlet retrieves the same cart from the
session.

// Main concepts demonstrated

- Java Servlet
- HttpSession
- doGet()
- doPost()
- Session management

  ## 4. Spring Dependency Injection

// UserService.java

This class represents a Spring service. It receives a `UserRepository`
through constructor injection.

// UserRepository.java

This class represents the repository layer. It is marked with `@Repository`
so that Spring can manage it as a bean.

// AppConfig.java

This class contains the Spring configuration and enables component scanning.

// Main concept

These files demonstrate Dependency Injection in Spring. Instead of
UserService creating UserRepository itself, Spring provides the dependency
through the constructor.

## 5. Java RMI

// TemperatureConverter.java

This interface defines the methods that can be called remotely.

It contains methods for:

- Celsius to Fahrenheit conversion
- Fahrenheit to Celsius conversion

// TemperatureConverterImpl.java

This class implements the remote interface and contains the actual
temperature conversion calculations.

// RMIServer.java

The server creates the RMI registry and registers the temperature conversion
service.

// RMIClient.java

The client connects to the RMI registry, finds the temperature conversion
service and calls its remote method.

// Example

25 degrees Celsius is converted to 77 degrees Fahrenheit.

## 6. LifecycleDemoServlet.java

//Purpose

This program demonstrates the lifecycle of a Java Servlet.

// Lifecycle stages

The program demonstrates:

1. `init()` - called when the Servlet is initialized.
2. `service()` - called when a request is received.
3. `doGet()` - handles a GET request.
4. `destroy()` - called when the Servlet is being removed.

The program also prints messages to the console so that the lifecycle can
be observed.

## 7. Library Management System - MVC

The Library Management System demonstrates the Model-View-Controller
architecture.

# Book.java

This is the Model class. It stores information about a book such as:

- Book ID
- Title
- Author
- Availability

### BookDAO.java

This class is responsible for retrieving book information.

### BookController.java

This Servlet acts as the Controller. It receives the request, gets the
books from BookDAO and forwards them to the JSP page.

### bookList.jsp

This is the View. It displays the list of books to the user in an HTML table.

### MVC flow

User request
    ↓
BookController
    ↓
BookDAO
    ↓
Book data
    ↓
bookList.jsp
    ↓
User

## Requirements

The following software and libraries may be required:

- Java JDK
- MySQL Server
- MySQL Connector/J
- Jakarta Servlet API
- Jakarta JSP/JSTL
- Spring Framework
- A Java web server/container such as Tomcat

Different programs require different dependencies.

## How it can be used by users 

1. Clone or download this repository.
2. Open the Java files in a Java IDE.
3. Configure the required libraries.
4. For the JDBC program, start MySQL and create the required database.
5. For Servlet programs, deploy them to a compatible web container.
6. For the Spring files, configure the required Spring dependencies.
7. For the RMI program, start the RMI server before running the client.

