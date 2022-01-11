
public class SalaryIncome extends Income {

	public SalaryIncome(double income) {
		super(income);
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
