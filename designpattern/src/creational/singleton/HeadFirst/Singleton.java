package creational.singleton.HeadFirst;

public class Singleton {

    /**
     * 当uniqueInstance变量被初始化成Singleton实例时 多个线程正确地处理uniqueInstance
     * volatile 修饰的变量对多个线程可见
     */
    private volatile static Singleton uniqueInstance = null;

    /**
     * eager model
     * private  static Singleton uniqueInstance = new Singleton();
     */

    private Singleton() {

    }


    /**
     * lazy model
     * 双重检查 加锁
     * 不适用于 Java1.4，及以下，1.4的Java 许多JVM对于volatile关键字的实现会导致双重检查加锁失效
     *
     * @return
     */
    public static Singleton getInstance() {
        // 双重判断
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                // 双重判断
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    /**
     * lazy model
     * 同步 getInstance() 方法，每次调用都是同步，影响性能
     *
     * @return
     */
    public static synchronized Singleton getInstance2() {
        if (uniqueInstance == null) {
            if (uniqueInstance == null) {
                uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }

}
