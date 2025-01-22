package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuilderPhoneBook {
    private final Map<String, List <String>> phoneBook;

    public BuilderPhoneBook(Map<String, List <String>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void add(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phone);
    }

    public List <String> get(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    //Класс строитель
    public static class Builder {
        private final Map<String, List<String>> phoneBook;

        public Builder() {
            this.phoneBook = new HashMap<>();
        }

        public Builder addEntry(String surname, String number) {
            if (!phoneBook.containsKey(surname)) {
                phoneBook.put(surname, new ArrayList<>());
            }
            phoneBook.get(surname).add(number);
            return this;
        }

        public BuilderPhoneBook build() {
            return new BuilderPhoneBook(phoneBook);
        }

    }

}
