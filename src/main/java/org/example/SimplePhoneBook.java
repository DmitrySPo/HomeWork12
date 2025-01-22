package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimplePhoneBook {

    private Map<String, List<String>> phoneBook;

    public SimplePhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new ArrayList<>());
        }
        phoneBook.get(surname).add(number);
    }

    public List<String> get(String surname) {
        return phoneBook.get(surname);
    }

}

