package hospital;

public class Main {
    public static void main(String[] args) {
         System.out.println("*      HOSPITAL BILLING MANAGEMENT SYSTEM        *");

        // 1. Creating an Outpatient object
        // Patient Name: Ahmed Ali, Consultation Fee: $50.0, Lab Charge: $80.0
        Outpatient outpatient = new Outpatient("Ahmed Ali", 50.0, 80.0);

        // Displaying Outpatient Information
        outpatient.displayDetails();

        // Demonstrating access to superclass getters and CalculateBill
        System.out.println("\n>> Outpatient Verification <<");
        System.out.println("Patient Name from Superclass: " + outpatient.getName());
        System.out.println("Consult Fee from Superclass : $" + outpatient.getConsultFee());
        System.out.println("Lab Charge                  : $" + outpatient.getLabCharge());
        System.out.println("Calculated Bill             : $" + outpatient.CalculateBill());

        // 2. Creating an Inpatient object
        // Patient Name: Fatima Mohamed, Consultation Fee: $70.0, Room Charge: $120.0/day, Number of Days: 4
        Inpatient inpatient = new Inpatient("Fatima Mohamed", 70.0, 120.0, 4);

        // Displaying Inpatient Information
        inpatient.displayDetails();

        // Demonstrating access to superclass getters and CalculateBill
        System.out.println("\n>> Inpatient Verification <<");
        System.out.println("Patient Name from Superclass: " + inpatient.getName());
        System.out.println("Consult Fee from Superclass : $" + inpatient.getConsultFee());
        System.out.println("Room Charge per Day         : $" + inpatient.getRoomCharge());
        System.out.println("Number of Days Admitted     : " + inpatient.getNumberOfDays());
        System.out.println("Calculated Bill             : $" + inpatient.CalculateBill());
        System.out.println();

         System.out.println("*     ALL BILL CALCULATIONS COMPLETED SUCCESSFULLY *");
     }
}
