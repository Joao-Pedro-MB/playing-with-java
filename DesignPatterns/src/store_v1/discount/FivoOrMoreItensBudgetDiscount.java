package store_v1.discount;

import java.math.BigDecimal;

import store_v1.budget.Budget;

public class FivoOrMoreItensBudgetDiscount extends Discount {

	public FivoOrMoreItensBudgetDiscount(Discount next) {
		super(next);
	}

	public BigDecimal calculate(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean shouldApply(Budget budget) {
		return budget.getItensQuantity() > 5;
	}

}
