package repository;

import connection.HibernateUtil;
import entity.Groupst;
import entity.Student;
import entity.Teacher;
import org.hibernate.Session;
import service.TeacherService;

import java.util.List;

public class TeacherRepository implements TeacherService {

    @Override
    public void saveTeacher(Teacher teacher) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.save(teacher);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Teacher getTeacher(long id) {
        return null;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List<Teacher> teacherList = session.createQuery("from Teacher").list();


        session.getTransaction().commit();
        session.close();

        return teacherList;
    }

    @Override
    public void updateTeacher(long id, Teacher teacher) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Teacher teacherUp;
        if ((teacherUp = session.get(Teacher.class, id)) != null) {
            teacherUp.setFirstName(teacher.getFirstName());
            teacherUp.setMidName(teacher.getMidName());
            teacherUp.setLastName(teacher.getLastName());
            teacherUp.setPhone(teacher.getPhone());

            session.saveOrUpdate(teacherUp);
        }
        session.getTransaction().commit();
    }

    @Override
    public void deleteTeacherByID(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Teacher teacherUp;
        if ((teacherUp = session.get(Teacher.class, id)) != null) {
            session.delete(teacherUp);
        }
        session.getTransaction().commit();
        session.close();
    }
}
