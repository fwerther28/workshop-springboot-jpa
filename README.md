# Workshop: Spring Boot + JPA / Hibernate 🍃

This repository represents a major milestone in my transition to Enterprise Java development. Originally part of Dr. Nelio Alves' "Complete Java Course" (Section22), I have significantly enhanced this project by integrating Docker, PostgreSQL, and Advanced Security practices to simulate a real-world production environment.

🎯 **Project Objective**

The goal was to build a robust back-end system for a web order management platform, focusing on the core principles of the Spring Ecosystem, dependency injection, and the clean architectural separation.

🧠 **Key Learning Outcomes**

**1. Layered Architecture (Domain Driven)**

Implemented an industry-standard architecture to ensure maintainability:

* **Resource Layer:** REST Controllers to web request handling.
* **Service Layer:** Encapsulation of business logic and transaction management.
* **Repository Layer:** Data access with Spring Data JPA

**2. Infrastructure & Persistence (Beyond the Course)**

* **Dockerization:**Implemented **Docker** to orchestrate the **PostgreSQL** database, ensuring environment parity (DevOps mindset).
* **Database Modeling:**Used JPA/Hibernate for complex relationships: 1:N (Client/Orders), 1:1 (Order/Payment), and N:M (Products/Categories).
* **Lombok Integration:** Utilized Lombok to reduce boilerplate code, keeping domain classes clean and focused on business rules.

**3. API Design & Security**
  * **Interactive Documentation:** Integrated **Swagger (OpenAPI 3.1)** to provide a live, interactive environment for testing endpoints.
  * **Data Privacy** Applied Jackson serialization controls (@JsonIgnore) to ensure sensitive data, such as passwords, are never exposed in API responses.
  * **Custom Exception Handling:** Structured JSON error responses for professional debugging and user-friendly feedback.

**🛠 Tech Stack**
  * **Java**: 21+ (LTS)
  * **Framework**: Spring Boot 3.4
  * **ORM**: Spring Data JPA / Hibernate
  * **Database:** PostgreSQL (Production) / H2 (Test)
  * **Infrastructure:** Docker & DockerCompose 🐳
  * **Documentation:** Swagger / OpenAPI 3.1 📖
  * **Build Tool:** Maven
 

**📊 The "DevContador" Perspective** 
Following the same logic used in my Learning Java Fundamentals repository, this project emphasizes **Separation of Concerns.** Just as in accounting where we separate different cost centers for better auditing, here I ensure that each layer of the API has a single responsibility. Using **Docker** is like utilizing integrated ERP systems: it ensures that the "financial environment" (the database) remains consistent and reliable regardless of where the audit (the code) is performed.

**📖 API Documentation** 
The application features a fully interactive Swagger UI. Once the app is running, you can explore the endpoints here:

👉 http://localhost:8081/swagger-ui/index.html

**🚀 How to Run**
1. **Database Setup:** Ensure Docker is running and start the PostgreSQL container: 
   ```bash
   docker run --name workshop-springboot-jpa -e POSTGRES_USER=werther -e POSTGRES_PASSWORD=sua_senha_aqui -e POSTGRES_DB=course_db -p 5432:5432 -d postgres
   ```
2. **Configuration:** Update src/main/resources/application-dev.properties with your PostgreSQL credentials.
3. **Run:** Open the project in **Spring Tool Suite (STS)** or IntelliJ and run it as a Spring Boot App.
4. **Access:** The API runs on port 8081.
   
*This project is the direct successor of my [Learning Java Fundamentals](https://github.com/fwerther28/learning-java-fundamentals) journey.*
