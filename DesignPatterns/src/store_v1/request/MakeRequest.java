package store_v1.request;

import java.math.BigDecimal;

public class MakeRequest {

	private String client;
	private BigDecimal budgetValue;
	private int itemQuantity;

	public MakeRequest(String client, BigDecimal budgetValue, int itemQuantity) {
		this.client = client;
		this.budgetValue = budgetValue;
		this.itemQuantity = itemQuantity;
	}

	public String getClient() {
		return client;
	}

	public BigDecimal getValueBudget() {
		return budgetValue;
	}

	public int getItensQuantity() {
		return itemQuantity;
	}

}
