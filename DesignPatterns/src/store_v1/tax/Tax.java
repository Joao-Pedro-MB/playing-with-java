package store_v1.tax;

import java.math.BigDecimal;

import store_v1.budget.Budget;

public abstract class Tax {

	private Tax other;

	public Tax(Tax other) {
		this.other = other;
	}

	protected abstract BigDecimal realizarCalculoEspecifico(Budget budget);

	public BigDecimal calculate(Budget budget) {
		BigDecimal valuetax = realizarCalculoEspecifico(budget);
		BigDecimal valueOutrotax = BigDecimal.ZERO;
		if (other != null) {
			valueOutrotax = other.realizarCalculoEspecifico(budget);
		}

		return valuetax.add(valueOutrotax);
	}

}
