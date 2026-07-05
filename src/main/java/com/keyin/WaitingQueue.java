package com.keyin;

import java.util.LinkedList;

public class WaitingQueue {

    private LinkedList<Patient> queue = new LinkedList<>();

    public  void addPatient(Patient patient) {
        queue.add(patient);
    }

    public void servePatient() {
    
        if (queue.isEmpty()) {
            System.out.println("No patients in queue.");
            return;
        }

        Patient served = queue.removeFirst();

        System.out.println("Serving patient");
        System.out.println(served);
    }

    public void emergencyInsert(Patient patient, int position) {
        if (position < 0 || position > queue.size()) {
            System.out.println("Invalid position.");
            return;
        }

        queue.add(position, patient);

        System.out.println("Emergency patient inserted at position " + position);
    }

    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("No patients in queue.");
            return;
        }


        System.out.println("Current queue.");

        for (Patient patient : queue) {
            System.out.println(patient);
        }
    }

    public int size() {
        return queue.size();
    }

    public Patient getPatient(int index) {
        return queue.get(index);
    }
}
