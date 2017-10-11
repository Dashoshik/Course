package com.company;

/**
 * Created by UITS-Admin on 11.10.2017.
 */
public class Aspirant extends Student {
    String scienceWork;

    public Aspirant(String firstName, String lastName, String group, String scienceWork) {
        super(firstName, lastName, group);
        this.scienceWork = scienceWork;

    }
    public int getScholarship (){
        return 300;
    }
}
