package ru.gb.oseminar.service;

import ru.gb.oseminar.data.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// применяем DIP
public class StudentGroupService implements StudentGroupServiceGeneral {
    private StudentGroup studentGroup;

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Student getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<Student> iterator = studentGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
               && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<Student> getSortedStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<Student> getSortedByFIOStudentGroup(){
        UserComporator<Student> userComporator = new StudentComparatorFIO();
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(userComporator);
        return students;
    }

    public List<Student> getSortedByDataStudentGroup() {
        UserComporator<Student> userComporator = new StudentComporatorDate();
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(userComporator);
        return students;
    }


}
