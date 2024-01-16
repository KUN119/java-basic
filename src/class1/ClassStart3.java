package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        // 클래스를 사용하면 int, String과 같은 새로운 타입을 만들 수 있음!!!!!!!

        Student student1 = new Student(); // 객체(인스턴스) 생성
        student1.name = "학생1"; // .을 통해서 클래스에 접근
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적" + student2.grade);
    }
}
