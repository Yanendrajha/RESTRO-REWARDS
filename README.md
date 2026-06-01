# 🍽️ RestroRewards

A modular restaurant loyalty rewards system built with Spring Boot, demonstrating progressive Spring framework concepts from core DI to production-ready REST APIs with security.

[![Java](https://img.shields.io/badge/Java-11-orange)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green)](https://spring.io/projects/spring-boot)

---

## Architecture

```
┌────────────────────────────────────────────────────┐
│                  REST Clients                       │
└──────────────────────┬─────────────────────────────┘
                       │ HTTP (JSON)
                       ▼
┌────────────────────────────────────────────────────┐
│          Spring MVC + Spring Security              │
│        Token-based Auth · Role-based ACL           │
│              (42-security-rest)                     │
└──────────────────────┬─────────────────────────────┘
                       │
                       ▼
┌────────────────────────────────────────────────────┐
│            Service Layer + AOP                      │
│     Transaction Management · Audit Logging         │
│         (22-aop, 28-transactions)                  │
└──────────────────────┬─────────────────────────────┘
                       │
                       ▼
┌────────────────────────────────────────────────────┐
│          Spring Data JPA / JDBC                    │
│     Normalized Schema (10+ tables)                 │
│       (26-jdbc, 34-spring-data-jpa)                │
└──────────────────────┬─────────────────────────────┘
                       │
                       ▼
┌────────────────────────────────────────────────────┐
│                    HSQLDB                            │
└────────────────────────────────────────────────────┘
```

---

## Modules

| Module | Concept |
|--------|---------|
| `00-rewards-common` | Domain models and shared interfaces |
| `01-rewards-db` | Database schema and seed data |
| `26-jdbc` | Raw JDBC data access |
| `28-transactions` | Declarative transaction management |
| `34-spring-data-jpa` | Spring Data JPA repositories |
| `36-mvc` | Spring MVC web layer |
| `38-rest-ws` | RESTful API endpoints |
| `42-security-rest` | Spring Security with token-based auth |
| `44-actuator` | Production monitoring and health checks |

---

## Features

- 🔐 Authentication and role-based access control (Spring Security)
- 💳 Transaction processing with reward point calculation
- 📊 Customer activity reports and reward tracking
- 🧪 Comprehensive test coverage (JUnit + Spring Boot Test)
- 📈 Production monitoring via Spring Actuator
- 🗄️ Normalized MySQL schema with Spring Data JPA

---

## Getting Started

### Prerequisites

- Java 11+
- Maven 3.6+
- MySQL

### Run

```bash
git clone https://github.com/Yanendrajha/RESTRO-REWARDS.git
cd RESTRO-REWARDS
mvn clean install
cd 38-rest-ws
mvn spring-boot:run
```

### API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/rewards/{id}` | Get customer rewards |
| POST | `/transactions` | Log a transaction |
| GET | `/customers` | List all customers |
| POST | `/customers` | Add new customer |

---

## Tech Stack

- **Language:** Java 11
- **Framework:** Spring Boot, Spring MVC, Spring Security, Spring Data JPA
- **Database:** MySQL
- **Testing:** JUnit, Spring Boot Test
- **Build:** Maven (multi-module)
