## Command Line CRUD Application with Hibernate/JPA and Spring Boot

This repository contains a simple Command Line Interface (CLI) application implemented using Hibernate/JPA within the Spring Boot framework. The application demonstrates basic CRUD (Create, Read, Update, Delete) operations on a database using Hibernate/JPA entities.

### Prerequisites

Before running this application, ensure you have the following installed:

- Java Development Kit (JDK) version 17 or higher
- Maven (for building and managing dependencies)
- MySQL or another supported database server (configured with appropriate credentials)

### Setup Instructions

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/EthicalHackingFormation/JPA-HibernateCRUD.git
   ```

2. **Navigate to the Project Directory:**
   ```bash
   cd your-repository
   ```

3. **Configure Database Credentials:**
   Update `application.properties` file located in `src/main/resources` with your database configuration:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_database_username
   spring.datasource.password=your_database_password
   ```

4. **Build the Project:**
   ```bash
   mvn clean package
   ```

5. **Run the Application:**
   ```bash
   java -jar target/your-application-name.jar
   ```

### Usage

Change code in CommandLineRunner to create/read/update/delete studets.

- **Create:** Add new records to the database.
- **Read:** Retrieve and display existing records from the database.
- **Update:** Modify existing records in the database.
- **Delete:** Remove records from the database.

### Technologies Used

- Java
- Spring Boot
- Hibernate/JPA
- Maven

### Project Structure

```
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── majpro/
│   │   │           └──crud/
│   │   │               ├── crudApplication.java
│   │   │               ├── entity/
│   │   │               │   └── Student.java
│   │   │               ├── dao/
│   │   │               │   └── studentDAO.java
                            └── studentDAOImpl.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── majpro/
│                   └── crud/
│                       └── crudApplicationTests.java
├── pom.xml
└── README.md
```


### License

This project is licensed under the [MIT License](LICENSE).

---

Replace placeholders ( `your_database_name`, `your_database_username`, `your_database_password`) with appropriate values specific to your project. 
