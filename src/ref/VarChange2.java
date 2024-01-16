package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; //결국 같은 참조 값을 가르키기 때문에 두 변수는 같은 인스턴스를 참조하게 된다,,

        System.out.println("dataA 참조값 = " + dataA); // x001
        System.out.println("dataA 참조값 = " + dataB); // x001
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataB.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 10

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 30
    }
}
