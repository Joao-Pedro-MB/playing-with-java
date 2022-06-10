package store_v1.budget.status;

import java.math.BigDecimal;

import store_v1.DomainException;
import store_v1.budget.Budget;

public class Revoked extends BudgetStatus {

	@Override
	public BigDecimal calculateExtraDiscount(Budget budget) {
		throw new DomainException("Budget Revoked nao pode ter discount extra!");
	}

	@Override
	public void finalize(Budget budget) throws DomainException {
		budget.setStatus(new Finalized());
	}

}