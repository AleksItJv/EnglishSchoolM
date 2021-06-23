import connection.HibernateUtil;
import entity.Groupst;
import entity.Student;
import entity.Teacher;
import repository.GroupstRepository;
import repository.StudentRepository;
import repository.TeacherRepository;
import service.GroupstService;
import service.StudentService;
import service.TeacherService;

public class Main {
    public static void main(String[] args) {

        StudentService sr = new StudentRepository();
        GroupstService gs = new GroupstRepository();
        TeacherService ts = new TeacherRepository();



/*        //add all to database
        Teacher teacher = new Teacher("Zoya", "Abramovna", "Spelova", "+8099103");
        Teacher teacher2 = new Teacher("Sara", "Aristarhovna", "Edelman", "+8099104");
        ts.saveTeacher(teacher);
        ts.saveTeacher(teacher2);

        Groupst group1 = new Groupst(1, "English", "oldSchool");
        Groupst group2 = new Groupst(1, "English", "youngSchool");
        Groupst group3 = new Groupst(2, "Spanish", "youngSchool");
        gs.addGroupst(group1);
        gs.addGroupst(group2);
        gs.addGroupst(group3);


        Student student = new Student(2,"Alex", "Fox", "Builder", "101");
        Student student2 = new Student(1, "Ol", "Nik", "Bog","102");

        Student student3 = new Student();
        student3.setIdGroupst(1);
        student3.setFname("Oleg");
        student3.setSname("Nikolaevich");
        student3.setLname("Bogatov");
        student3.setPhone("103");

        Student student4 = new Student();
        student4.setIdGroupst(2);
        student4.setFname("Jacov");
        student4.setSname("Nikolaevich");
        student4.setLname("Istomin");
        student4.setPhone("104");

        sr.saveStudent(student);
        sr.saveStudent(student2);
        sr.saveStudent(student3);
        sr.saveStudent(student4);*/

/*        System.out.println(sr.getStudent(1));
        System.out.println(sr.getStudent(2));

        Student studik = new Student(2, "qwe", "qwer", "qwerty", "123123");
        sr.updateStudent(1, studik);

        sr.deleteStudentByID(18);*/

/*        //test teachers
        Teacher teacherok = new Teacher("fnfnfn", "mn", "ln", "phn");
        ts.updateTeacher(1, teacherok);
        for (Teacher t : ts.getAllTeachers()) {
            System.out.println(t);
        }

        ts.deleteTeacherByID(3);
        for (Teacher t : ts.getAllTeachers()) {
            System.out.println(t);
        }*/

        for (Student st : sr.getAllStudents()) {
            System.out.println(st);
        }

        HibernateUtil.shutdown();
    }
}
