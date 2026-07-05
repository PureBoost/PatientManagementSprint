package com.keyin;

public class Patient {
    private int patientId;
    private String name;
    private String reasonForVisit;

    public Patient(int patientId, String name, String reasonForVisit) {
        this.patientId = patientId;
        this.name  = name;
        this.reasonForVisit = reasonForVisit;
    }

    public String toString() {
        return patientId + " " + name + " " + reasonForVisit;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }
}
