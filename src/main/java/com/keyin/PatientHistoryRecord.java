package com.keyin;

public class PatientHistoryRecord {
    private String visitDate;
    private String diagnosis;
    private String treatment;

    public PatientHistoryRecord(String visitDate, String diagnosis, String treatment) {
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    @Override
        public String toString() {
        return "Visit Date: " + visitDate + ", " +
            "Diagnosis: " + diagnosis + ", " +
            "Treatment: " + treatment;
    }


    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }
    public void setTreatment(String treatment) {
    }
}

