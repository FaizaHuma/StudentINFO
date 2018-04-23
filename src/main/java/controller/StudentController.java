package controller;
import data.model.Student;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="StudentControl")

public class StudentController {

    Student st=new Student();

    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }

    public  String viewINFO()
    {
        return "view";
    }
}
