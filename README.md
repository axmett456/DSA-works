# DSA-works
Ahmed Mahamed aweys  ||  c1240576



 
---
# Hospital Package – DSA OOP Assignment

This project is a Java-based implementation of a **Hospital Package Billing Management System** created for the **Data Structures and Algorithms (DSA) / Object-Oriented Programming (OOP)** coursework. It demonstrates core OOP principles including **Inheritance**, **Encapsulation**, and **Method Overriding**.

---

## 📌 Problem Overview

The assignment requires creating a hospital billing system structured using an inheritance hierarchy:

### 1. Superclass: `Patient`
* **Package**: `hospital`
* **Attributes**:
  * `name` (String) - Patient's full name
  * `consultFee` (double) - Consultation fee
* **Methods**:
  * Parameterized and Default Constructors
  * Getters and Setters (`getName()`, `getConsultFee()`, etc.)
  * `CalculateBill()` - Base calculation method returning the consultation fee
  * `displayDetails()` - Prints patient information

### 2. Subclass 1: `Outpatient`
* Inherits from `Patient` (`extends Patient`)
* **Additional Attribute**:
  * `labCharge` (double) - Laboratory fee
* **Calculation**:
  $$\text{Total Bill} = \text{LabCharge} + \text{ConsultFee}$$

### 3. Subclass 2: `Inpatient`
* Inherits from `Patient` (`extends Patient`)
* **Additional Attributes**:
  * `roomCharge` (double) - Daily room fee
  * `numberOfDays` (int) - Number of days admitted
* **Calculation**:
  $$\text{Total Bill} = (\text{NumberOfDays} \times \text{RoomCharge}) + \text{ConsultFee}$$

---

## 📁 Project Structure

```text
src/
└── hospital/
    ├── Patient.java       # Superclass
    ├── Outpatient.java    # Subclass for outpatients
    ├── Inpatient.java     # Subclass for inpatients
    └── Main.java          # Driver class to run & test
