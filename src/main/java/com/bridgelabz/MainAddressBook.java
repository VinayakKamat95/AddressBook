package com.bridgelabz;

import java.util.*;

public class MainAddressBook {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.staticEntries();
        boolean status = true;
        do {
            System.out.println("Choose Operation you want to do");
            System.out.println("""
                     1.Create_AddressBook\t 2.Add_Contact_AddressBook
                     3.Edit_Contact_AddressBook\t 4.Delete_Contact_AddressBook
                     5.Display_AddressBookDict\t 6.Back""");
            switch (scanner.nextInt()) {
                case 1 -> addressBook.createAddressBook();
                case 2 -> addressBook.addContactToAddressBook();
                case 3 -> addressBook.editContactToAddressBook();
                case 4 -> addressBook.deleteContactFromAddressBook();
                case 5 -> addressBook.printAddressBookDict();
                case 6 -> status = false;
            }
        } while (status);
    }
}
