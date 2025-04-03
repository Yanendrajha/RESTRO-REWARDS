# RESTRO-REWARDS

**Restaurant Loyalty Program**

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contact](#contact)

## Introduction
RESTRO-REWARDS is a comprehensive Restaurant Loyalty Program designed to help restaurant owners reward their loyal customers. The program is built using Java with a focus on simplicity and efficiency.

## Features
- **Customer Management:** Easily add, update, and manage customer information.
- **Reward Points System:** Track and manage reward points for each customer.
- **Transaction Logging:** Keep a record of all transactions and reward points earned.
- **Reports:** Generate detailed reports on customer activity and rewards.

## Installation
To get started with RESTRO-REWARDS, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/Yanendrajha/RESTRO-REWARDS.git
   cd RESTRO-REWARDS
   ```

2. Ensure you have Java and Maven installed:
   ```bash
   java -version
   mvn -version
   ```

3. Navigate to the appropriate submodule directory (e.g., `30-jdbc-boot`) and run the project using Maven:
   ```bash
   cd 30-jdbc-boot
   mvn clean install
   mvn spring-boot:run
   ```

## Usage
After installing, you can start using RESTRO-REWARDS to manage your restaurant's loyalty program. Here are some basic commands:

- **Add Customer:**
  ```bash
  java -cp target/classes com.yourpackage.Main addCustomer "Customer Name" "Customer Email"
  ```

- **Log Transaction:**
  ```bash
  java -cp target/classes com.yourpackage.Main logTransaction "Customer Email" "Transaction Amount"
  ```

- **Check Rewards:**
  ```bash
  java -cp target/classes com.yourpackage.Main checkRewards "Customer Email"
  ```

## Application Configuration
The application runs on the default port specified in the `application.properties` file. You can change the port number by modifying the `application.properties` file if needed.

## Contact
For any questions or suggestions, feel free to contact:

- Name: Yanendra Jha
- Email: yanendrajha37@gmail.com

```

Please replace `"com.yourpackage.Main"` with the actual package and main class name in your project.
