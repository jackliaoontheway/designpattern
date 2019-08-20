package creational.prototype.DeepThinking;

import java.io.*;

public class JdkPrototype implements Cloneable{
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        JdkPrototype prototype = new JdkPrototype();
        prototype.setId(100);
        prototype.setName("jack");
        try{
            JdkPrototype newObject = (JdkPrototype)prototype.clone();
            System.out.println(newObject.getId() + newObject.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 如果需要在clone的时候做一些特殊赋值 比如深拷贝的时候重写 clone 方法
        // 如果没有特殊需要 则只需要实现Cloneable接口即可 使用Object 默认的clone方法
        return super.clone();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
