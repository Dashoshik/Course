package com.company;

/**
 * Created by UITS-Admin on 11.10.2017.
 */
public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String firstName, String lastName, String group, String scienceWork) {
        super(firstName, lastName, group);
        this.scienceWork = scienceWork;

    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Aspirant aspirant = (Aspirant) o;

        return !(scienceWork != null ? !scienceWork.equals(aspirant.scienceWork) : aspirant.scienceWork != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (scienceWork != null ? scienceWork.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "scienceWork='" + scienceWork + '\'' +
                '}';
    }

    public int getScholarship() {
        return 300;
    }
}
