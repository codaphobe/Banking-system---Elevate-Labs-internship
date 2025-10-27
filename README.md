# 🏦 Bank Account Simulation

## 🎯 Objective
The goal of this project is to simulate basic banking operations using **Object-Oriented Programming (OOP)** principles in Java.  
The project focuses on understanding **encapsulation**, and **separation of logic and data models**, while managing multiple accounts and maintaining transaction records.

---

## ⚙️ Features
- Create or access bank accounts dynamically
- Deposit and withdraw money
- Maintain a complete transaction history
- Display current account balance
- Prevent duplicate account creation
- Menu-driven console interface

---

## 🧩 Class Overview

### `Account`
- Represents a bank account.
- Stores account number, holder name, balance, and transaction history.
- Acts as a plain data model (POJO).

### `Transaction`
- Represents a single transaction (deposit or withdrawal).
- Stores the amount, type of transaction, and timestamp.

### `AccountManager`
- Handles all business logic:
    - Create or access accounts
    - Perform deposits and withdrawals
    - Prevent duplicate accounts
    - Maintains all accounts (private)

### `Main class`
- The main entry point of the project.
- Provides a console-based interface for the user to interact with the system.

---

## 🧠 Concepts Learned
- Object-Oriented Design (Encapsulation, Responsibility Separation)
- Using `ArrayList` for dynamic data storage
- Implementing logical account management
- Stream API for searching and validation
- Timestamp handling using `LocalDateTime`

