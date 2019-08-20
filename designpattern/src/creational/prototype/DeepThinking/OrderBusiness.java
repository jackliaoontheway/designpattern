package creational.prototype.DeepThinking;

public class OrderBusiness {

    public void saveOrder(OrderApi order) {

        while(order.getOrderProductNum() > 1000) {

            // 这里不需要关系具体的实例, 面向接口
            OrderApi newOrder = order.cloneOrder();

            newOrder.setOrderProductNum(1000);

            order.setOrderProductNum(order.getOrderProductNum() - 1000);
        }

    }



}
