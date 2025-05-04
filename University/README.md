# University Workshop Management System

A Spring Boot application for managing university workshops, sessions, and participants.

## Overview

The University Workshop Management System (WMS) is designed to facilitate the organization and management of academic workshops. It allows tracking of:

- Workshops and their details
- Workshop sessions
- Presenters
- Undergraduate participants
- Postgraduate participants

## Technical Stack

- **Framework**: Spring Boot
- **Database**: MySQL
- **ORM**: Hibernate/JPA
- **Language**: Java

## Database Configuration

The application connects to a MySQL database with the following configuration:

```properties
spring.application.name=University
spring.datasource.url=jdbc:mysql://localhost:3306/WMS
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
```

## Data Model

### Core Entities

1. **Person** (MappedSuperclass)
   - Base class for all person entities
   - Fields: email, gender, name, phone

2. **Workshop**
   - Represents a workshop event
   - Fields: id, name, description, start_date, end_date

3. **Session**
   - Represents individual sessions within workshops
   - Fields: id, name, description, date, time, workshop_id
   - Relationships: Many-to-Many with presenters, undergraduates, and postgraduates

4. **Presenter**
   - Extends Person
   - Fields: id, affiliation, country, job_title
   - Relationships: Many-to-Many with sessions

5. **Undergraduate**
   - Extends Person
   - Fields: id, degree, university
   - Relationships: Many-to-Many with sessions

6. **Postgraduate**
   - Extends Person
   - Fields: id, institute, research_interest, second_degree
   - Relationships: Many-to-Many with sessions

## Setup Instructions

### Prerequisites

- Java 17+ (or appropriate version)
- MySQL Server
- Maven or Gradle

  

## output

![Screenshot (1100)](https://github.com/user-attachments/assets/c070b3e4-c0b7-4365-b2ee-51c3f23ed453)


![Screenshot (1101)](https://github.com/user-attachments/assets/a58a1e7d-710b-4e0c-8007-55e45b1727d8)

![Screenshot (1102)](https://github.com/user-attachments/assets/91b1b8d2-50a6-4024-8663-014aa36b6153)
