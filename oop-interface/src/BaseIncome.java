
public class BaseIncome implements Income{
	
	protected double income;
	
	public BaseIncome(double income) {
		this.income = income;
	}

	@Override
	public double getTex() {
		// TODO �Զ����ɵķ������
		return income*0.1;
	}
	

}
