package ru.gb.oseminar.service;


import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.User;

import java.time.LocalDate;
import java.util.List;

// применяем DIP
public interface DataServiceGeneral {
    List<User> getAll();
    List<Student> getAllStudents();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
