package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Person> list = new ArrayList<>();

    public static void main(String[] args) {
        boolean status = true;
        do {
            System.out.println("Choose Operation you want to do");
            System.out.println("1. Add\t 2. print\t 3. Back");
            switch (scanner.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    print();
                    break;
                case 3:
                    status = false;
                    break;
            }
        } while (status);

    }

    public static void add() {
        Person person = new Person();
        System.out.println("Enter the First name:");
        String firstName = scanner.next();
        person.setFirstname(firstName);

        System.out.println("Enter the Last name:");
        String lastName = scanner.next();
        person.setLastname(lastName);

        System.out.println("Enter the Phone Number:");
        long phone = scanner.nextLong();
        person.setNumber(phone);

        System.out.println("Enter the City:");
        String city = scanner.next();
        person.setCity(city);

        System.out.println("Enter the Zip:");
        int zip = scanner.nextInt();
        person.setZip(zip);

        System.out.println("Enter the State:");
        String state = scanner.next();
        person.setState(state);

        System.out.println("Enter the Address:");
        String address = scanner.next();
        person.setAddress(address);

        System.out.println("Enter the Email:");
        String email = scanner.next();
        person.setEmail(email);

        list.add(person);

    }

    public static void print() {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
