package creational.prototype.DeepThinking;

public interface OrderApi {

    public int getOrderProductNum();

    public void setOrderProductNum(int orderProductNum);

    public OrderApi cloneOrder();

}
