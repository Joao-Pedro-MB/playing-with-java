package store_v1.budget;

import java.util.Map;

import store_v1.DomainException;
import store_v1.http.HttpAdapter;

public class RegisterBudget {

	private HttpAdapter httpAdapter;

	public RegisterBudget(HttpAdapter httpAdapter) {
		this.httpAdapter = httpAdapter;
	}

	public void registrar(Budget budget) {
		if (!budget.isFinalized()) {
			throw new DomainException("Budget can't be registered if not yet finalized!");
		}

		String urlApi = "http://api.xyz/budget";
		Map<String, Object> apiData = Map.of(
			"value", budget.getValue(),
			"itemQuantity", budget.getItensQuantity()
		);

		httpAdapter.post(urlApi, apiData);
	}

}