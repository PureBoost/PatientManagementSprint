package com.keyin;

public class PatientHistory {

    private HistoryNode head;
    private HistoryNode tail;
    private HistoryNode current;

    public void addRecord(PatientHistoryRecord record) {

        HistoryNode newNode = new HistoryNode(record);

        //If the list is empty set the new node as the head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
            return;
        }

        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    public void showNewest() {
        if (head == null) {
            System.out.println("No records found.");
            return;
        }

        current = tail;
        System.out.println(current.record);
    }

    public void showOldest() {
        if (head == null) {
            System.out.println("No records found.");
            return;
        }

        current = head;
        System.out.println(current.record.toString());
    }

    public void showNext() {
        if (current == null || current.next == null) {
            System.out.println("Already at the newest record.");
            return;
        }

        current = current.next;
        System.out.println(current.record.toString());
    }

    public void showPrevious() {
        if (current == null || current.previous == null) {
            System.out.println("Already at the oldest record.");
            return;
        }

        current = current.previous;
        System.out.println(current.record.toString());
    }
}
