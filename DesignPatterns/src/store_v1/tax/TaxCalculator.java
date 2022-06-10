package store_v1.tax;

import java.math.BigDecimal;

import store_v1.budget.Budget;

public class TaxCalculator {

	public BigDecimal Calculate(Budget budget, Tax tax) {
		return tax.calculate(budget);
	}

}