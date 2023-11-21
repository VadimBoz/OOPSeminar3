package ru.gb.oseminar;

import ru.gb.oseminar.controller.UserController;
import ru.gb.oseminar.data.Teacher;

import java.time.LocalDate;

public class program {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.createStudent("5", "5", "9", LocalDate.of(1900, 2, 6));
        userController.createStudent("2", "2", "9", LocalDate.of(1900, 2, 6));
        userController.createStudent("3", "3", "9", LocalDate.of(1900, 2, 6));

//        userController.printStudentGroup();
        userController.createStudentGroup(new Teacher("8", "8", "8", LocalDate.of(1970, 4,2)));
        System.out.println(userController.getSortedListByFIOStudentFromStudentGroup());
    }
}
