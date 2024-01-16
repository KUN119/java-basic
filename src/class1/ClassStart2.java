package class1;

import java.sql.Array;

public class ClassStart2 {

    public static void main(String[] args) {
        // 배열과 반복문으로 추가되는 학생 정보의 코드를 줄일 수 있음
        // 이 와중에도 한계가 있는데 한 학생의 정보가 나눠져 있어서 한 학생의 데이터를 변경할 때 3번을 변경해야 함
        // 이러한 한계를 극복하기 위해 class라는 개념을 만든다!!
        String[] studentName = {"학생1", "학생2", "학생3"};
        int[] studentAge = {15, 16, 14};
        int[] studentGrade = {80, 70, 60};

        for (int i = 0; i < studentName.length ; i++) {
            System.out.println("이름:" + studentName[i] + " 나이:" + studentAge[i] + " 성적:" + studentGrade[i]);
        }
    }
}
