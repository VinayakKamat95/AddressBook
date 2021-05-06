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
            System.out.println("1. Add\t 2.Edit\t 3. Delete\t 4. Print\t 5. Back");
            switch (scanner.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    print();
                    break;
                case 5:
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

    public static void edit() {
        System.out.println("Enter your First name:");
        String firstName = scanner.next();

        Iterator<Person> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();

            if (firstName.equals(person.getFirstname())) {
                System.out.println("Choose field you want to add:");
                System.out.println("1.Last Name\t 2.Phone Number\t 3.City\t 4.Zip\t5. State\t 6.Address\t 7.Email");
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Re-Correct your lastname");
                        person.setLastname(scanner.next());
                        break;
                    case 2:
                        System.out.println("Re-Correct your Phone Number");
                        person.setNumber(scanner.nextLong());
                        break;
                    case 3:
                        System.out.println("Re-Correct your City");
                        person.setCity(scanner.next());
                        break;
                    case 4:
                        System.out.println("Re-Correct your Zip");
                        person.setZip(scanner.nextInt());
                        break;
                    case 5:
                        System.out.println("Re-Correct your State");
                        person.setState(scanner.next());
                        break;
                    case 6:
                        System.out.println("Re-Correct your address");
                        person.setAddress(scanner.next());
                        break;
                    case 7:
                        System.out.println("Re-Correct your Email");
                        person.setEmail(scanner.next());
                        break;
                    default:
                        System.out.println("select proper option");
                        break;
                }

            }
        }

    }

    public static void delete() {
        System.out.println("Enter your First name:");
        String firstName = scanner.next();

        Iterator<Person> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();

            if (firstName.equals(person.getFirstname())) {
                list.remove(person);
                return;
            }
        }
    }

    public static void print() {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
