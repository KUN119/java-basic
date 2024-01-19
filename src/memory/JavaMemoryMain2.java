package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start"); //1
        method1();
        System.out.println("main end"); //7
    }

    static void method1() {
        System.out.println("method1 start"); //2
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end"); //6
    }

    static void method2(Data data2) {
        System.out.println("method2 start"); //3
        System.out.println("data.value=" + data2.getValue()); //4
        System.out.println("method2 end"); //5
    }
}