package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.DataServise;
import ru.gb.oseminar.service.DataServiceGeneral;
import ru.gb.oseminar.service.StudentGroupService;
import ru.gb.oseminar.service.StudentGroupServiceGeneral;
import ru.gb.oseminar.view.UserView;
import ru.gb.oseminar.view.UserViewGeneral;

import java.time.LocalDate;
import java.util.List;
// применяем DIP


public class UserController {

    private final DataServiceGeneral dataService = new DataServise();
    private final StudentGroupServiceGeneral studentGroupService = new StudentGroupService();
    private final UserViewGeneral userView = new UserView();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
//        List<User> userList = dataService.getAll();
//        userView.sendOnConsole(userList);
    }

    public void printStudentGroup() {
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher){
        List<Student> students = dataService.getAllStudents();
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }
}
