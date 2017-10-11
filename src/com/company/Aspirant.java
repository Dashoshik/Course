package com.company;

/**
 * Created by UITS-Admin on 11.10.2017.
 */
public class Aspirant extends Student {
    String scienceWork;

    public Aspirant(String firstName, String lastName, String group, String scienceWork) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.scienceWork = scienceWork;
    }
}
