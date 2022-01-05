package com.bridgelabz.dsa.day15.hashmap;

public class HashMapTableFrequencylarge {
    public static void main(String[] args) {
        HashMapTableImp<String, Integer> hashImpl = new HashMapTableImp<>();
        String message = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";

        //Split words when a white space comes up.
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