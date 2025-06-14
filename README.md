# Educational System

This project is an educational system developed with **Spring Boot** and organized into four main layers to ensure maintainability and scalability: **controller**, **dto**, **model**, and **repository**. Additionally, it includes automatically generated documentation using **SpringDoc OpenAPI**.

## Features

- Registration and management of Students, Teachers, Courses, Classes, Subjects, Enrollments, and Grades.
- Student report card view.
- Performance calculation for subjects and classes.
- REST endpoints for CRUD operations.
- Swagger documentation accessible via browser.

## Project Structure

### Layers

1. **Controller**: Contains backend endpoints, implementing methods for GET, POST, PUT, and DELETE.
2. **DTO**: Contains Data Transfer Objects (requests and responses) to handle and return specific information in HTTP requests.
3. **Model**: Contains classes that represent the system entities.
4. **Repository**: Contains interfaces extending the JPA library to handle database operations.

## Technologies Used

- **Spring Boot**
- **Spring Data JPA**
- **Flyway**
- **MySQL**
- **SpringDoc OpenAPI** (version 2.6.0)

## Available Endpoints

Access the Swagger documentation to explore all endpoints:

http://localhost:8080/swagger-ui/index.html


### Main Controllers

#### Professor Controller

- `GET /api/professores`
- `POST /api/professores`
- `GET /api/professores/{id}`
- `PUT /api/professores/{id}`
- `DELETE /api/professores/{id}`

#### Subject Controller

- `GET /api/disciplinas`
- `POST /api/disciplinas`
- `GET /api/disciplinas/{id}`
- `PUT /api/disciplinas/{id}`
- `DELETE /api/disciplinas/{id}`
- `GET /api/disciplinas/{id}/notas`
- `GET /api/disciplinas/{id}/desempenho`
- `GET /api/disciplinas/desempenho`

#### Student Controller

- `GET /api/alunos`
- `POST /api/alunos`
- `GET /api/alunos/{id}`
- `PUT /api/alunos/{id}`
- `DELETE /api/alunos/{id}`
- `POST /api/alunos/{aluno_id}/matricula`
- `GET /api/alunos/{aluno_id}/boletim`

And many more! Check the Swagger documentation for a full list.

## Database

To run the system properly, you need to:

1. Start a MySQL database.
2. Create a database named `educacional` before running the application.

## Project Dependencies

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.flywaydb</groupId>
    <artifactId>flyway-core</artifactId>
</dependency>
<dependency>
    <groupId>org.flywaydb</groupId>
    <artifactId>flyway-mysql</artifactId>
</dependency>
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.6.0</version>
</dependency>
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```
How to Run
Clone this repository.

Set up a MySQL database and create the educacional schema.

Configure the connection settings in the application.properties file.

Run the application from the EducacionalApplication.java file.

Access Swagger at:

http://localhost:8080/swagger-ui/index.html
