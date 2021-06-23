package entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "groupst_id")
    private long idGroupst;
    private String fname;
    private String sname;
    private String lname;
    private String phone;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "groupst_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Groupst groupst;

    public Student() {
    }

    public Student(long idGroupst, String fname, String sname, String lname, String phone) {
        this.idGroupst = idGroupst;
        this.fname = fname;
        this.sname = sname;
        this.lname = lname;
        this.phone = phone;
    }

    public Student(long id, long idGroupst, String fname, String sname, String lname, String phone) {
        this.id = id;
        this.idGroupst = idGroupst;
        this.fname = fname;
        this.sname = sname;
        this.lname = lname;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdGroupst() {
        return idGroupst;
    }

    public void setIdGroupst(long idGroup) {
        this.idGroupst = idGroup;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Groupst getGroupst() {
        return groupst;
    }

    public void setGroupst(Groupst groupst) {
        this.groupst = groupst;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", idGroup=" + idGroupst +
                ", fname='" + fname + '\'' +
                ", sname='" + sname + '\'' +
                ", lname='" + lname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

