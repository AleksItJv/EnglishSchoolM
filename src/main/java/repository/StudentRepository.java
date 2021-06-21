package repository;

import connection.HibernateUtil;
import entity.Student;
import org.hibernate.Session;
import service.StudentService;

import java.util.List;

public class StudentRepository implements StudentService {


    @Override
    public void saveStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Student getStudent(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Student student = session.get(Student.class, id);

        session.close();
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List<Student> studentList = session.createQuery("from Student").list();

        session.getTransaction().commit();
        session.close();

        return studentList;
    }

    @Override
    public List<Student> getAllStudentsByGroup(long idGroup) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List<Student> studentList = session.createQuery("from Student where idGroupst = :idGroup")
                .setParameter("idGroup", idGroup)
                .list();

        session.getTransaction().commit();
        session.close();

        return studentList;
    }

    public void updateStudent(long id, Student student) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Student studentEnt;
        if ((studentEnt = session.get(Student.class, id)) != null) {
            studentEnt.setIdGroupst(student.getIdGroupst());
            studentEnt.setFname(student.getFname());
            studentEnt.setSname(student.getSname());
            studentEnt.setLname(student.getLname());
            studentEnt.setPhone(student.getPhone());

            session.saveOrUpdate(studentEnt);
        }
        session.getTransaction().commit();
    }

    @Override
    public void deleteStudentByID(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Student student;
        if ((student = session.get(Student.class, id)) != null) {
            session.delete(student);
        }
        session.getTransaction().commit();
        session.close();
    }
}
