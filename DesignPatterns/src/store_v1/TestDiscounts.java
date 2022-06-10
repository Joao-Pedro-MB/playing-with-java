package store_v1;

import java.math.BigDecimal;

import store_v1.discount.DiscountCalculator;
import store_v1.budget.ItemBudget;
import store_v1.budget.Budget;

public class TestDiscounts {

	public static void main(String[] args) {
		Budget first = new Budget();
		first.adicionarItem(new ItemBudget(new BigDecimal("200")));

		Budget second = new Budget();
		second.adicionarItem(new ItemBudget(new BigDecimal("200")));

		Budget third = new Budget();
		third.adicionarItem(new ItemBudget(new BigDecimal("200")));

		DiscountCalculator calculator = new DiscountCalculator();
		System.out.println(calculator.calculate(first));
		System.out.println(calculator.calculate(second));
		System.out.println(calculator.calculate(third));
	}

}
