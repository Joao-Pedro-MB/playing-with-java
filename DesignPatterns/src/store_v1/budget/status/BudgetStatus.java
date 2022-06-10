package store_v1.budget.status;

import java.math.BigDecimal;

import store_v1.DomainException;
import store_v1.budget.Budget;

public abstract class BudgetStatus {

	public abstract BigDecimal calculateExtraDiscount(Budget budget);
	
	public void approve(Budget budget) throws DomainException {
		throw new DomainException("Budget can't be Approved!");
	}
	
	public void revoke(Budget budget) throws DomainException {
		throw new DomainException("Budget can't be Revoked!");
	}
	
	public void finalize(Budget budget) throws DomainException {
		throw new DomainException("Budget can't be Finalized!");
	}

}
