package com.bridgelabz;

public class Person {
    private String lastname;// Stores lastname of Person
    private String firstname;// Stores firstname of Person
    private String address;// Stores address of Person
    private String city;// Stores city of Person
    private String state;// Stores state of Person
    private int zip;// Stores zip of Person
    private long number;// Stores number of Person
    private String email;// Stores email of Person

    public Person(String lastname, String firstname, String city,
                  String state, int zip, String address, long number, String email)
    {
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    public Person() {

    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + firstname + " " + lastname + "\n" +
                "address: " + address + "\n" + "City: " + city +
                "\n" +"State: " + state + "\n" + "Zip: " + zip +
                "\n" + "Number# " + number + "\n" + "Email: " + email + "\n";
    }
}
