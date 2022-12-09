package com.example.kenkocho;

import android.provider.ContactsContract;
import android.widget.EditText;

import java.util.Date;

public class Patient {

    EditText name,surname;
    /*Date date_n;*/
    EditText email;
    EditText password;

    public Patient() {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public Patient(EditText name, EditText surname, EditText email, EditText password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public EditText getName() {
        return name;
    }

    public void setName(EditText name) {
        this.name = name;
    }

    public EditText getSurname() {
        return surname;
    }

    public void setSurname(EditText surname) {
        this.surname = surname;
    }

    public EditText getEmail() {
        return email;
    }

    public void setEmail(EditText email) {
        this.email = email;
    }

    public EditText getPassword() {
        return password;
    }

    public void setPassword(EditText password) {
        this.password = password;
    }
}
