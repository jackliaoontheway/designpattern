package creational.prototype.DeepThinking;

public class EnterpriseOrder implements OrderApi {

    private String companyName;
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
        EnterpriseOrder order = new EnterpriseOrder();
        order.orderProductNum = this.orderProductNum;
        order.companyName = this.companyName;
        order.productId = this.productId;
        return order;
    }
}
