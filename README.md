# Patient Management System

## Project Overview

This is a console-based Patient Management System built in Java.

The system is menu-driven and allows users to:
- Add patients to a waiting queue
- Serve the next patient (FIFO)
- Insert emergency patients at a specific position
- View patient history records
- Navigate forward and backward through history records

The project demonstrates understanding of Data Structures & Algorithms including queues, linked lists, and object-oriented programming.

## How to Run the Project
1. Open the project in your IntelliJ
2. Run `Main.java`

### Running Unit Tests
Run:
`mvn test` or `PatientManagementTest.java`

## Why was a Queue appropriate for the waiting room?

A Queue was appropriate because it follows First In First Out (FIFO). This matches how hospital waiting rooms operate where patients are served in the order they arrive unless it is an emergency.

## Explain FIFO principle

FIFO or First In, First Out means the first person added to the queue is the first person removed from the queue.

## What could happen if a Stack was used instead of a Queue in Part 1?

If a Stack was used it would follow Last In, First Out LIFO. This means the most recently added patient would be served first and the first patient added would be served last and could end up being there indefinitely.

## Suggest ways that you could improve this system (Theory)

The system could be improved by:
- Implementing a proper priority system where emergency patients are automatically placed based on severity instead of manually choosing a position in the queue.
- Saving patient data to a database so that records are not lost when the program closes.
- Replace the menu a GUI to make it easier to use

## Why is a Doubly Linked List appropriate for patient history?

A Doubly Linked List is appropriate because it allows traversal in both directions. This means users can move forward to newer records and backward to older records easily.

## What would happen in the DLL if you forgot to update the next and previous pointers when manipulating the DLL?

If the next and previous pointers were not updated correctly parts of the list may become disconnected and cause problems like:
- Loss of access to certain records
- Broken forward/backward navigation
- Null pointer exceptions
- Corrupted linked list structure

## Why is a Doubly Linked List better than an Array or ArrayList?

A Doubly Linked List is better because it lets you move forward and backward through the records easily. This is useful for patient history since you need to browse both older and newer visits.
It is also easier to insert or remove records without having to move a lot of other elements around unlike an Array or ArrayList which may need to shift items when changes are made.
