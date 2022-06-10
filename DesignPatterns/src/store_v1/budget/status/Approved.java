package store_v1.budget.status;

import java.math.BigDecimal;

import store_v1.DomainException;
import store_v1.budget.Budget;

public class Approved extends BudgetStatus {

	@Override
	public BigDecimal calculateExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void finalize(Budget budget) throws DomainException {
		budget.setStatus(new Finalized());
	}

}