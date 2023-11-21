package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;

// применяем DIP
public interface UserViewGeneral {


    public void sendOnConsole(List<User> userList);

    public void sendOnConsoleUserGroup(StudentGroup studentGroup);

    public void sendOnConsoleListStudent(List<Student> students);


}
