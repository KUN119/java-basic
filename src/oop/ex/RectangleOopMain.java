package oop.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        //사각형의 넓이 구하기
        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);
        //사각형의 둘레 구하기
        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);
        //정사각형인지 아닌지 구하기
        boolean isSquare = rectangle.isSquare();
        System.out.println("정사각형 여부: " + isSquare);
    }
}

