import connection.HibernateUtil;
import entity.Groupst;
import entity.Student;
import repository.GroupstRepository;
import repository.StudentRepository;
import service.GroupstService;
import service.StudentService;

public class Main {
    public static void main(String[] args) {

        StudentService sR = new StudentRepository();
        GroupstService gs = new GroupstRepository();
/*        Student student = new Student();
        Student student2 = new Student();
        student.setIdGroup(1);
        student.setFname("Oleg");
        student.setSname("Nikolaevich");
        student.setLname("Bogatov");
        student.setPhone("103");
        sR.saveStudent(student);
        student2.setIdGroup(2);
        student2.setFname("Oleg");
        student2.setSname("Nikolaevich");
        student2.setLname("Bogatov");
        student2.setPhone("103");
        sR.saveStudent(student2);*/
        //System.out.println(sR.getStudent(1));
        //System.out.println(sR.getStudent(2));
        Groupst group1 = new Groupst(1, "English", "oldSchool");
        Groupst group2 = new Groupst(3, "English", "youngSchool");
        Groupst group3 = new Groupst(2, "Spanish", "youngSchool");
        gs.addGroupst(group1);
        gs.addGroupst(group2);
        gs.addGroupst(group3);

        Student student = new Student();
        student.setIdGroupst(2);
        student.setFname("Ol");
        student.setSname("Nik");
        student.setLname("Bog");
        student.setPhone("1");
        sR.saveStudent(student);
        sR.saveStudent(student);

        Student studik = new Student(2, "qwe", "qwer", "qwerty", "123123");
        sR.updateStudent(1, studik);

        sR.deleteStudentByID(18);

        for (Student st : sR.getAllStudents()) {
            System.out.println(st);
        }

        for (Student st : sR.getAllStudentsByGroup(2)) {
            System.out.println(st);
        }

        HibernateUtil.shutdown();
    }
}
