
public class BaseIncome implements Income{
	
	protected double income;
	
	public BaseIncome(double income) {
		this.income = income;
	}

	@Override
	public double getTex() {
		// TODO 自动生成的方法存根
		return income*0.1;
	}
	

}
