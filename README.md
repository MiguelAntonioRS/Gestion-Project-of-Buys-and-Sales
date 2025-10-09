# 🛒 Purchase and Sales Management System

This is a **Java-based desktop application** with a graphical user interface (GUI) built using **Swing**, and uses **SQL Server** as the backend database. The system allows users to manage purchases, sales, and other related operations.

---

## 🔧 Key Features
 
- ✅ User authentication via login form.
- 📋 Main menu with access to modules like:
  - Purchase Management
  - Sales Management
  - And more...

- 🗂️ Modular architecture:
  - Presentation Layer (`capaPresentacion`)
  - Data Layer (`capaData`)
  - Business Logic Layer (`capaLogica`)

---

## 📦 Requirements

Before you begin, make sure you have the following installed:

- **JDK 8 or higher**
- **IDE**: NetBeans, Eclipse, IntelliJ IDEA, or any Java IDE
- **SQL Server** (or compatible DBMS)
- JDBC Driver for SQL Server ([Download latest .jar](https://learn.microsoft.com/en-us/sql/connect/jdbc/release-notes-for-the-jdbc-driver?view=sql-server-ver15))
- **jCalendar Library** – [Get it here](https://toedter.com/jcalendar)

---

## 📁 Project Structure 

The project follows a layered architecture:

- `capaPresentacion`: Contains GUI classes and forms.
- `capaData`: Manages data models and database connections.
- `capaLogica`: Implements business logic and rules.

Main components include:
- `FrmLogin`: Authentication screen for system access.
- `FrmMenu`: Main dashboard to navigate between modules.

---

## 💾 Database Setup

> ⚠️ **Important!**  
Inside the `DB` folder, you will find **two `.txt` files**:
- One file contains the **SQL statements to create tables**.
- The other file contains the **stored procedures** required by the system.

Make sure to run both scripts in your **SQL Server** to set up the necessary database structure and logic before running the application.

---

## 🚀 How to Run the Project

### Step 1: Clone the Repository

```bash
git clone https://github.com/MiguelAntonioRS/Gestion-Proyect-of-Buys-and-Sales.git

cd Gestion-Proyect-of-Buys-and-Sales
```

### Step 2: Setup Database

Follow the instructions above to execute the SQL scripts found in the DB folder.

### Step 3: Configure JDBC Connection

Add the SQL Server JDBC driver (.jar)  to your project's build path.

### Step 4: Compile and Run

Navigate to the presentation layer and compile the login class:
```bash
cd src/com/presentation
javac FrmLogIn.java
java FrmLogIn
javac FrmLogIn
```

© 2024 Miguel Antonio Rojas Sucarino
