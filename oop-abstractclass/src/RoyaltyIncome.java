
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends Income {

	public RoyaltyIncome(double income) {
		super(income);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public double getTex() {
		// TODO 自动生成的方法存根
		return income*0.2;
	}

}
