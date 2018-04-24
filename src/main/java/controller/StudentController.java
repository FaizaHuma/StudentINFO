package controller;
import data.model.Student;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="StudentControl")

public class StudentController {

    Student st=new Student("A",1);
    Student st1=new Student("B",2);

    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }

    public Student getSt1() {
        return st1;
    }

    public void setSt1(Student st1) {
        this.st1 = st1;
    }

    public String viewINFO()
    {
        return  "view";
    }
}
