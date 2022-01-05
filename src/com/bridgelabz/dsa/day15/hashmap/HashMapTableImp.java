package com.bridgelabz.dsa.day15.hashmap;

class HashMapTableImp<K, V> {
    HNode head;
    HNode tail;

    public void add(K key, V value) {
        HNode<K, V> myNode = (HNode<K, V>) searchNode(key);
        if (myNode == null) {
            myNode = new HNode<>(key, value);
            this.append(myNode);
        } else {
            myNode.setValue(value);
        }
    }

    //Append the value in the linked list
    public void append(HNode myNode) {
        if (this.head == null)
            this.head = myNode;
        if (this.tail == null)
            this.tail = myNode;
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    //Searching for the word in the linked list
    public HNode<K, V> searchNode(K data) {
        HNode currentNode = head;
        int position = 0;
        while (currentNode != null) {
            position++;
            if (currentNode.getKey().equals(data)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    //Searching for the word and get the value from the linked list
    public V get(K word) {
        HNode<K, V> myMapNode = searchNode(word);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    //Print the linked list
    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + "}";
    }

    public void printNodes() {
        System.out.println("My nodes: " + head);
    }
}
