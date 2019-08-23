package structural.proxy.DeepThinking.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    // 被代理的对象
    private OrderApi order;

    public OrderApi getProxyInterface(Order order) {
        // 设置被代理的对象
        this.order = order;

        // 把真正的订单对象和动态代理关联起来，this
        OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(
                order.getClass().getClassLoader(),
                order.getClass().getInterfaces(),this);
        return orderApi;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().startsWith("set")) {
            //控制访问

        }
        method.invoke(order,args);
        return null;
    }
}
