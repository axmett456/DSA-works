package hospital;

public class Inpatient extends Patient {
    // Additional properties
    private double roomCharge;
    private int numberOfDays;

    // Default Constructor
    public Inpatient() {
        super();
        this.roomCharge = 0.0;
        this.numberOfDays = 0;
    }

    // Parameterized Constructor
    public Inpatient(String name, double consultFee, double roomCharge, int numberOfDays) {
        // Pass name and consultFee to superclass (Patient)
        super(name, consultFee);
        this.roomCharge = roomCharge;
        this.numberOfDays = numberOfDays;
    }

    // Getters and Setters
    public double getRoomCharge() {
        return roomCharge;
    }

    public void setRoomCharge(double roomCharge) {
        this.roomCharge = roomCharge;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    // Calculate total bill: Total Bill = (NumberOfDays * RoomCharge) + ConsultFee
    @Override
    public double CalculateBill() {
        return (numberOfDays * roomCharge) + getConsultFee();
    }

    // Alternative camelCase method alias
    @Override
    public double calculateBill() {
        return CalculateBill();
    }

    // Display Inpatient details
    @Override
    public void displayDetails() {
        System.out.println("     INPATIENT BILL DETAILS      ");
        System.out.println("Patient Name     : " + getName());
        System.out.printf("Consultation Fee : $%.2f%n", getConsultFee());
        System.out.printf("Room Charge/Day  : $%.2f%n", roomCharge);
        System.out.println("Number of Days   : " + numberOfDays);
        System.out.printf("Total Bill       : $%.2f%n", CalculateBill());
    }
}
