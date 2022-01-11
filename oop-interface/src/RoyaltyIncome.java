
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends BaseIncome{

	public RoyaltyIncome(double income) {
		super(income);
	}

	@Override
	public double getTex() {
		// TODO 自动生成的方法存根
		return income*0.2;
	}
	
	// TODO

}
