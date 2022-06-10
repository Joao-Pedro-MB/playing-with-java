package store_v1.discount;

import java.math.BigDecimal;

import store_v1.budget.Budget;

public class NoDiscount extends Discount {

	public NoDiscount() {
		super(null);
	}

	public BigDecimal calculate(Budget budget) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean shouldApply(Budget budget) {
		return true;
	}

}
