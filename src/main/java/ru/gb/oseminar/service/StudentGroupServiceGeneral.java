package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.Teacher;

import java.util.List;
// применяем DIP

public interface StudentGroupServiceGeneral {
    public void createStudentGroup(Teacher teacher, List<Student> students);
    public StudentGroup getStudentGroup();
    public Student getStudentFromStudentGroup(String firstName, String secondName);
    public List<Student> getSortedStudentGroup();
    public List<Student> getSortedByFIOStudentGroup();
}
