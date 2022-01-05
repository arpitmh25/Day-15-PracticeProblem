package com.bridgelabz.dsa.day15.hashmap;

public class HNode<K, V> {
    K key;
    V value;
    HNode<K, V> next;

    public HNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public HNode<K, V> getNext() {
        return next;
    }

    public void setNext(HNode<K, V> next) {
        this.next = (HNode<K, V>) next;
    }

    @Override
    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("Node{" + "K=").append(key).append(" V=").append(value).append("}");
        if (next != null)
            nodeString.append("->").append(next);
        return nodeString.toString();
    }
}