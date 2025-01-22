package org.example;


public class Main {
    public static void main(String[] args) {
        SimplePhoneBook book = new SimplePhoneBook();

        // Добавление записей
        book.add("Иванов", "+7 900 123-45-67");
        book.add("Петров", "+7 901 234-56-78");
        book.add("Иванов", "+7 902 345-67-89");
        book.add("Иванов", "+7 902 345-67-99");

        // Получение записей
        System.out.println();
        System.out.println("По фамилии Иванов в справочнике есть следующие телефоны: " +
                book.get("Иванов").toString());
        System.out.println("По фамилии Петров в справочнике есть следующие  телефоны: " +
                book.get("Петров").toString());

        System.out.println();
        System.out.println("************************************************************");
        System.out.println();

        BuilderPhoneBook book1 = new BuilderPhoneBook.Builder()
                .addEntry("Сергеев", "+7 900 123-45-67")
                .addEntry("Дмитриев", "+7 901 234-56-78")
                .addEntry("Сергеев", "+7 902 345-67-89")
                .addEntry("Сергеев", "+7 902 345-67-99")
                .build();

        // Получение записей
        System.out.println("По фамилии Сергеев в справочнике есть следующие телефоны: " +
                book.get("Иванов"));
        System.out.println("По фамилии Дмитриев в справочнике есть следующие телефоны: " +
                book.get("Петров"));
    }
}
