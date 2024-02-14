package model;

import java.util.Random;

public class Teacher extends User {
    private int teacherId;


    public Teacher(String firstName, String lastName, String middleName, int teacherId) {
        super(firstName, lastName, middleName);
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher: " +
                "Name: " + super.getFirstName() +
                ", Last name: " + super.getLastName() +
                ", Middle name: " + super.getMiddleName() +
                ", Teacher ID: " + teacherId;
    }
}
