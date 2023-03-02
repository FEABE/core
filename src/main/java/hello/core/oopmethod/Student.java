package hello.core.oopmethod;

public class Student {

    int studentID;
    String studentName;
    String address;

    public void showStudentInfo(){
        System.out.println(studentID+studentName+address);
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName=name;
    }

}
