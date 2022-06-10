package store_v1.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import store_v1.budget.ItemBudget;
import store_v1.budget.Budget;
import store_v1.request.actions.AfterRequestAction;

public class MakeRequestHandler {

	private List<AfterRequestAction> afterRequestAction;

	public MakeRequestHandler(List<AfterRequestAction> afterRequestActions) {
		afterRequestAction = afterRequestActions;
	}

	public void execute(MakeRequest makeRequest) {
		Budget budget = new Budget();
		budget.adicionarItem(new ItemBudget(new BigDecimal("200")));
		Request request = new Request(makeRequest.getClient(), LocalDateTime.now(), budget);

		this.afterRequestAction.forEach(a -> a.execute(request));
	}

}
