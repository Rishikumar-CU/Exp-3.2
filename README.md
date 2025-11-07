# Java Applications Using Spring and Hibernate

Author: RISHI KUMAR  
UID: 23BCS14134

This repository showcases three core Java applications demonstrating Spring and Hibernate integration for Dependency Injection, CRUD operations, and Transaction Management.

---

## 📌 Part A: Dependency Injection in Spring Using Java-Based Configuration

### Objective
To demonstrate Spring's core feature of Dependency Injection (DI) using annotations and Java-based configuration.

### Features
- `Student` class depends on a `Course` class.
- Beans configured using `@Configuration` and `@Bean`.
- Spring context initialized via `AnnotationConfigApplicationContext`.
- No XML configuration used.

### Technologies
- Spring Core
- Java-based configuration

### How to Run
1. Clone the repo.
2. Run `MainApp.java` in your IDE.
3. Output will show the injected course name for the student.

---

## 📌 Part B: Hibernate Application for Student CRUD Operations

### Objective
To build a Hibernate-based application that performs Create, Read, Update, and Delete operations on a `Student` entity.

### Features
- `Student` class annotated with `@Entity`, `@Id`, and `@Column`.
- Hibernate configured via `hibernate.cfg.xml`.
- CRUD operations implemented using `SessionFactory` and `Session`.

### Technologies
- Hibernate ORM
- MySQL
- JPA annotations

### How to Run
1. Set up MySQL and create a `Student` table.
2. Update DB credentials in `hibernate.cfg.xml`.
3. Run `MainApp.java` to test all CRUD operations.

---

## 📌 Part C: Transaction Management Using Spring and Hibernate

### Objective
To create a banking system that transfers money between accounts with transaction consistency using Spring and Hibernate.

### Features
- Two entities: `Account` and `TransactionRecord`.
- Service layer annotated with `@Transactional`.
- Atomic transfer logic: deduct from one account, credit another.
- Rollback on failure to maintain consistency.

### Technologies
- Spring Framework
- Hibernate ORM
- MySQL
- Spring Transaction Management

### How to Run
1. Set up MySQL with `Account` and `TransactionRecord` tables.
2. Configure Spring beans and Hibernate session factory.
3. Run `MainApp.java` to simulate a money transfer.

---

## 🛠️ Requirements

- Java 11+
- Maven
- MySQL
- Spring Framework
- Hibernate ORM

---

## 📂 Folder Structure
SpringHibernateProjects/ ├── PartA_DI_Spring/ ├── PartB_Hibernate_CRUD/ └── PartC_Spring_Hibernate_Transaction/
Each folder contains its own `pom.xml`, source code, and configuration files.

