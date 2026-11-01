# 🛍️ Product Category Service

A Java Spring Boot backend application for managing product categories in an e-commerce system. The project uses Spring Data JPA for database persistence and MySQL for relational data storage.

## 📌 Project Overview

The Product Category Service is designed to manage product category information and provide a foundation for organizing products in an e-commerce application.

Categories help organize products into meaningful groups, making it easier for applications to maintain and retrieve product classification data.

This project uses a layered backend architecture with Java, Spring Boot, Spring WebMVC, Spring Data JPA, and MySQL.

## ✨ Key Features

- **Category Management:** Foundation for managing product category information.
- **REST API Development:** Spring WebMVC for building web endpoints.
- **Database Integration:** MySQL for relational data persistence.
- **ORM Support:** Spring Data JPA for database interaction.
- **Maven Build:** Dependency management and application packaging.
- **Java 17:** Modern Java development environment.

> Note: The exact CRUD operations and API endpoints depend on the implementation in the source code.

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Java 17 | Programming language |
| Spring Boot 4.1.1 | Application framework |
| Spring WebMVC | Web and HTTP request handling |
| Spring Data JPA | Data persistence and repository abstraction |
| Hibernate | JPA implementation, typically provided through Spring Data JPA |
| MySQL | Relational database |
| MySQL Connector/J | MySQL JDBC connectivity |
| Maven | Dependency management and build automation |
| Git & GitHub | Version control and source code hosting |

## 🏗️ Architecture

The application can follow a layered architecture to separate business responsibilities.

```text
Client / API Consumer
        |
        v
Controller Layer
        |
        v
Service Layer
        |
        v
Repository Layer
        |
        v
MySQL Database
```

### Layer Responsibilities

- **Controller Layer:** Handles HTTP requests and returns responses.
- **Service Layer:** Contains business logic and application rules.
- **Repository Layer:** Performs database operations through Spring Data JPA.
- **Entity Layer:** Represents persistent data mapped to database tables.
- **Database Layer:** Stores product category information.

The diagram represents the intended layered design; confirm the actual packages and classes against the source code.

## ⚙️ Prerequisites

Before running the application, ensure you have:

- Java Development Kit (JDK) 17
- MySQL Server
- Git
- An IDE such as IntelliJ IDEA or Eclipse
- Postman or another API client, if the application exposes REST endpoints

The project includes Maven Wrapper scripts, so a separate Maven installation may not be necessary.

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/ALOKKUMARSAW/product-category.git
```

### 2. Navigate to the Project

```bash
cd product-category
```

### 3. Create the MySQL Database

Open MySQL and create a database.

```sql
CREATE DATABASE product_category_db;
```

Use the database name configured in your application if it differs from this example.

### 4. Configure the Database Connection

Open the `src/main/resources/application.properties` file.

Configure the following properties with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/product_category_db
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace the environment variables with credentials supplied through your local environment.

**Important:**
- Ensure MySQL is running before starting the application.
- Confirm that the database exists.
- Keep database credentials out of version control.
- Use an appropriate schema-management strategy for production instead of relying on automatic schema updates.

The configuration above is an example. Adjust it to match your existing application configuration.

### 5. Run the Application

**Windows:**

```bash
mvnw.cmd spring-boot:run
```

**Linux / macOS:**

```bash
./mvnw spring-boot:run
```

Alternatively, open the project in your IDE and run the Spring Boot main application class.

### 6. Build the Application

**Windows:**

```bash
mvnw.cmd clean package
```

**Linux / macOS:**

```bash
./mvnw clean package
```

After a successful build, the packaged application JAR is typically available in the `target` directory.

## 🔌 API Documentation

The project includes Spring WebMVC, which supports implementing HTTP endpoints.

The actual endpoint URLs, HTTP methods, request payloads, and response formats should be documented here based on the implemented controllers.

For example, if the application supports category CRUD operations, its API documentation could include:

| Operation | HTTP Method | Example Endpoint |
|---|---|---|
| Create a category | POST | `/api/categories` |
| Retrieve all categories | GET | `/api/categories` |
| Retrieve a category by ID | GET | `/api/categories/{id}` |
| Update a category | PUT | `/api/categories/{id}` |
| Delete a category | DELETE | `/api/categories/{id}` |

**These are illustrative endpoint examples, not verified endpoints from this repository.** Update this table to match the actual controller mappings before publishing the README.

## 🧪 Testing

Run the available automated tests using the Maven Wrapper.

**Windows:**

```bash
mvnw.cmd test
```

**Linux / macOS:**

```bash
./mvnw test
```

Use Postman to test the implemented API endpoints, including successful requests, invalid input, and error responses.

## 📁 Project Structure

A typical structure for a Spring Boot application using Spring Data JPA is shown below. Adjust the package names to match the actual repository.

```text
product-category/
│
├── .mvn/
│   └── wrapper/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── flipkart/
│   │   │           └── ...
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── .gitignore
├── .gitattributes
├── Dockerfile
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## 🔒 Configuration and Security

For safer application configuration:

- Store database credentials in environment variables.
- Do not commit passwords or other secrets to GitHub.
- Validate incoming request data.
- Handle exceptions with meaningful HTTP responses.
- Use appropriate database permissions.
- Configure production logging without exposing sensitive information.

## 🔮 Future Enhancements

Potential enhancements for this project include:

- Implementing complete category CRUD operations.
- Adding request validation and centralized exception handling.
- Introducing pagination and sorting for category listings.
- Adding unit and integration tests.
- Documenting APIs using OpenAPI/Swagger.
- Adding Docker-based application and database setup.
- Integrating category management with a product service.

These are possible improvements, not claims about existing functionality.

## 👨‍💻 Author

**Alok Kumar Saw**

- GitHub: [ALOKKUMARSAW](https://github.com/ALOKKUMARSAW)
- Project Repository: [product-category](https://github.com/ALOKKUMARSAW/product-category)

## 📄 License

No license has been specified in this README. Add a `LICENSE` file and update this section if you intend to distribute the project under a particular open-source license.

---

⭐ If you find this project useful, consider starring the repository.
