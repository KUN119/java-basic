package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException: bigData.data -> null이기 때문에 null.value -> NullPointerException 발생
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
