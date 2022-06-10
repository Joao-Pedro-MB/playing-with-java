package store_v1.discount;

import java.math.BigDecimal;

import store_v1.budget.Budget;

public abstract class Discount {

	protected Discount next;

	public Discount(Discount next) {
		this.next = next;
	}

	public BigDecimal Calculate(Budget budget) {
		if (shouldApply(budget)) {
			return calculate(budget);
		}
		
		return next.calculate(budget);
	}
	
	public abstract BigDecimal calculate(Budget budget);
	public abstract boolean shouldApply(Budget budget);

}
