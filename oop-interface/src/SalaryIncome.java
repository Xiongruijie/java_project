
public class SalaryIncome extends BaseIncome{
	
	public SalaryIncome(double income) {
		super(income);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public double getTex() {
		// TODO �Զ����ɵķ������
		if (income > 5000) {
			return (income - 5000) * 0.1;
		}
		return 0;	
	}
	

}
