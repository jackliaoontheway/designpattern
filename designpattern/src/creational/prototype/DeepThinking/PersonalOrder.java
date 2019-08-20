package creational.prototype.DeepThinking;

public class PersonalOrder implements  OrderApi {

    private String customerName;
    private String productId;
    private int orderProductNum = 0;

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    @Override
    public OrderApi cloneOrder() {
        PersonalOrder order = new PersonalOrder();
        order.customerName = this.customerName;
        order.productId = this.productId;
        order.orderProductNum = this.orderProductNum;
        return order;
    }
}
