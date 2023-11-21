package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// применяем DIP
public class DataService implements DataServiceGeneral {

    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (User user: this.users){
            if(user instanceof Student){
                if (((Student) user).getStudentId() > countMaxId){
                    countMaxId = ((Student) user).getStudentId();
                }
            }
        }
        countMaxId++;

        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        this.users.add(student);
    }

    public List<Student> getAllStudents() {
        List<Student>  students = new ArrayList<>();
        for (User user : users) {
            if (user instanceof  Student) {
                students.add((Student) user);
            }
        }
        return students;
    }
}
