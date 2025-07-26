# ⚽ Fantasy Premier League Backend Java Spring Boot

This is a Spring Boot backend application built in Java that powers a **Fantasy Premier League** management system. It provides RESTful endpoints to manage football player statistics stored in a PostgreSQL database.

> 📊 The player statistics were collected using a **Python-based web scraping script** and imported into the database.

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Python (for web scraping)**

---

## 📁 Project Structure

com.cl.Champions_zone
├── player
│ ├── Player.java # Player entity
│ ├── PlayerController.java # REST API controller
│ ├── PlayerService.java # Business logic layer
│ └── PlayerRepository.java # Data access layer

yaml
Copy
Edit

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Ahmed0754/Fantasy-Premier-Leaguer-Website.git
cd Fantasy-Premier-Leaguer-Website
```

### 2. Database Setup
Make sure you have PostgreSQL installed and running.

Create a database (e.g. fantasydb) and import the scraped data using a .csv file or SQL script.

### 3. Configure Application Properties
Update src/main/resources/application.properties with your PostgreSQL credentials:

properties
Copy
Edit
spring.datasource.url=jdbc:postgresql://localhost:5432/fantasydb
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update

### 4. Run the Application
Use Maven to start the backend server:

bash
Copy
Edit
./mvnw spring-boot:run

### 5. Test the API
Open your browser or Postman and hit:

bash
Copy
Edit
GET http://localhost:8080/player
🔁 Example Endpoints
GET /player – Get all players

GET /player/{id} – Get a player by ID

POST /player – Add a new player

PUT /player/{id} – Update player info

DELETE /player/{id} – Soft delete a player

🧠 Data Source
The dataset used in this project was created by scraping live football stats from the official Fantasy Premier League website using a custom Python script. The data was exported to CSV and imported into PostgreSQL using:

sql
Copy
Edit
\COPY player_statistic FROM '/path/to/stats.csv' DELIMITER ',' CSV HEADER;
📌 Future Improvements
Add Swagger API documentation

Implement pagination & filtering

Add user authentication

Improve error handling and validation

🧑‍💻 Author
Ahmed Ali
GitHub: @Ahmed0754

📄 License
This project is licensed under the MIT License.

yaml
Copy
Edit

---

Let me know if you want a matching `requirements.txt` or the scraping script documented in 
