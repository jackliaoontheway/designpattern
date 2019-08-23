package structural.proxy.DeepThinking.dynamic;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();

        // 创建一个动态代理
        DynamicProxy proxy = new DynamicProxy();

        // 通过 getProxyInterface 将订单和动态代理关联起来
        OrderApi orderApi = proxy.getProxyInterface(order);

        orderApi.doSomething();
    }



}
