/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;


public class LAB4 {

    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public void addAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = head;
        }
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        newNode.prev = tail;
        newNode.next = null;
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
    }

    public void addAtPosition(int data, int position) {
        if (position < 0 || position > countNodes()) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            addAtStart(data);
        } else if (position == countNodes()) {
            addAtEnd(data);
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(data);
            newNode.next = current.next;
            newNode.prev = current;
            current.next = newNode;
            if (newNode.next != null) {
                newNode.next.prev = newNode;
            }
        }
    }

    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    public void deleteFromEnd() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        }
    }

    public void deleteByValue(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current == head) {
                    deleteFromStart();
                } else if (current == tail) {
                    deleteFromEnd();
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Value not found");
    }

    public void displayFromStart() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayFromEnd() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public int search(int value) {
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.data == value) {
                return position;
            }
            current = current.next;
            position++;
        }
        System.out.println("Value not found");
        return -1;
    }

    public void reverse() {
        Node current = head;
        Node previous = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            current.prev = next;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public int countNodes() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LAB4 list = new LAB4();
        list.addAtEnd(1);
        list.addAtEnd(2);
        list.addAtEnd(3);
        list.addAtStart(0);
        System.out.println("List from start:");
        list.displayFromStart();
        System.out.println("List from end:");
        list.displayFromEnd();
        int searchResult = list.search(2);
        System.out.println("Element 2 found at position: " + searchResult);
        list.reverse();
        System.out.println("List after reversing:");
        list.displayFromStart();
        list.deleteFromStart();
        list.deleteByValue(2);
        list.deleteFromEnd();
        System.out.println("Final list:");
        list.displayFromStart();
    }
}

