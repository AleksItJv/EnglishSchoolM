package service;

import entity.Teacher;

import java.util.List;

public interface TeacherService {

    void saveTeacher(Teacher teacher);

    Teacher getTeacher(long id);

    List<Teacher> getAllTeachers();

    void updateTeacher(long id, Teacher student);

    void deleteTeacherByID(long id);

}
