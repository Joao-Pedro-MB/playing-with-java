package store_v1.discount;

import java.math.BigDecimal;

import store_v1.budget.Budget;

public class FiveHundredOrMoreBudgetDiscount extends Discount {

	public FiveHundredOrMoreBudgetDiscount(Discount next) {
		super(next);
	}

	public BigDecimal calculate(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean shouldApply(Budget budget) {
		return budget.getValue().compareTo(new BigDecimal("500")) > 0;
	}

}
