package ru.gb.oseminar.data;

public class StudentComporatorDate implements UserComporator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}
