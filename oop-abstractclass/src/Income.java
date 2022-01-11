
/**
 * 定义抽象类Income
 */
public abstract class Income {

	// TODO
	protected double income;
	
	public Income(double income) {
		// TODO 自动生成的构造函数存根
		this.income = income;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public abstract double getTex();
	
}
