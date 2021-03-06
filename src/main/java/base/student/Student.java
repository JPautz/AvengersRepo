package base.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *  Currently not using student class for first prototype
 */
@Entity
public class Student implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int number;
    private String fname;
    private String lname;

//    @OneToMany(targetEntity = Flowchart.class, mappedBy = "student",
//            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Flowchart> flowcharts;

    public Student(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

//    public List<Flowchart> getFlowcharts() {
//        return flowcharts;
//    }

//    public void setFlowcharts(List<Flowchart> flowcharts) {
//        this.flowcharts = flowcharts;
//    }
}
