/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg3;

/**
 *
 * @author zainn
 */
public class Lab3 {
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 Node head = null;
    public void addAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 1; i < position && temp != null; i++) {
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Position out of bounds");
            } else {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    public void deleteFromStart() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("List is empty");
        }
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void deleteByValue(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void search(int value) {
        Node temp = head;
        int position = 0;
        while (temp != null) {
            if (temp.data == value) {
                System.out.println("Value " + value + " found at position " + position);
                return;
            }
            temp = temp.next;
            position++;
        }
        System.out.println("Value " + value + " not found");
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public int countNodes() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Lab3 list = new Lab3();

        list.addAtStart(10);
        list.addAtEnd(20);
        list.addAtPosition(15, 1);
        list.display();

        list.deleteFromStart();
        list.display();
        list.deleteFromEnd();
        list.display();
        list.deleteByValue(15);
        list.display();

        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);
        list.display();

        list.search(40);
        list.search(100);

        list.reverse();
        list.display();

        System.out.println("Total nodes: " + list.countNodes());
    }
}