package behavioral.chaiofresponsibility.GraphicDesignPatterns;

public abstract class Support {

	private String name;
	private Support next;

	public Support(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Support getNext() {
		return next;
	}

	public Support setNext(Support next) {
		this.next = next;
		return this;
	}

	/**
	 * 这里用到了模板方法模式
	 */
	public final void support(Trouble trouble) {
		if (resolve(trouble)) {
			done(trouble);
		} else if (this.next != null) {
			// 这里是调用 support 不是调用 resolve
			next.support(trouble);
		} else {
			fail(trouble);
		}
	}

	private void fail(Trouble trouble) {
		System.out.println(trouble.getNumber() + "is fail" + this.getName());
	}

	private void done(Trouble trouble) {
		System.out.println(trouble.getNumber() + "is done" + this.getName());
	}

	protected abstract boolean resolve(Trouble trouble);

}
