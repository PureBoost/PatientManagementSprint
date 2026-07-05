package com.keyin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        WaitingQueue waitingQueue = new WaitingQueue();
        PatientHistory history = new PatientHistory();

        //10 history records
        history.addRecord(new PatientHistoryRecord("2026-01-01", "Flu", "Rest and fluids"));
        history.addRecord(new PatientHistoryRecord("2026-01-05", "Cold", "Medication prescribed"));
        history.addRecord(new PatientHistoryRecord("2026-01-10", "Sprain", "Bandage and rest"));
        history.addRecord(new PatientHistoryRecord("2026-01-15", "Headache", "Painkillers"));
        history.addRecord(new PatientHistoryRecord("2026-01-20", "Checkup", "All good"));
        history.addRecord(new PatientHistoryRecord("2026-01-25", "Allergy", "Antihistamines"));
        history.addRecord(new PatientHistoryRecord("2026-02-01", "Back Pain", "Physiotherapy"));
        history.addRecord(new PatientHistoryRecord("2026-02-05", "Stomach Bug", "Diet change"));
        history.addRecord(new PatientHistoryRecord("2026-02-10", "Ear Infection", "Antibiotics"));
        history.addRecord(new PatientHistoryRecord("2026-02-15", "Follow-up", "Recovery good"));

        int choice;

        do {

            System.out.println("==================================");
            System.out.println("   Patient Management System");
            System.out.println("==================================");
            System.out.println("1. Add Patient");
            System.out.println("2. Serve Next Patient");
            System.out.println("3. Emergency Insert");
            System.out.println("4. Print Waiting Queue");
            System.out.println("5. Show Newest Record");
            System.out.println("6. Show Oldest Record");
            System.out.println("7. Next Record");
            System.out.println("8. Previous Record");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                //Add Patient
                case 1:
                    System.out.println("Enter Patient ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter Name: ");
                    String name = input.nextLine();

                    System.out.println("Enter Reason for Visit: ");
                    String reason = input.nextLine();

                    waitingQueue.addPatient(new Patient(id, name, reason));
                    break;

                //Serve Next Patient
                case 2:
                    waitingQueue.servePatient();
                    break;

                //Emergency Insert
                case 3:
                    System.out.println("Enter Patient ID: ");
                    int eid = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter Name: ");
                    String ename = input.nextLine();
                    

                    System.out.println("Enter Reason for Visit: ");
                    String ereason = input.nextLine();

                    System.out.println("Enter Position: ");
                    int pos = input.nextInt();
                    input.nextLine();

                    waitingQueue.emergencyInsert(new Patient(eid, ename, ereason), pos);
                    break;

                //Print Queue
                case 4:
                    waitingQueue.printQueue();
                    break;

                //Show Newest
                case 5:
                    history.showNewest();
                    break;

                //Show Oldest
                case 6:
                    history.showOldest();
                    break;

                //Next Record
                case 7:
                    history.showNext();
                    break;

                //Previous Record
                case 8:
                    history.showPrevious();
                    break;

                //Exit
                case 9:   
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 9);

        input.close();
    }
}
