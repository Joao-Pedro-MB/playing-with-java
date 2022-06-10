package store_v1.discount;

import java.math.BigDecimal;

import store_v1.budget.Budget;

public class DiscountCalculator {
	
	public BigDecimal calculate(Budget budget) {
		Discount discount = new FivoOrMoreItensBudgetDiscount(
				new FiveHundredOrMoreBudgetDiscount(
						new NoDiscount()));
		return discount.Calculate(budget);
	}

}
