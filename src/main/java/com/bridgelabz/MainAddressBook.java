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
                     5.Search_Person_in_City-Or_State\t 6.Count_Person_in_City_or_State
                     7.Display_AddressBookDict\t 8.Back""");
            switch (scanner.nextInt()) {
                case 1 -> addressBook.createAddressBook();
                case 2 -> addressBook.addContactToAddressBook();
                case 3 -> addressBook.editContactToAddressBook();
                case 4 -> addressBook.deleteContactFromAddressBook();
                case 5 -> addressBook.searchPersonInACityOrState();
                case 6 -> addressBook.countPersonInACityOrState();
                case 7 -> addressBook.printAddressBookDict();
                case 8 -> status = false;
            }
        } while (status);
    }
}

