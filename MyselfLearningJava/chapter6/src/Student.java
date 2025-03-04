public class Student {
    // 필드 (멤버 변수)
    String name;
    int age;
    String studentId;

    // 기본 생성자
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.studentId = "0000";
    }

    // 매개변수가 있는 생성자
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // 학생 정보 출력 메서드
    public void displayInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("학번: " + studentId);
    }
}
