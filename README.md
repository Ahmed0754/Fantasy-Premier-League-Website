# Fantasy Premier League - Backend API

This is a backend RESTful API built using **Spring Boot** and **Java** for managing a **Fantasy Premier League**-style application. It allows for storing, updating, and retrieving football player statistics, teams, and match data. The project is designed with modularity and scalability in mind and uses **PostgreSQL** as the database.

## 🔧 Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Data JPA (Hibernate)
- PostgreSQL
- Maven
- Lombok (for reducing boilerplate code)
- Spring Web (REST API)

## 📁 Project Structure

Champions-zone/
├── src/
│ └── main/
│ └── java/
│ └── com.cl.Champions_zone/
│ ├── controller/
│ ├── service/
│ ├── model/
│ ├── repository/
│ └── ChampionsZoneApplication.java
├── resources/
│ ├── application.properties
│ └── data.sql
└── README.md

markdown
Copy
Edit

## 📌 Key Features

- ✅ RESTful API Endpoints for Player statistics
- ✅ Automatic table creation via JPA Entity mapping
- ✅ CSV data import support for bulk player stats
- ✅ Clean separation between layers: Controller, Service, Repository
- ✅ Error handling and validation (ongoing improvements)

## 🚀 Getting Started

### Prerequisites

- Java 17+
- PostgreSQL database running
- Maven

### 1. Clone the Repository

```bash
git clone https://github.com/Ahmed0754/Fantasy-Premier-Leaguer-Website.git
cd Fantasy-Premier-Leaguer-Website
```

### 2. Configure application.properties
Update your database settings in src/main/resources/application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
### 3. Run the Application
bash
Copy
Edit
./mvnw spring-boot:run
Or from your IDE (IntelliJ, VS Code, etc.), run the ChampionsZoneApplication.java class.

### 4. Test API Endpoints
GET /players – Get all players

GET /players/{id} – Get player by ID

POST /players – Create a new player

PUT /players/{id} – Update player

DELETE /players/{id} – Delete player

You can test using tools like Postman or cURL.

🗃️ Example Entity: Player
java
Copy
Edit
@Entity
@Table(name = "player")
public class Player {
    @Id
    private Long id;
    private String name;
    private String position;
    private String club;
    private int totalPoints;
    private int goalsScored;
    // ...other fields
}
✅ To-Do / Improvements
🔄 Add JWT-based authentication for securing endpoints

📊 Add Swagger/OpenAPI documentation

📂 Implement pagination and filtering on endpoints

🔄 Dockerize the project

✨ Add frontend (React or Angular) to visualize data

🙌 Contributing
Feel free to fork this repo, open issues, or submit pull requests to improve the project.

📄 License
MIT License

Made by Syed Ahmed Ali
