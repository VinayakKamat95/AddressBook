package com.bridgelabz;

import java.util.*;

public class AddressBook {

     Scanner scanner = new Scanner(System.in);
     HashMap<String, LinkedList<Person>> myAddressBookDict = new HashMap<>(); //AddressBook Dictionary using Map

    /* createAddressBook() create AddressBook */
    public void createAddressBook() {
        System.out.println(myAddressBookDict.keySet());
        System.out.println("Enter the name of a addressBook: ");
        String addressBook_Name = scanner.next();
        if (myAddressBookDict.containsKey(addressBook_Name)) {
            System.out.println("addressBook is already present");
        }
        else {
            myAddressBookDict.put(addressBook_Name, new LinkedList<>());
        }
    }

    /* addContactToAddressBook() Add the Contact of Person in AddressBook */
    public void addContactToAddressBook() {
        System.out.println("Enter AddressBook Name");
        String addressBook_Name = scanner.next();
        try {
            if (!myAddressBookDict.containsKey(addressBook_Name)){
                throw new AddressBookException("AddressBook is not present");
            }
            else {
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
                myAddressBookDict.get(addressBook_Name).add(person);
            }
        }catch (AddressBookException e){
            e.fillInStackTrace();
        }
    }

    /* editContactToAddressBook() Edit the Contact of Person in AddressBook */
    public void editContactToAddressBook() {
        System.out.println("Enter AddressBook Name");
        String addressBook_Name = scanner.next();
        try {
            if (!myAddressBookDict.containsKey(addressBook_Name)){
                throw new AddressBookException("AddressBook is not present");
            }
            else {
                System.out.println(myAddressBookDict.get(addressBook_Name));
                System.out.println("Enter your First name:");
                String firstName = scanner.next();
                Person person = myAddressBookDict.get(addressBook_Name).stream()
                        .filter(record -> record.getFirstname().equals(firstName))
                        .findFirst().get();
                myAddressBookDict.get(addressBook_Name).remove(person);
                boolean status = true;
                do {
                    System.out.println("Choose field you want to edit:");
                    System.out.println("1.Last Name\t 2.Phone Number\t 3.City\t 4.Zip\t" +
                            "5. State\t 6.Address\t 7.Email\t 8.back");
                    switch (scanner.nextInt()) {
                        case 1 -> {
                            System.out.println("Re-Correct your lastname");
                            person.setLastname(scanner.next());
                        }
                        case 2 -> {
                            System.out.println("Re-Correct your Phone Number");
                            person.setNumber(scanner.nextLong());
                        }
                        case 3 -> {
                            System.out.println("Re-Correct your City");
                            person.setCity(scanner.next());
                        }
                        case 4 -> {
                            System.out.println("Re-Correct your Zip");
                            person.setZip(scanner.nextInt());
                        }
                        case 5 -> {
                            System.out.println("Re-Correct your State");
                            person.setState(scanner.next());
                        }
                        case 6 -> {
                            System.out.println("Re-Correct your address");
                            person.setAddress(scanner.next());
                        }
                        case 7 -> {
                            System.out.println("Re-Correct your Email");
                            person.setEmail(scanner.next());
                        }
                        case 8 -> status = false;
                    }
                    myAddressBookDict.get(addressBook_Name).add(person);
                    System.out.println(person);
                } while (status);
            }
        }catch (AddressBookException a){
            a.fillInStackTrace();
        }
    }

        /* deleteContactFromAddressBook() Delete the contact from AddressBook */
    public void deleteContactFromAddressBook() {
        System.out.println("Enter AddressBook Name");
        String addressBook_Name = scanner.next();
        try {
            if (!myAddressBookDict.containsKey(addressBook_Name)) {
                throw new AddressBookException("AddressBook is not present");
            } else {
                System.out.println(myAddressBookDict.get(addressBook_Name));
                System.out.println("Enter your First name:");
                String firstName = scanner.next();
                Person person = myAddressBookDict.get(addressBook_Name).stream()
                        .filter(record -> record.getFirstname().equals(firstName))
                        .findFirst().get();
                myAddressBookDict.get(addressBook_Name).remove(person);
                System.out.println(myAddressBookDict.get(addressBook_Name));
            }
        }catch(AddressBookException a){
                a.fillInStackTrace();
        }
    }

    /* printAddressBookDict() Prints AddressBooks and Contacts in AddressBook */
    public void printAddressBookDict() {
        if(!myAddressBookDict.isEmpty()){
            System.out.println(myAddressBookDict.keySet());
            System.out.println("Enter AddressBook Name");
            String addressBook_Name = scanner.next();
            try {
                if (!myAddressBookDict.containsKey(addressBook_Name)) {
                    throw new AddressBookException("AddressBook is not present");
                } else {
                    System.out.println(myAddressBookDict.get(addressBook_Name));
                }
            }catch(AddressBookException a){
                a.fillInStackTrace();
            }
        }
    }

    /* staticEntries() Taking Static Entries to AddressBook */
    public void staticEntries() {
        LinkedList<Person> list = new LinkedList();
        LinkedList<Person> list1 = new LinkedList();
        Person storeValue = new Person("lastname", "firstname", "city",
                "state", 400051, "address", 9874563210L, "email");
        Person storeValue1 = new Person("kamat", "vinayak", "Mumbai",
                "Maharashtra", 400051, "Bandra", 9874563210L,
                "vinayak@kamat");
        list.add(storeValue);
        list.add(storeValue1);
        Person storeValue2 = new Person("kamat", "omkar", "Mumbai",
                "Maharashtra", 400051, "Bandra", 9874563210L,
                "omkar@kamat");
        list1.add(storeValue2);
        myAddressBookDict.put("addressBook", list);
        myAddressBookDict.put("addressBook1", list1);
    }
}
