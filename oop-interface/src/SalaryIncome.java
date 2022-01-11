
public class SalaryIncome extends BaseIncome{
	
	public SalaryIncome(double income) {
		super(income);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public double getTex() {
		// TODO 自动生成的方法存根
		if (income > 5000) {
			return (income - 5000) * 0.1;
		}
		return 0;	
	}
	

}
