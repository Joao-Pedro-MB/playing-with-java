package store_v1.request.actions;

import store_v1.request.Request;

public class CreateBankRequest implements AfterRequestAction {

	public void execute(Request request) {
		System.out.println("Saving Request in data bank...");
	}

}
