package store_v1.budget.status;

import java.math.BigDecimal;

import store_v1.DomainException;
import store_v1.budget.Budget;

public class Analizing extends BudgetStatus {

	@Override
	public BigDecimal calculateExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}

	@Override
	public void approve(Budget budget) throws DomainException {
		budget.setStatus(new Approved());
	}
	
	@Override
	public void revoke(Budget budget) throws DomainException {
		budget.setStatus(new Revoked());
	}

}
