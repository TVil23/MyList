package org.example.list;

import org.w3c.dom.Node;

public class List {

    private Node currentNode;
    private Node startNode;

    private int size;

    public void add(int i) {
        //Neue Konten erzeugen
        var newNode = new Node(i);
        // Alten Konten aktualisieren
        if(currentNode != null)
            currentNode.next = newNode;
        // Aktuelle Knoten auf neuen setzen
        currentNode = newNode;

        if(startNode == null) startNode = currentNode;
    }

    // get(index)
    public int get(int index) {
        if (index >= size)
            throw new ArrayIndexOutOfBoundsException("");
        var node = startNode;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        if (node == null)
            throw new ArrayIndexOutOfBoundsException("Zu weit");
        return node.value;
    }

    public int size() {
        return size; // Test
    }

    // class Node

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}


