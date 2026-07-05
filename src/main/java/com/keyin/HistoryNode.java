package com.keyin;

public class HistoryNode {

    PatientHistoryRecord record;

    HistoryNode next;
    HistoryNode previous;

    public HistoryNode(PatientHistoryRecord record) {
        this.record = record;
        this.next = null;
        this.previous = null;
    }
    
}
