
---

# CineClick 
## Movie Ticket Booking System

![banner](https://github.com/user-attachments/assets/616baa7b-50bd-4f5f-9bfd-2be85d52534d)

--
## Overview

**CineClick** is a Java-based desktop application designed to manage movie ticket bookings. The system provides distinct interfaces for administrators and cashiers, facilitating tasks such as user management, movie scheduling, ticket booking, and transaction summaries. This project is an excellent demonstration of a full-stack Java application with a graphical user interface (GUI) and a backend database.

## Project Structure

The project is organized into the following directories and files:

- **`src/`**: Contains the main Java source files and form files for the application logic and interface.
- **`Assets/`**: Houses image assets used in the application's GUI.
- **`database/`**: Contains SQL files required to set up and manage the application’s database.
- **`nbproject/`**: Includes NetBeans project configuration files.
- **`build.xml` and `manifest.mf`**: Apache Ant build script and manifest file for packaging the application.

## Key Features

### Admin Dashboard (`AdminDashboard.java`)
- Manage users, movie schedules, and system summaries.
- View detailed reports of system activities.

### Cashier Dashboard (`CashierDashboard.java`)
- Handle ticket bookings, payments, and transaction histories.
- Streamlined interface for day-to-day cashier operations.

### Home (`Home.java`)
- Main entry point to the application, guiding users to login or access public features.

### Login (`Login.java`)
- Secure user authentication directing to respective dashboards (Admin or Cashier).

### Summary (`Summary.java`)
- Provides summaries or reports on transactions and other system activities.

### User Manager (`UserManager.java`)
- Full-featured user management, allowing administrators to add, modify, or delete user accounts.

## Database Schema

The database schema is defined in the `cineclicktested.sql` file located in the `database/` directory. It includes the following tables:

- **Users**: Stores user information, roles, and credentials.
- **Movies**: Contains movie details, schedules, and screenings.
- **Tickets**: Holds data on booked tickets, including user details and seat numbers.
- **Transactions**: Records all financial transactions processed through the system.

## GUI Design

The graphical user interface is implemented using Java Swing, with design layouts managed by NetBeans form files (`.form`). The application’s visual elements, such as buttons and icons, are stored in the `Assets/` directory.

## Build and Run

### Prerequisites
- **Java Development Kit (JDK)**
- **NetBeans IDE** (Recommended)
- **Apache Ant** (For build automation)

### Building the Project
Use the following command to build the project using Apache Ant:

```bash
ant clean build
```

### Running the Application
After building, run the application using the generated JAR file or directly from the IDE.

## Conclusion

**CineClick** is a comprehensive Java project that exemplifies the development of a desktop application with a robust backend and user-friendly GUI. It's suitable for educational purposes and demonstrates best practices in Java programming, database management, and GUI design.

---

