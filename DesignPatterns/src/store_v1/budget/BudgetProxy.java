package store_v1.budget;

import java.math.BigDecimal;

public class BudgetProxy extends Budget {

	private BigDecimal value;
	private Budget budget;

	public BudgetProxy(Budget budget) {
		this.budget = budget;
	}

	public BigDecimal getValue() {
		if (this.value == null) {
			this.value = budget.getValue();
		}
		return this.value;
	}

}