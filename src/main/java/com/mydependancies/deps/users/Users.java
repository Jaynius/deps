package com.mydependancies.deps.users;

public class Users {
    String firstName,secondName,idNumber,contacts;

    public Users(String firstName, String secondName, String idNumber, String contacts) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.idNumber = idNumber;
        this.contacts = contacts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Users [firstName=" + firstName + ", secondName=" + secondName + ", idNumber=" + idNumber + ", contacts="
                + contacts + "]";
    }

}
