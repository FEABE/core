package hello.core.oopmethod;

public class Oopmain {
    public static void main(String[] args) {
        //이게 인스턴스
        Student studentLee = new Student(); // new Student 생성자
        studentLee.studentID=12345;
        studentLee.setStudentName("Lee");
        studentLee.address="부산";

        studentLee.showStudentInfo();

        Order gaRa = new Order(123,"01048000336","부산광역시 해운대구","20231022","13:00:000",40000,052147);
        System.out.println(gaRa.showOrderInfo());


    }
}
