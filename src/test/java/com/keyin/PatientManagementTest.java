package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatientManagementTest {

    @Test
    public void testAddPatient() {

        WaitingQueue queue = new WaitingQueue();

        queue.addPatient(new Patient(1, "John", "Flu"));

        assertEquals(1, queue.size());
    }

    @Test
    public void testServePatient() {

        WaitingQueue queue = new WaitingQueue();

        queue.addPatient(new Patient(1, "John", "Flu"));
        queue.addPatient(new Patient(2, "Sarah", "Cold"));

        queue.servePatient();

        assertEquals(1, queue.size());
    }

    @Test
    public void testEmergencyInsert() {

        WaitingQueue queue = new WaitingQueue();

        queue.addPatient(new Patient(1, "John", "Flu"));
        queue.addPatient(new Patient(2, "Sarah", "Cold"));

        Patient emergency = new Patient(99, "Emergency", "Chest Pain");

        queue.emergencyInsert(emergency, 1);

        assertEquals(99, queue.getPatient(1).getPatientId());
    }
}
