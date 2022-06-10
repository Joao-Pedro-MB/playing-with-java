package store_v1.budget.status;

import java.math.BigDecimal;

import store_v1.DomainException;
import store_v1.budget.Budget;

public class Finalized extends BudgetStatus {

	@Override
	public BigDecimal calculateExtraDiscount(Budget budget) {
		throw new DomainException("Budget Finalized nao pode ter discount extra!");
	}

}