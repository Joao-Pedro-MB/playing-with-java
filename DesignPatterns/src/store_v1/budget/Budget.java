package store_v1.budget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import store_v1.budget.status.Analizing;
import store_v1.budget.status.Finalized;
import store_v1.budget.status.BudgetStatus;

public class Budget implements Budgetable {

	private List<Budgetable> itens = new ArrayList<>();
	private BigDecimal value = BigDecimal.ZERO;
	private BudgetStatus Status;

	public Budget() {
		this.Status = new Analizing();
	}

	public void applyExtreDiscount() {
		BigDecimal extraDiscount = this.Status.calculateExtraDiscount(this);
		this.value = this.value.subtract(extraDiscount);
	}

	public void approve() {
		this.Status.approve(this);
	}

	public void revoke() {
		this.Status.revoke(this);
	}

	public void finalize() {
		this.Status.finalize(this);
	}

	public BigDecimal getValue() {
		try {
			Thread.sleep(3000);
			return this.value;
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public int getItensQuantity() {
		return itens.size();
	}

	public BudgetStatus getStatus() {
		return Status;
	}

	public void setStatus(BudgetStatus Status) {
		this.Status = Status;
	}

	public boolean isFinalized() {
		return this.Status instanceof Finalized;
	}

	public void adicionarItem(Budgetable item) {
		this.value = this.value.add(item.getValue());
		this.itens.add(item);
	}

}