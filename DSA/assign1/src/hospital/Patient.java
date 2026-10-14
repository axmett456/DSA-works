package hospital;

public class Patient {
    // Properties
    private String name;
    private double consultFee;

    // Default Constructor
    public Patient() {
        this.name = "";
        this.consultFee = 0.0;
    }

    // Parameterized Constructor
    public Patient(String name, double consultFee) {
        this.name = name;
        this.consultFee = consultFee;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getConsultFee() {
        return consultFee;
    }

    public void setConsultFee(double consultFee) {
        this.consultFee = consultFee;
    }

    // Base CalculateBill method
    public double CalculateBill() {
        return consultFee;
    }

    // Alternative camelCase method alias
    public double calculateBill() {
        return CalculateBill();
    }

    // Method to display patient details
    public void displayDetails() {
        System.out.println("Patient Name     : " + name);
        System.out.printf("Consultation Fee : $%.2f%n", consultFee);
    }
}
