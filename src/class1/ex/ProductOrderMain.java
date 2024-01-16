package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder americano = new ProductOrder();
        ProductOrder latte = new ProductOrder();
        ProductOrder mocha = new ProductOrder();

        ProductOrder[] productOrders = {americano, latte, mocha};

        americano.productName = "아메리카노";
        americano.price = 4000;
        americano.quantity = 1;

        latte.productName = "라떼";
        latte.price = 4500;
        latte.quantity = 3;

        mocha.productName = "모카";
        mocha.price = 5000;
        mocha.quantity = 1;

        int totalAmount = 0;

        for (ProductOrder product : productOrders) {
            System.out.println("이름:" + product.productName + " | 가격:" + product.price + " | 수량:" + product.quantity);

            totalAmount += product.price * product.quantity;
        }
        System.out.println("총 결제 금액:" + totalAmount);

    }
}
