package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "groupst")
public class Groupst {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "teacher_id")
    private long idTeacher;
    private String specialization;
    private String ageGroupst;


    @OneToMany(mappedBy = "groupst", fetch = FetchType.EAGER)
    private List<Student> studentList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Teacher teacher;

    public Groupst() {
    }

    public Groupst(long idTeacher, String specialization, String ageGroupst) {
        this.idTeacher = idTeacher;
        this.specialization = specialization;
        this.ageGroupst = ageGroupst;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAgeGroupst() {
        return ageGroupst;
    }

    public void setAgeGroupst(String ageGroup) {
        this.ageGroupst = ageGroup;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", idTeacher=" + idTeacher +
                ", specialization='" + specialization + '\'' +
                ", ageGroup='" + ageGroupst + '\'' +
                '}';
    }
}
