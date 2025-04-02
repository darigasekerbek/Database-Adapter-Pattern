Database Adapter Pattern Implementation

This project demonstrates the Adapter Design Pattern in a database migration scenario. The adapter allows an old database system to interface with a new database system seamlessly.

📌 Overview

The Adapter Pattern is used to bridge the gap between the old database (OldDatabase) and the new database (NewDatabase).

The DatabaseAdapter class extends OldDatabase and internally uses an instance of NewDatabase to fetch patient data.

The main method showcases how data retrieval works with the adapter.

🛠️ Technologies Used

Java

Object-Oriented Design Principles

Design Patterns (Adapter)

🏗️ Class Structure

1. OldDatabase (Legacy System)

Contains the fetchPatientData(String patientId) method for retrieving patient data.

2. NewDatabase (Modern System)

Contains the retrievePatientInformation(String patientId) method for fetching patient data in the new system.

3. DatabaseAdapter (Adapter)

Extends OldDatabase.

Internally calls retrievePatientInformation(patientId) from NewDatabase.

4. Main (Execution Point)

Instantiates NewDatabase and DatabaseAdapter.

Demonstrates fetching patient data using both the old system and the new system.

🚀 How to Run

Clone the repository:

git clone https://github.com/darigasekerbek/Database-Adapter-Pattern.git

Navigate to the project directory:

cd database-adapter-pattern

Compile and run the program:

javac Main.java
java Main

📖 Example Output

Извлечение информации о пациенте из новой базы данных: 12345
Извлечение информации о пациенте из новой базы данных: 67890

📌 Key Concepts

Adapter Pattern: Enables compatibility between old and new database systems.

Encapsulation & Reusability: The adapter class ensures minimal changes to existing code while integrating new functionality.
