package static1;

public class Data3 {
    //멤버변수
    public String name; //인스턴스 변수: 인스턴스 수 만큼 존재
    public static int count; //static: 클래스(정적 변수, static 변수) 변수: 딱 하나만 존재, 클래스에서 직접 관리(?)

    public Data3(String name){
        this.name =name;
        count++;
    }
}

