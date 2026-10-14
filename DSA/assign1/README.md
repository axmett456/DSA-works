# Hospital Package – DSA OOP Assignment

A Java project demonstrating **Object-Oriented Programming (OOP)** concepts, specifically **Inheritance**, **Encapsulation**, and **Method Overriding**, for the Data Structures and Algorithms (DSA) coursework.

---

## 📋 Problem Description

The assignment requires developing a Hospital Package to manage and calculate bills for two types of patients: **Outpatients** and **Inpatients**, utilizing an inheritance hierarchy.

### 1. Superclass: `Patient`
* **Package**: `hospital`
* **Properties**:
  * `name` (String) - Name of the patient
  * `consultFee` (double) - Base consultation fee
* **Methods**:
  * Getters and Setters
  * `CalculateBill()` - Base method returning the consultation fee
  * `displayDetails()` - Displays patient base information

### 2. Subclass: `Outpatient`
* Inherits from `Patient` (`extends Patient`)
* **Additional Property**:
  * `labCharge` (double) - Cost of laboratory tests
* **Bill Calculation**:
  $$\text{Total Bill} = \text{LabCharge} + \text{ConsultFee}$$

### 3. Subclass: `Inpatient`
* Inherits from `Patient` (`extends Patient`)
* **Additional Properties**:
  * `roomCharge` (double) - Daily room fee
  * `numberOfDays` (int) - Number of days admitted in the hospital
* **Bill Calculation**:
  $$\text{Total Bill} = (\text{NumberOfDays} \times \text{RoomCharge}) + \text{ConsultFee}$$

---

## 📂 Project Structure

```text
assign1/
├── src/
│   └── hospital/
│       ├── Patient.java       # Superclass
│       ├── Outpatient.java    # Subclass 1
│       ├── Inpatient.java     # Subclass 2
│       └── Main.java          # Driver program to run and verify
├── output_screenshot.png      # Screenshot of execution output
├── .gitignore
└── README.md
```

---   

## 🚀 How to Run

### Option 1: IntelliJ IDEA
1. Open the project folder in IntelliJ IDEA.
2. Navigate to `src/hospital/Main.java`.
3. Right-click and select **Run 'Main.main()'** (or click the green Run arrow).

### Option 2: Terminal / Command Prompt
```bash
# Compile all files into an 'out' directory
javac src/hospital/*.java -d out

# Run the Main application
java -cp out hospital.Main
```

---

## 📸 Output & Verification

![Program Output Screenshot](output_screenshot.png)

```text
==================================================
*      HOSPITAL BILLING MANAGEMENT SYSTEM        *
==================================================

     OUTPATIENT BILL DETAILS     
Patient Name     : Ahmed Ali
Consultation Fee : $50.00
Lab Charge       : $80.00
Total Bill       : $130.00

>> Outpatient Verification <<
Patient Name from Superclass: Ahmed Ali
Consult Fee from Superclass : $50.0
Lab Charge                  : $80.0
Calculated Bill             : $130.0

--------------------------------------------------

     INPATIENT BILL DETAILS      
Patient Name     : Fatima Mohamed
Consultation Fee : $70.00
Room Charge/Day  : $120.00
Number of Days   : 4
Total Bill       : $550.00

>> Inpatient Verification <<
Patient Name from Superclass: Fatima Mohamed
Consult Fee from Superclass : $70.0
Room Charge per Day         : $120.0
Number of Days Admitted     : 4
Calculated Bill             : $550.0

==================================================
*     ALL BILL CALCULATIONS COMPLETED SUCCESSFULLY *
==================================================
```
