# Workshop: Spring Boot + JPA / Hibernate 🍃

This repository represents a major milestone in my transition to Enterprise Java development. Part of the "Complete Java Course" by Dr. Nelio Alves (Section22), this project marks my shift from standalone applications to building **Scalable RESTful Web Services.**

🎯 **Project Objective**

The goal was to build a complete back-end system for a web order management platform, focusing on the core principles of the **Spring Ecosystem,** dependency injection, and the architectural separation between resource, service, and repository layers.

🧠 **Key Learning Outcomes**

**1. Layered Architecture (Domain Driven)**

Implemented a clean, industry-standard architecture to ensure maintainability and scalability:

* **Resource Layer:** REST Controllers to handle web requests
* **Service Layer:** Business logic encapsulation and transaction management.
* **Repository Layer:** Data access using Spring Data JPA

**2. Data Modeling & ORM**

* ** Object-Relational Mapping:** Used JPA/Hibernate to map complex database relationships:
  * 1:N (One-to-Many): Client and Orders.
  * 1:1 (One-to-One): Order and Payment.
  * N:M (Many-to-Many): Products and Categories.
* ** Database Seeding:** Implemented automatic database population for testing environments (H2 Database).

**3.API Design & Error Handling**
  * Developed standard CRUD operations (Create, Read, Update, Delete).
  * Implemented **Custom Exception Handling** to return user-friendly, structured JSON error responses.
  * Used Jackson annotations for JSON serialization control (handling circular references).

**🛠 Tech Stack**
  * **Java**: 21+ (LTS)
  * **Framework**: Spring Boot 3+
  * **ORM**: Spring Data JPA / Hibernate
  * **Database:** H2 (Test) / **MySQL (Production Ready)** 
  * **Build Tool:** Maven
  * **Port:** 8081 (Custom Configuration)

**📊 The "DevContador" Perspective** 
Following the same logic used in my Learning Java Fundamentals repository, this project emphasizes **Separation of Concerns.** Just as in accounting where we separate different cost centers for better auditing, here I ensure that each layer of the API has a single responsibility, avoiding "God Classes" and ensuring a predictable data flow. 

**🚀 How to Run**
1. Clone the repository: https://github.com/fwerther28/workshop-springboot-jpa
2. Open the project in **Spring Tool Suite (STS)** or InteliJ.
3. Run as a Spring Boot App.
4. **Access the API:** The application is configured to run on **port 8081.**
  * Base URL: http://localhost:8081
  * H2 Console: http://localhost:8081/h2-console

*This project is the direct successor of my [Learning Java Fundamentals](https://github.com/fwerther28/learning-java-fundamentals) journey.*
