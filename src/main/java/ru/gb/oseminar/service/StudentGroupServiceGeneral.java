package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.Teacher;

import java.util.List;
// применяем DIP

public interface StudentGroupServiceGeneral {
     void createStudentGroup(Teacher teacher, List<Student> students);
     StudentGroup getStudentGroup();
     Student getStudentFromStudentGroup(String firstName, String secondName);
     List<Student> getSortedStudentGroup();
     List<Student> getSortedByFIOStudentGroup();
     List<Student> getSortedByDataStudentGroup();
}
