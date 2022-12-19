package com.example.theenbhadsah;

public class UserHelperClass {

    String FullName, PhoneNo, Password;

    public UserHelperClass(String fullName) {

    }

    public UserHelperClass(String fullName, String phoneNo, String password) {
        FullName = fullName;
        PhoneNo = phoneNo;
        Password = password;
    }

    public String getFullName() {
        return FullName;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public String getPassword() {
        return Password;
    }
}
