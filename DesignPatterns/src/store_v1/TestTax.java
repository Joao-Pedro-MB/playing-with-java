package store_v1;

import java.math.BigDecimal;

import store_v1.tax.ICMS;
import store_v1.tax.ISS;
import store_v1.tax.Tax;
import store_v1.budget.ItemBudget;
import store_v1.budget.Budget;

public class TestTax {

	public static void main(String[] args) {
		Budget budget = new Budget();
		budget.adicionarItem(new ItemBudget(new BigDecimal("200")));

		Tax tax = new ICMS(new ISS(null));
		System.out.println(tax.calculate(budget));
	}

}
