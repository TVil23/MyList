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
    public int get(int i) {
        if (index >= size) {
            throw new Exception("Zu weit");

        var node = startNode;
        for (int i = 0; i < index; i++) {
            node = node.next;
            if (node == null){}

        }

        return 0;
    }

    public int size(){
        return size;
    }

    // class Node
    class Node {
        public Node next;
        int value;

        public Node(int i) {
        }
    }

}


