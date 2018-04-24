package data.model;

public class Student {

    private  int studentID;


    private String sec;

    public Student(String sec,int studentID)
    {
        this.sec=sec;
        this.studentID=studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getSec() {
        return sec;
    }
}
