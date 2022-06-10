package store_v1.request;

import java.time.LocalDateTime;

import store_v1.budget.Budget;

public class Request {

	private String client;
	private LocalDateTime data;
	private Budget budget;

	public Request(String client, LocalDateTime data, Budget budget) {
		this.client = client;
		this.data = data;
		this.budget = budget;
	}

	public String getClient() {
		return client;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Budget getBudget() {
		return budget;
	}

}
