# SecureBank

SecureBank is a robust and secure backend system built with Spring Boot and Spring Security. It powers core banking functionalities such as user account management, PIN security, fund transfers, and detailed transaction tracking. Designed for scalability and performance, SecureBank ensures a reliable foundation for modern banking applications.

---


## 🚀 Key Features

- **User Onboarding** – Register users with essential details such as name, contact info, and address.  
- **PIN Security** – Enable users to set and update PINs for added account protection.  
- **Account Transactions** – Support for cash deposits and withdrawals with validation.  
- **Internal Fund Transfers** – Allow users to send money between accounts securely.  
- **Transaction History** – Maintain a detailed, timestamped log of all user transactions.  
- **Session Management** – JWT tokens are securely managed and invalidated upon logout.  
- **Email Notifications** – Automated emails on login and for sending bank statements.

---

## 🛠️ Tech Stack

- Spring Boot  
- Spring Security  
- Hibernate / JPA  
- MySQL  
- JWT Authentication  
- Maven  
- Lombok

---

## ⚙️ Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/arjav5090/SecureBank-backend.git
   cd SecureBank-backend
   ```

2. **Configure the Database**
   - Create a MySQL database.
   - Copy `application.properties.sample` to `application.properties`.
   - Update it with your MySQL credentials and database name.

3. **Build & Run**
   ```bash
   mvn spring-boot:run
   ```

---

## ❗ Error Handling

SecureBank implements global exception handling to gracefully manage common errors such as:
- Unauthorized access  
- Account not found  
- Insufficient balance  


## 🔗 Project Links

- **Frontend Repository**: [SecureBank UI](https://github.com/arjav5090/SecureBank-UI)

---
