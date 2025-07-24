# 💳 Smart Banking System (Microservices Architecture)

A complete **Banking Application** built using **Spring Boot**, **Spring Cloud**, and **Microservices Architecture**, designed for fresher-level Java developers to demonstrate real-world skills.

> Ideal for resumes, interviews (e.g., Zeta), and hands-on practice with cloud-native applications.

---

## Features

-  User registration and authentication
-  Account creation and balance inquiry
-  Transaction management (credit/debit)
-  Notification system (mock email/SMS)
-  API Gateway for routing
-  Eureka-based Service Discovery

---

## ⚙ Tech Stack

| Layer              | Tools/Tech                                       |
|--------------------|--------------------------------------------------|
| Language           | Java 17                                          |
| Frameworks         | Spring Boot, Spring Cloud                        |
| Service Discovery  | Eureka Server                                    |
| API Gateway        | Spring Cloud Gateway                             |
| Database           | MySQL                                            |
| Security (Optional)| Spring Security, JWT                             |
| Dev Tools          | Maven, Lombok, Docker (optional)                 |

---

##  Microservices Breakdown

| Service             | Port  | Description                                |
|---------------------|-------|--------------------------------------------|
| `discovery-service` | 8761  | Eureka service registry                    |
| `api-gateway`       | 8080  | Gateway router to internal services       |
| `user-service`      | 8081  | User login, register, auth                |
| `account-service`   | 8082  | Account details, creation                 |
| `transaction-service`| 8083 | Transactions (credit, debit, history)     |
| `notification-service`| 8084| Sends mock notifications                  |

---

## Project Structure

```bash
smart-banking-system/
├── discovery-service/
├── api-gateway/
├── user-service/
├── account-service/
├── transaction-service/
├── notification-service/
└── README.md
