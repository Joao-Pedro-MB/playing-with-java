package store_v1.tax;

import java.math.BigDecimal;

import store_v1.budget.Budget;

public class ISS extends Tax {

	public ISS(Tax other) {
		super(other);
	}
	
	public BigDecimal realizarCalculoEspecifico(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.06"));
	}

}