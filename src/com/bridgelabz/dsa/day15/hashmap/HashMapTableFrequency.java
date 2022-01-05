package com.bridgelabz.dsa.day15.hashmap;

public class HashMapTableFrequency {
    public static void main(String[] args) {
        HashMapTableImp<String, Integer> hashImpl = new HashMapTableImp<>();
        String message = "To be or not to be";

        //Split the words when a white space comes up.
        //Convert all the words in lowercase
        String[] messageArray = message.toLowerCase().split(" ");

        for (String word : messageArray) {
            //Search for the word in the linked list
            Integer value = hashImpl.get(word);
            //If not found, frequency of the word StayWith 1
            if (value == null)
                value = 1;
            else
                //If found, frequency of the word increases by 1
                value = value + 1;
            hashImpl.add(word, value);
        }
        System.out.println(hashImpl);
    }
}