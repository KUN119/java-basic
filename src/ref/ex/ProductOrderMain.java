package ref.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createProduct("americano", 4000, 1);
        orders[1] = createProduct("latte", 4500, 1);
        orders[2] = createProduct("mocha", 5000, 2);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createProduct(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();

        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("메뉴명:" + order.productName + " | 가격:" + order.price + " | 수량:" + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;

        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }

        return totalAmount;
    }
}
