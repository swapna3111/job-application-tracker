# Job Application Tracker

A full-stack web application built to help job seekers organize and track their job applications in one place.

## Features

- Add job applications with company name, job role, application date, status, and notes.
- View all saved applications.
- Edit application details and update application status.
- Delete applications.
- Filter applications by status.
- Dashboard showing total applications, interviews, and selected applications.
- Store application data in a MySQL database.

## Technologies Used

- **Frontend:** HTML, CSS, JavaScript
- **Backend:** Java, Spring Boot
- **Database:** MySQL
- **Data Access:** Spring Data JPA, Hibernate
- **Build Tool:** Maven
- **Development Tools:** Visual Studio Code, MySQL Workbench

## Prerequisites

Install Java 21 or a compatible configured JDK, MySQL Server, and Maven (or use the included Maven Wrapper).

## Setup and Run

1. Clone this repository:

   ```bash
   git clone https://github.com/swapna3111/job-application-tracker.git
   cd job-application-tracker
   ```

2. Create the database in MySQL:

   ```sql
   CREATE DATABASE job_tracker_db;
   ```

3. Configure `src/main/resources/application.properties` with your local MySQL connection settings. Set your database password using the `DB_PASSWORD` environment variable; do not commit passwords or other secrets.

4. Run the application from the project folder on Windows:

   ```cmd
   set DB_PASSWORD=your_local_mysql_password
   mvnw.cmd spring-boot:run
   ```

5. Open the application in your browser:

   http://localhost:8080

## Project Structure

```text
src/main/java/com/swapna/jobtracker/
├── controller/
├── model/
├── repository/
└── JobtrackerApplication.java

src/main/resources/
├── static/
│   └── index.html
└── application.properties
```

## Future Enhancements

- User registration and login
- Search applications by company or role
- Reminders for interviews and follow-ups
- Deployment to a cloud platform
