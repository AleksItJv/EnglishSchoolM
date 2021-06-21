package service;

import entity.Student;

import java.util.List;

public interface StudentService {

    void saveStudent(Student student);

    Student getStudent(long id);

    List<Student> getAllStudents();

    List<Student> getAllStudentsByGroup(long idGroup);

    void updateStudent(long id, Student student);

    void deleteStudentByID(long idStudent);

}

