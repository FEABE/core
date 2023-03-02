package hello.core.oopmethod;

public class Oopmain {
    public static void main(String[] args) {
        //이게 인스턴스
        Student studentLee = new Student(); // new Student 생성자
        studentLee.studentID=12345;
        studentLee.setStudentName("Lee");
        studentLee.address="부산";

        studentLee.showStudentInfo();
    }
}
