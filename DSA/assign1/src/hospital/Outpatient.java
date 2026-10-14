package hospital;

public class Outpatient extends Patient {
    // Additional property
    private double labCharge;

    // Default Constructor
    public Outpatient() {
        super();
        this.labCharge = 0.0;
    }

    // Parameterized Constructor
    public Outpatient(String name, double consultFee, double labCharge) {
        // Pass name and consultFee to superclass (Patient)
        super(name, consultFee);
        this.labCharge = labCharge;
    }

    // Getter and Setter for LabCharge
    public double getLabCharge() {
        return labCharge;
    }

    public void setLabCharge(double labCharge) {
        this.labCharge = labCharge;
    }

    // Calculate total bill: Total Bill = LabCharge + ConsultFee
    @Override
    public double CalculateBill() {
        return labCharge + getConsultFee();
    }

    // Alternative camelCase method alias
    @Override
    public double calculateBill() {
        return CalculateBill();
    }

    // Display Outpatient details
    @Override
    public void displayDetails() {
        System.out.println("     OUTPATIENT BILL DETAILS     ");
        System.out.println("Patient Name     : " + getName());
        System.out.printf("Consultation Fee : $%.2f%n", getConsultFee());
        System.out.printf("Lab Charge       : $%.2f%n", labCharge);
        System.out.printf("Total Bill       : $%.2f%n", CalculateBill());
    }
}
