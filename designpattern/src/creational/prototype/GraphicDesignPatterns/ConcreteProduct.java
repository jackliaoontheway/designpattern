package creational.prototype.GraphicDesignPatterns;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ConcreteProduct implements Product {

	private String name;
	
	private SubProduct subProduct;
	
	public String getName() {
		return name;
	}
	
	

	public SubProduct getSubProduct() {
		return subProduct;
	}



	public void setSubProduct(SubProduct subProduct) {
		this.subProduct = subProduct;
	}



	public void setName(String name) {
		this.name = name;
	}



	public ConcreteProduct(String name) {
		this.name = name;
	}

	@Override
	public Product createClone() {
		Product product = null;
		try {
			product = (Product) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return product;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		ConcreteProduct concreteProduct = (ConcreteProduct)super.clone();
		concreteProduct.setSubProduct((SubProduct)subProduct.clone());
		return concreteProduct;
	}
	
	/**
	 * 深拷贝通过 ObjectOutputStream
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
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
